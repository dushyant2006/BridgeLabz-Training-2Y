import java.util.Scanner;

public class TriangularPark {
    public static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        double distance = 5000; // 5 km in meters
        return distance / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side 1 of triangle (in meters): ");
        double side1 = sc.nextDouble();

        System.out.print("Enter side 2 of triangle (in meters): ");
        double side2 = sc.nextDouble();

        System.out.print("Enter side 3 of triangle (in meters): ");
        double side3 = sc.nextDouble();

        double rounds = calculateRounds(side1, side2, side3);
        System.out.println("The athlete must complete " + Math.ceil(rounds) + " rounds to cover 5 km.");
    }
}

