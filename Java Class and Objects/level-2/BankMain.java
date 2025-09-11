public class BankMain {
    public static void main(String[] args) {
        BankAccount b = new BankAccount("Dushyant", "12345", 10000);
        b.deposit(5000);
        b.withdraw(3000);
        b.displayBalance();
    }
}
