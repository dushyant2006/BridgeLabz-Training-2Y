import java.util.Scanner;

public class FactorsOfNumber {

    public static int[] getFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) if (number % i == 0) count++;
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) if (number % i == 0) factors[index++] = i;
        return factors;
    }

    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int n : arr) sum += n;
        return sum;
    }

    public static int productArray(int[] arr) {
        int product = 1;
        for (int n : arr) product *= n;
        return product;
    }

    public static int sumOfSquares(int[] arr) {
        int sum = 0;
        for (int n : arr) sum += n * n;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] factors = getFactors(number);
        for (int f : factors) System.out.print(f + " ");
        System.out.println();
        System.out.println(sumArray(factors));
        System.out.println(productArray(factors));
        System.out.println(sumOfSquares(factors));
    }
}
