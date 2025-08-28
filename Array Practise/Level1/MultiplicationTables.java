public class MultiplicationTables {
    public static void main(String[] args) {
        int[] tables = new int[(9 - 6 + 1) * 10];
        int index = 0;
        for (int number = 6; number <= 9; number++) {
            for (int i = 1; i <= 10; i++) {
                tables[index] = number * i;
                System.out.println(number + " * " + i + " = " + tables[index]);
                index++;
            }
        }
    }
}
