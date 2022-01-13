// package service;
package project.service;

// for netbeans ^

import java.sql.*;

public class Service {
    public Connection connection() {
        Connection connection = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=treasury", "sa",
                    "IniPasswordSA}");
        } catch (Exception e) {
            System.out.println("Connection failed: " + e);
        }
        return connection;
    }

    public Statement statement() {
        Statement state = null;
        try {
            state = connection().createStatement();
        } catch (Exception e) {
            System.out.println("Statement failed: " + e);
        }
        return state;
    }
}
