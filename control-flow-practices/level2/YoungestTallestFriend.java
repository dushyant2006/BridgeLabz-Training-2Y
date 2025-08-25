import java.util.Scanner;

class YoungestTallestFriend {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Amar's age: ");
        int ageAmar = input.nextInt();
        System.out.print("Enter Akbar's age: ");
        int ageAkbar = input.nextInt();
        System.out.print("Enter Anthony's age: ");
        int ageAnthony = input.nextInt();

        System.out.print("Enter Amar's height: ");
        double heightAmar = input.nextDouble();
        System.out.print("Enter Akbar's height: ");
        double heightAkbar = input.nextDouble();
        System.out.print("Enter Anthony's height: ");
        double heightAnthony = input.nextDouble();

        String youngest = "Amar";
        int youngestAge = ageAmar;

        if (ageAkbar < youngestAge) {
            youngest = "Akbar";
            youngestAge = ageAkbar;
        }
        if (ageAnthony < youngestAge) {
            youngest = "Anthony";
            youngestAge = ageAnthony;
        }

        String tallest = "Amar";
        double tallestHeight = heightAmar;

        if (heightAkbar > tallestHeight) {
            tallest = "Akbar";
            tallestHeight = heightAkbar;
        }
        if (heightAnthony > tallestHeight) {
            tallest = "Anthony";
            tallestHeight = heightAnthony;
        }

        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);

        input.close();
    }
}
