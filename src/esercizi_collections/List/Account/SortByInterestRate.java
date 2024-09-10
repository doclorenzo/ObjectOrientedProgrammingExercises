package esercizi_collections.List.Account;

import java.util.Comparator;

public class SortByInterestRate implements Comparator<Account> {
    @Override
    public int compare(Account o1, Account o2) {
        return (int)(o1.getInterestRate()-o2.getInterestRate());
    }
}
