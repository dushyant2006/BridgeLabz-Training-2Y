package com.studentproject.StudentReportJDBC;

import java.util.Scanner;

public class StudentRunner {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n--- STUDENT MENU ---");
            System.out.println("1. Create Table");
            System.out.println("2. Insert Student");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Show All Students");
            System.out.println("6. Search By ID");
            System.out.println("7. Search By Name");
            System.out.println("8. Marks Greater Than");
            System.out.println("9. Show Topper");
            System.out.println("10. Delete All");
            System.out.println("11. Exit");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();
            sc.nextLine();

            if (ch == 1) CreateTable.run();
            else if (ch == 2) InsertStudent.run();
            else if (ch == 3) UpdateStudent.run();
            else if (ch == 4) DeleteStudent.run();
            else if (ch == 5) ShowAll.run();
            else if (ch == 6) SearchById.run();
            else if (ch == 7) SearchByName.run();
            else if (ch == 8) MarksGreater.run();
            else if (ch == 9) ShowTopper.run();
            else if (ch == 10) DeleteAll.run();
            else if (ch == 11) {
                System.out.println("Exiting...");
                sc.close();
                System.exit(0);
            } 
            else {
                System.out.println("Invalid choice");
            }
        }
    }
}
