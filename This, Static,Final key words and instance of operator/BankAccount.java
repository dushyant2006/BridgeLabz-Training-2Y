class BankAccount {
    static String bankName = "SBI";
    static int count = 0;
    final int accNo;
    String holder;

    BankAccount(String holder, int accNo) {
        this.holder = holder;
        this.accNo = accNo;
        count++;
    }

    static void showCount() {
        System.out.println("Total Accounts: " + count);
    }

    void show() {
        if (this instanceof BankAccount) {
            System.out.println(holder + " - " + accNo + " - " + bankName);
        }
    }

    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("Rahul", 101);
        BankAccount a2 = new BankAccount("Priya", 102);
        a1.show();
        a2.show();
        BankAccount.showCount();
    }
}