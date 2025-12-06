abstract class BankAccount {
    private String accNo;
    private String name;
    private double balance;

    BankAccount(String accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    public String getAccNo() { return accNo; }
    public String getName() { return name; }
    public double getBalance() { return balance; }
    public void deposit(double amt) { balance += amt; }
    public void withdraw(double amt) { balance -= amt; }

    abstract double interest();
}

interface Loanable {
    void applyLoan(double amount);
    double eligibility();
}

class SavingsAccount extends BankAccount implements Loanable {
    SavingsAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    double interest() { return getBalance() * 0.04; }

    @Override
    public void applyLoan(double amount) { System.out.println("Loan applied: " + amount); }

    @Override
    public double eligibility() { return getBalance() * 2; }
}

class CurrentAccount extends BankAccount implements Loanable {
    CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    double interest() { return 0; }

    @Override
    public void applyLoan(double amount) { System.out.println("Loan applied: " + amount); }

    @Override
    public double eligibility() { return getBalance() * 1.5; }
}

public class BankingDemo {
    public static void main(String[] args) {
        BankAccount[] accounts = {
            new SavingsAccount("S101", "Alice", 50000),
            new CurrentAccount("C102", "Bob", 20000)
        };

        for(BankAccount a : accounts) {
            System.out.println(a.getName() + " Interest: " + a.interest());
        }
    }
}
