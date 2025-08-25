import java.util.Scanner;

class CountdownWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

   
        System.out.print("Enter the starting number for countdown: ");
        int counter = input.nextInt();

        
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
        System.out.println("Blast Off!");

        input.close();
    }
}
