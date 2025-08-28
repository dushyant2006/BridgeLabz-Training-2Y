import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                System.out.print(numbers[i] + " is positive and ");
                if (numbers[i] % 2 == 0) {
                    System.out.println("even");
                } else {
                    System.out.println("odd");
                }
            } else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is negative");
            } else {
                System.out.println(numbers[i] + " is zero");
            }
        }
        if (numbers[0] == numbers[numbers.length - 1]) {
            System.out.println("First and last elements are equal");
        } else if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println("First element is greater than last");
        } else {
            System.out.println("First element is less than last");
        }
        sc.close();
    }
}
