import java.util.Scanner;

class FactorsWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        if (number > 0) {
            int i = 1;
            System.out.println("Factors of " + number + " are:");
            while (i < number) {
                if (number % i == 0) {
                    System.out.println(i);
                }
                i++;
            }
        } else {
            System.out.println("Not a positive integer");
        }

        input.close();
    }
}
