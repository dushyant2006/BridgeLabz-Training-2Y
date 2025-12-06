package com.studentproject.StudentReportJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertStudent {

    public static void run() throws Exception {
        Scanner sc = new Scanner(System.in);
        Connection con = DbConnection.getConnection();

        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        String q = "INSERT INTO student(ID, NAME, AGE, Marks) VALUES(?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(q);
        ps.setInt(1, id);
        ps.setString(2, name);
        ps.setInt(3, age);
        ps.setInt(4, marks);

        ps.executeUpdate();
        System.out.println("Student Inserted");
    }
}
