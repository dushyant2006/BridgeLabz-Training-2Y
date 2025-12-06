package com.studentproject.StudentReportJDBC;

import java.sql.Connection;
import java.sql.Statement;

public class DeleteAll {

    public static void run() throws Exception {
        Connection con = DbConnection.getConnection();
        Statement st = con.createStatement();
        st.executeUpdate("DELETE FROM student");
        System.out.println("All records deleted");
    }
}
