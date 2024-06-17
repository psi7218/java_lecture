package oop1;

public class AccountMain {
    public static void main(String[] args) {
        Account acount = new Account();
        acount.deposit(10000);
        acount.withdraw(9000);
        acount.withdraw(2000);
    }
}
