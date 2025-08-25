import java.util.Scanner;

class HarshadCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num, sum = 0;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        if (num % sum == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not a Harshad Number");
        }
        sc.close();
    }
}
