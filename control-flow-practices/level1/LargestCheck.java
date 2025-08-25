import java.util.Scanner;

class LargestCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        System.out.print("Enter first number: ");
        int first = input.nextInt();
        System.out.print("Enter second number: ");
        int second = input.nextInt();
        System.out.print("Enter third number: ");
        int third = input.nextInt();

        
        System.out.println("Is the first number the largest? " + (first >= second && first >= third));
        System.out.println("Is the second number the largest? " + (second >= first && second >= third));
        System.out.println("Is the third number the largest? " + (third >= first && third >= second));

        input.close();
    }
}
