package esercizi_oop.bankAccount;

public class BankAccountPro  extends AbstractBankAccount{

    public BankAccountPro(String IBAN, double balance){
        super(IBAN,balance,1,0);
    }

    @Override
    public double withdraw(double amount) {
        checkPositiveValue(amount);
        setBalance(balance-amount);
        applyFee();
        return amount;
    }

    @Override
    public void deposit(double amount) {
        applyFee();
        super.deposit(amount);
    }
}
