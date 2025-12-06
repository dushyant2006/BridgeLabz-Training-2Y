package com.studentproject.StudentReportJDBC;

import java.sql.Connection;
import java.sql.Statement;

public class CreateTable {

    public static void run() throws Exception {
        Connection con = DbConnection.getConnection();
        Statement st = con.createStatement();
        String q = "CREATE TABLE IF NOT EXISTS student(ID INT, NAME VARCHAR(100), AGE INT, Marks INT)";
        st.executeUpdate(q);
        System.out.println("Table Created");
    }
}
