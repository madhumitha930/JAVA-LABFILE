class DepositAccount {
    double balance;

    DepositAccount(double balance) {
        this.balance = balance;
    }
}

public class DepositDemo {

    static void deposit(DepositAccount b, double amount) {
        b.balance += amount;
    }

    public static void main(String[] args) {

        DepositAccount acc = new DepositAccount(10000);

        System.out.println("Before Deposit: " + acc.balance);

        deposit(acc, 5000);

        System.out.println("After Deposit: " + acc.balance);
    }
}