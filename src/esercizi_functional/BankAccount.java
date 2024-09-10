package esercizi_functional;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BankAccount {

    public static class Account {
        double amount;
        double interestRate;
        LocalDateTime duePayment;


/*        (a) filter all the accounts whose duePayment is expired,
(b) apply interests (amount += amount * interestRate),
(c) sort the accounts based on their amount (in decremental order),
(d) return a List of the filtered accounts.*/

        public static List<Account> applyInterest(List<Account> accounts){

            return accounts.stream()
                    .filter(x-> x.duePayment.isBefore(LocalDateTime.now()))
                    .peek(x-> x.amount+=x.amount*x.interestRate)
                    .sorted((x,y) -> (int) (x.amount-y.amount))
                    .collect(Collectors.toList());
        }

    }

}
