package com.studentproject.StudentReportJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SearchByName {

    public static void run() throws Exception {
        Scanner sc = new Scanner(System.in);
        Connection con = DbConnection.getConnection();

        System.out.print("Enter Name: ");
        sc.nextLine();
        String name = sc.nextLine();

        String q = "SELECT * FROM student WHERE NAME=?";
        PreparedStatement ps = con.prepareStatement(q);
        ps.setString(1, name);

        ResultSet rs = ps.executeQuery();
        boolean found = false;
        while (rs.next()) {
            found = true;
            System.out.println("ID: " + rs.getInt("ID"));
            System.out.println("Name: " + rs.getString("NAME"));
            System.out.println("Age: " + rs.getInt("AGE"));
            System.out.println("Marks: " + rs.getInt("Marks"));
            System.out.println();
        }
        if (!found) {
            System.out.println("No student found");
        }
    }
}
