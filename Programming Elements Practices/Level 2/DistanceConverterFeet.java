import java.util.Scanner;

public class DistanceConverterFeet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = input.nextDouble();
        double yards = distanceInFeet / 3;
        double miles = distanceInFeet / (1760 * 3);
        System.out.println("The distance in yards is " + yards + " while the distance in miles is " + miles);
        input.close();
    }
}
