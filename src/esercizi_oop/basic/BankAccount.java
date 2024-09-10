package esercizi_oop.basic;

public class BankAccount {

    double balance;

    public BankAccount() {
        this.balance=0;
    }

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        this.balance+=amount;
    }

    public void withdraw(double amount){
        this.balance-=amount;
    }
}
