class BankAccount {
    int accNo;
    String name;
    double balance;

    void openAccount(int accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    void deposit(double amt) {
        balance += amt;
    }

    void withdraw(double amt) {
        balance -= amt;
    }

    void checkBalance() {
        System.out.println("Balance: " + balance);
    }
}

class SavingAccount extends BankAccount {
    void calculateInterest() {
        System.out.println("Interest: " + (balance * 0.04));
    }
}

class FixedDepositAccount extends BankAccount {
    void maturityAmount() {
        System.out.println("Maturity: " + (balance * 1.1));
    }
}

public class Main {
    public static void main(String[] args) {
        SavingAccount s = new SavingAccount();
        s.openAccount(1, "Aarav", 1000);
        s.calculateInterest();

        FixedDepositAccount f = new FixedDepositAccount();
        f.openAccount(2, "Raj", 2000);
        f.maturityAmount();
    }
}
