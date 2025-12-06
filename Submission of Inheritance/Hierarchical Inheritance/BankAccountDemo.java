class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayAccountType() {
        System.out.println("Generic Bank Account");
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    void displayAccountType() {
        System.out.println("Savings Account with Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    void displayAccountType() {
        System.out.println("Checking Account with Withdrawal Limit: " + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    int tenureMonths;

    FixedDepositAccount(String accountNumber, double balance, int tenureMonths) {
        super(accountNumber, balance);
        this.tenureMonths = tenureMonths;
    }

    @Override
    void displayAccountType() {
        System.out.println("Fixed Deposit Account for " + tenureMonths + " months");
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount[] accounts = {
            new SavingsAccount("SA123", 5000, 5),
            new CheckingAccount("CA456", 10000, 2000),
            new FixedDepositAccount("FD789", 20000, 12)
        };

        for (BankAccount acc : accounts) {
            System.out.println("Account Number: " + acc.accountNumber + ", Balance: " + acc.balance);
            acc.displayAccountType();
            System.out.println("------");
        }
    }
}

