class BankAccount {
    int accNo;
    double balance;

    BankAccount(int accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }
}

public class ReturnBank {
    static BankAccount createAccount() {
        return new BankAccount(1001, 25000);
    }

    public static void main(String[] args) {
        BankAccount b = createAccount();

        System.out.println("Account No: " + b.accNo);
        System.out.println("Balance: " + b.balance);
    }
}