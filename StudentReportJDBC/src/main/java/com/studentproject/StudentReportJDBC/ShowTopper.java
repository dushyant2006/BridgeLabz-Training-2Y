package com.studentproject.StudentReportJDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ShowTopper {

    public static void run() throws Exception {
        Connection con = DbConnection.getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM student ORDER BY Marks DESC LIMIT 1");

        if (rs.next()) {
            System.out.println("ID: " + rs.getInt("ID"));
            System.out.println("Name: " + rs.getString("NAME"));
            System.out.println("Age: " + rs.getInt("AGE"));
            System.out.println("Marks: " + rs.getInt("Marks"));
        } else {
            System.out.println("No student found");
        }
    }
}
