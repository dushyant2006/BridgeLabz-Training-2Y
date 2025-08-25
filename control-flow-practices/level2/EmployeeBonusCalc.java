import java.util.Scanner;

class EmployeeBonusCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter years of service: ");
        int service = sc.nextInt();

        double bonus = 0;

        if (service > 5) {
            bonus = (salary * 5) / 100;
            System.out.println("Bonus = " + bonus);
        } else {
            System.out.println("Bonus = 0");
        }

        sc.close();
    }
}
