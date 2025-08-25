import java.util.Scanner;

class SmallestFirst {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter first number: ");
        int first = input.nextInt();
        System.out.print("Enter second number: ");
        int second = input.nextInt();
        System.out.print("Enter third number: ");
        int third = input.nextInt();

        
        boolean isSmallest = (first < second && first < third);

        System.out.println("Is the first number the smallest? " + isSmallest);

        input.close();
    }
}
