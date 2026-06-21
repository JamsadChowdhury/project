class Account {

    double balance;

    public Account() {
        balance = 0;
    }
}

class SmartSavingsAccount extends Account {

    public void showBalance() {
        System.out.println("\nCurrent Balance: " + balance + " BDT");
    }
}

class Deposit {

    void deposit(SmartSavingsAccount emma, double amount) {
        emma.balance += amount;
        System.out.println("Simple Deposit");
        System.out.println("Amount Deposited: " + amount + " BDT");
    }

void deposit(SmartSavingsAccount emma, double amount, String description) {
        emma.balance += amount;
        System.out.println("\nDeposit 1");
        System.out.println("Amount Deposited: " + amount + " BDT");
        System.out.println("Description: " + description);
    }

void deposit(SmartSavingsAccount emma, double amount,
                 String description, String date) {

        emma.balance += amount;
        System.out.println("\nDeposit 2");
        System.out.println("Amount Deposited: " + amount + " BDT");
        System.out.println("Description: " + description);
        System.out.println("Date: " + date);
    }
}

public class Main {

    public static void main(String[] args) {

        SmartSavingsAccount emma = new SmartSavingsAccount();
        Deposit d = new Deposit();

        d.deposit(emma, 50000);
        d.deposit(emma, 25000, "Performance Bonus");
        d.deposit(emma, 1300,
                  "Birthday gift from Aunt Lucy",
                  "2024-09-10");

        emma.showBalance();
    }
}
