// package service;
package project.service;

import java.sql.CallableStatement;

// for netbeans ^

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DebtService extends Service {
    public Integer percentLunas = 0, percentBelomLunas = 0;
    private String message = "";

    public DebtService() {
        try {
            Integer lunas = getPercentData("lunas");
            Integer belomLunas = getPercentData("belum");
            Integer countTotal = getCountStatus();

            percentLunas = (lunas * 100) / countTotal;
            percentBelomLunas = (belomLunas * 100) / countTotal;

        } catch (Exception e) {
            System.out.println("something wrong the message is: " + e);
        }
    }

    public ResultSet getData() {
        ResultSet data = null;
        try {
            CallableStatement callstate = connection().prepareCall("{call SelectDebt}",
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
            CallableStatement callstate = connection().prepareCall("{call SelectDetailDebt(?)}");
            callstate.setInt(1, id);
            data = callstate.executeQuery();

            connection().close();
        } catch (Exception e) {
            System.out.println("something wrong the message is: " + e);
        }
        return data;
    }

    public String insertData(int person_id, String jumlah_pinjaman, String status) {
        try {
            CallableStatement callstate = connection().prepareCall("{call AddDebt(?, ?, ?)}");

            callstate.setInt(1, person_id);
            callstate.setString(2, jumlah_pinjaman);
            callstate.setString(3, status);

            Integer statusQuery = callstate.executeUpdate();

            if (statusQuery > 0) {
                message = "data berhasil di tambah";
            }

            // connection().close();
        } catch (Exception e) {
            message = "something wrong the message is: " + e;
        }

        return message;
    }

    public String updateData(int key, int person_id, String jumlah_pinjaman, String status) {
        try {
            CallableStatement callstate = connection().prepareCall("{call UpdateDebt(?, ?, ?, ?)}");

            callstate.setInt(1, person_id);
            callstate.setInt(2, Integer.parseInt(jumlah_pinjaman));
            callstate.setString(3, status);
            callstate.setInt(4, key);

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
        try {
            CallableStatement callstate = connection().prepareCall("{call DeleteDebt(?)}");
            callstate.setInt(1, key);
            Integer status = callstate.executeUpdate();

            if (status > 0) {
                message = "data berhasil di delete";
            }

            connection().close();
        } catch (Exception e) {
            message = "something wrong the message is: " + e;
        }

        return message;
    }

    public Integer getPercentData(String status) {
        Integer percentData = 0;
        try {
            PreparedStatement prestate = connection()
                    .prepareStatement("SELECT COUNT(status) AS status FROM debt WHERE status = ?");

            prestate.setString(1, status);

            ResultSet data = prestate.executeQuery();
            data.next();
            percentData = data.getInt("status");

        } catch (Exception e) {
            System.out.println("something wrong the message is: " + e);
        }

        return percentData;
    }

    public Integer getCountStatus() {
        Integer countStatus = 0;
        try {
            PreparedStatement prestate = connection().prepareStatement("SELECT COUNT(status) AS status FROM debt");

            ResultSet data = prestate.executeQuery();
            data.next();
            countStatus = data.getInt("status");

            connection().close();
        } catch (Exception e) {
            System.out.println("something wrong the message is: " + e);
        }

        return countStatus;
    }
}