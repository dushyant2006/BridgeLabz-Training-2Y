package com.studentproject.StudentReportJDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/java",
            "root",
            "Krishna@singh123"
        );
        return con;
    }
}
