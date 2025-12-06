package com.studentproject.StudentReportJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateStudent {

    public static void run() throws Exception {
        Scanner sc = new Scanner(System.in);
        Connection con = DbConnection.getConnection();

        System.out.print("Enter ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("New Name: ");
        String name = sc.nextLine();

        System.out.print("New Age: ");
        int age = sc.nextInt();

        System.out.print("New Marks: ");
        int marks = sc.nextInt();

        String q = "UPDATE student SET NAME=?, AGE=?, Marks=? WHERE ID=?";
        PreparedStatement ps = con.prepareStatement(q);
        ps.setString(1, name);
        ps.setInt(2, age);
        ps.setInt(3, marks);
        ps.setInt(4, id);

        ps.executeUpdate();
        System.out.println("Student Updated");
    }
}
