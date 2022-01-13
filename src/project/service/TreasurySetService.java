// package service;
package project.service;

// for netbeans ^

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TreasurySetService extends Service {
    public Integer idData[] = null, totalData[] = null;
    private String message = "";

    public ResultSet getData() {
        ResultSet data = null;
        try {
            CallableStatement callstate = connection().prepareCall("{call Selecttreasury_set}",
                    ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            data = callstate.executeQuery();
            connection().close();
        } catch (Exception e) {
            System.out.println("something wrong the message is: " + e);
        }
        return data;
    }

    public ResultSet getDetailData(Integer id) {
        ResultSet data = null;
        try {
            CallableStatement callstate = connection().prepareCall("{call SelectDetailtreasury_set(?)}");
            callstate.setInt(1, id);
            data = callstate.executeQuery();

            connection().close();
        } catch (Exception e) {
            System.out.println("something wrong the message is: " + e);
        }
        return data;
    }

    public String[] getName() {
        String nameData[] = null;
        try {
            PreparedStatement prestate = connection().prepareStatement("SELECT * FROM treasury_set",
                    ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            ResultSet data = prestate.executeQuery();

            int size = 0;
            if (data.last()) {
                size = data.getRow();
                data.beforeFirst();
            }

            nameData = new String[size];
            idData = new Integer[size];
            totalData = new Integer[size];

            for (int i = 0; i < size; i++) {
                data.next();
                idData[i] = data.getInt("id");
                nameData[i] = data.getString("name");
                totalData[i] = data.getInt("treasury_total");
            }

            connection().close();
        } catch (Exception e) {
            System.out.println("something wrong the message is: " + e);
        }
        return nameData;
    }

    public String insertData(String name, int treasury_total) {
        try {
            CallableStatement callstate = connection().prepareCall("{call Addtreasury_set(?, ?)}");

            callstate.setString(1, name);
            callstate.setInt(2, treasury_total);

            Integer statusQuery = callstate.executeUpdate();

            if (statusQuery > 0) {
                message = "data berhasil di tambah";
            }

            connection().close();
        } catch (Exception e) {
            message = "something wrong the message is: " + e;
        }

        return message;
    }

    public String updateData(int key, String name, int treasury_total) {
        ManagementService mService = new ManagementService();
        ResultSet data = mService.getDetailTreasuryForSet(key);

        try {
            connection().setAutoCommit(false);
            try (CallableStatement callstate = connection().prepareCall("{call Updatetreasury_set(?, ?, ?)}");) {
                callstate.setString(1, name);
                callstate.setInt(2, treasury_total);
                callstate.setInt(3, key);
                callstate.executeUpdate();

                int size = 0, counta = 0;
                if (data.last()) {
                    size = data.getRow();
                    data.beforeFirst();
                }

                try (PreparedStatement prestate = connection()
                        .prepareStatement("UPDATE treasury SET kekurangan = ? WHERE id = ?")) {
                    for (int i = 0; i < size; i++) {
                        data.next();
                        counta++;
                        prestate.setInt(1, treasury_total - data.getInt("total_bayar"));
                        prestate.setInt(2, data.getInt("id"));

                        prestate.executeUpdate();
                    }
                } catch (Exception e) {
                    message = e.getMessage();
                }

                if (size == counta) {
                    connection().commit();
                    message = "data berhasil di update";
                }
            } catch (Exception e) {
                message = e.getMessage();
            }
        } catch (Exception e) {
            message = "something wrong the message is: " + e;
        }

        return message;
    }

    public String destroyData(int key) {
        try {
            connection().setAutoCommit(false);
            try (PreparedStatement prestate2 = connection()
                    .prepareStatement("DELETE FROM treasury WHERE treasury_set_id = ?")) {
                prestate2.setInt(1, key);
                prestate2.executeUpdate();

                try (CallableStatement callstate = connection().prepareCall("{call Deletetreasury_set(?)}")) {
                    callstate.setInt(1, key);
                    callstate.executeUpdate();

                    connection().commit();
                    message = "data berhasil di delete";
                }
            }
        } catch (Exception e) {
            message = "something wrong the message is: " + e.getMessage();
        }

        return message;
    }
}