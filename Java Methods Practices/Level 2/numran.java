import java.util.Scanner;

public class numran {

    public static int[] generate4DigitArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = (int)(Math.random() * 9000) + 1000;
        return arr;
    }

    public static double[] findAverageMinMax(int[] arr) {
        double sum = 0, min = arr[0], max = arr[0];
        for (int n : arr) {
            sum += n;
            if (n < min) min = n;
            if (n > max) max = n;
        }
        return new double[]{sum / arr.length, min, max};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = generate4DigitArray(5);
        double[] res = findAverageMinMax(numbers);
        for (int n : numbers) System.out.print(n + " ");
        System.out.println();
        System.out.println("Average: " + res[0] + " Min: " + res[1] + " Max: " + res[2]);
    }
}
