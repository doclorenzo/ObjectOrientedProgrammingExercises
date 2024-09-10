package esercizi_collections.List.Account;

import java.util.Comparator;

public class SortByDuePayment implements Comparator<Account> {
    @Override
    public int compare(Account o1, Account o2) {
        return o1.getDuePayment().compareTo(o2.getDuePayment());
    }
}
