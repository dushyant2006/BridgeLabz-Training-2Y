import java.util.Scanner;

class MultiplesBelow100While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer less than 100: ");
        int number = input.nextInt();

        if (number > 0 && number < 100) {
            System.out.println("Multiples of " + number + " below 100:");
            int i = 1;
            while (i <= 100) {
                if (i % number == 0) {
                    System.out.println(i);
                }
                i++;
            }
        } else {
            System.out.println("Invalid number");
        }

        input.close();
    }
}
