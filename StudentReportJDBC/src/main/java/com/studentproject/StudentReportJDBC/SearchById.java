package com.studentproject.StudentReportJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SearchById {

    public static void run() throws Exception {
        Scanner sc = new Scanner(System.in);
        Connection con = DbConnection.getConnection();

        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        String q = "SELECT * FROM student WHERE ID=?";
        PreparedStatement ps = con.prepareStatement(q);
        ps.setInt(1, id);

        ResultSet rs = ps.executeQuery();
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
