import java.util.Scanner;

class BMI2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[][] personData = new double[n][3];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            personData[i][0] = sc.nextDouble();
            personData[i][1] = sc.nextDouble();
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);
            if (personData[i][2] < 18.5) status[i] = "Underweight";
            else if (personData[i][2] < 24.9) status[i] = "Normal";
            else if (personData[i][2] < 29.9) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        for (int i = 0; i < n; i++) {
            System.out.println(personData[i][0] + " " + personData[i][1] + " " + personData[i][2] + " " + status[i]);
        }
        sc.close();
    }
}
