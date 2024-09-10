package esercizi_oop.bankAccount;

public class BankAccountEasy extends AbstractBankAccount{


    public BankAccountEasy(String IBAN, double balance){
        super(IBAN,balance,0,0);
    }

    @Override
    public double withdraw(double amount) {
        checkPositiveValue(amount);
        if(getBalance()-amount <0) throw new IllegalArgumentException("No credit for BankAccountEasy");
        setBalance(balance-amount);
        return amount;
    }

    @Override
    public double transfer(BankAccount other, double amount) {
        if(other.getIBAN().substring(0,1).equals(this.IBAN.substring(0,1)))  return super.transfer(other, amount);
        else {
            throw new IllegalArgumentException("International Transfer not supported for BankAccountEasy");
        }
    }
}
