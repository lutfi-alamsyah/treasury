// package service;
package project.service;

// for netbeans ^

import java.sql.ResultSet;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;

public class PersonService extends Service {
    public Integer idData[] = null;
    private String message = "";

    public ResultSet getData() {
        ResultSet data = null;
        try {
            CallableStatement callstate = connection().prepareCall("{call SelectPerson}",
                    ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

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
            PreparedStatement prestate = connection().prepareStatement("SELECT id, name FROM person",
                    ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            ResultSet data = prestate.executeQuery();

            int size = 0;
            if (data.last()) {
                size = data.getRow();
                data.beforeFirst();
            }

            nameData = new String[size];
            idData = new Integer[size];
            for (int i = 0; i < size; i++) {
                data.next();
                nameData[i] = data.getString("name");
                idData[i] = data.getInt("id");
            }

            connection().close();
        } catch (Exception e) {
            System.out.println("something wrong the message is: " + e);
        }
        return nameData;
    }

    public ResultSet getDetailData(Integer id) {
        ResultSet data = null;
        try {
            CallableStatement callstate = connection().prepareCall("{call SelectDetailPerson(?)}");
            callstate.setInt(1, id);
            data = callstate.executeQuery();

            connection().close();
        } catch (Exception e) {
            System.out.println("something wrong the message is: " + e);
        }
        return data;
    }

    public String insertData(String nama, String alamat, int phone_number, String catatan) {
        try {
            CallableStatement callstate = connection().prepareCall("{call AddPerson(?, ?, ?, ?)}");

            callstate.setString(1, nama);
            callstate.setString(2, alamat);
            callstate.setInt(3, phone_number);
            callstate.setString(4, catatan);

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

    public String updateData(int key, String alamat, int phone_number, String nama, String catatan) {
        try {
            CallableStatement callstate = connection().prepareCall("{call UpdatePerson(?, ?, ?, ?, ?)}");

            callstate.setString(1, nama);
            callstate.setString(2, alamat);
            callstate.setInt(3, phone_number);
            callstate.setString(4, catatan);
            callstate.setInt(5, key);

            Integer statusQuery = callstate.executeUpdate();

            if (statusQuery > 0) {
                message = "data berhasil di update";
            }

            connection().close();
        } catch (Exception e) {
            message = "something wrong the message is: " + e;
        }

        return message;
    }

    public String destroyData(int key) {
        // note: pake transaction buat apus data debt sama Person dari user tertentu
        // sekalian
        try {
            connection().setAutoCommit(false);

            try (PreparedStatement prestate = connection().prepareStatement("DELETE FROM debt WHERE person_id = ?")) {
                prestate.setInt(1, key);
                prestate.executeUpdate();

                try (PreparedStatement prestate2 = connection()
                        .prepareStatement("DELETE FROM treasury WHERE person_id = ?")) {
                    prestate2.setInt(1, key);
                    prestate2.executeUpdate();

                    try (CallableStatement callstate = connection().prepareCall("{call DeletePerson(?)}")) {
                        callstate.setInt(1, key);
                        callstate.executeUpdate();

                        connection().commit();
                        message = "data berhasil di delete";
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e);
            message = "something wrong the message is: " + e;
        }

        return message;
    }
}