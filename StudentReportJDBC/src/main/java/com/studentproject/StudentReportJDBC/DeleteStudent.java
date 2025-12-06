package com.studentproject.StudentReportJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteStudent {

    public static void run() throws Exception {
        Scanner sc = new Scanner(System.in);
        Connection con = DbConnection.getConnection();

        System.out.print("Enter ID to delete: ");
        int id = sc.nextInt();

        String q = "DELETE FROM student WHERE ID=?";
        PreparedStatement ps = con.prepareStatement(q);
        ps.setInt(1, id);

        ps.executeUpdate();
        System.out.println("Student Deleted");
    }
}
