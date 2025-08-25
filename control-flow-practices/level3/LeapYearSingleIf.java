import java.util.Scanner;

class LeapYearSingleIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        if (year >= 1582 && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println("Leap Year");
        } else if (year >= 1582) {
            System.out.println("Not a Leap Year");
        } else {
            System.out.println("Invalid Year");
        }
        sc.close();
    }
}
