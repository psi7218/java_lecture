package oop1;

public class Account {
    int balance;

    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("잔액 부족");
            System.out.println("잔고: " + balance);
        } else {
            balance -= amount;
        }
    }
}
