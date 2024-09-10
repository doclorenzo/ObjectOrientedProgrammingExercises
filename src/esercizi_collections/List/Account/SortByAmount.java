package esercizi_collections.List.Account;

import java.util.Comparator;

public class SortByAmount implements Comparator<Account> {

    @Override
    public int compare(Account o1, Account o2) {

        return (int)(o1.getAmount()-o2.getAmount());
    }
}
