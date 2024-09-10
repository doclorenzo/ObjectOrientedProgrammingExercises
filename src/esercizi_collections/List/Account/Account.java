package esercizi_collections.List.Account;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.sort;

public class Account {

     double amount;
     double interestRate;
     LocalDate duePayment;

    @Override
    public String toString() {
        return "Account{" +
                "amount=" + amount +
                ", interestRate=" + interestRate +
                ", duePayment=" + duePayment +
                '}';
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void setDuePayment(LocalDate duePayment) {
        this.duePayment = duePayment;
    }

    public double getAmount() {
        return amount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public LocalDate getDuePayment() {
        return duePayment;
    }

    public Account(LocalDate duePayment, double interestRate, double amount) {
        this.duePayment = duePayment;
        this.interestRate = interestRate;
        this.amount = amount;
    }

    public static void sortByAmount(List<Account> accounts){
        Collections.sort(accounts,new SortByAmount());
    }
    public static void sortByInterestRate(List<Account> accounts){
        Collections.sort(accounts,new SortByInterestRate());
    }
    public static void sortByDuePayment(List<Account> accounts){
        Collections.sort(accounts,new SortByDuePayment());
    }

}
