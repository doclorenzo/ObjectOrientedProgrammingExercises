package esercizi_oop.bankAccount;

public abstract class AbstractBankAccount implements BankAccount {

    String IBAN;
    double balance;
    double operationFee;
    double interestRate;

    public AbstractBankAccount(String IBAN, double balance, double operationFee, double interestRate) {
        this.setIBAN(IBAN);
        this.balance = balance;
        this.operationFee = operationFee;
        this.interestRate = interestRate;
    }

    @Override
    public String getIBAN() {
        return IBAN;
    }

    @Override
    public void setIBAN(String IBAN) {
        BankAccount.checkIBAN(IBAN);
        this.IBAN = IBAN;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public double getOperationFee() {
        return operationFee;
    }

    @Override
    public void setOperationFee(double operationFee) {
        this.operationFee = operationFee;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void checkPositiveValue(double value){
        if(value < 0.0){
            throw new IllegalArgumentException("Negative values are not allowed for this operation");
        }
    }

    @Override
    public void deposit(double amount) {
        checkPositiveValue(amount);
        balance+=amount;
    }

    @Override
    public abstract double withdraw(double amount);

    @Override
    public double transfer(BankAccount other, double amount) {
        checkPositiveValue(amount);
        other.deposit(amount);
        withdraw(amount);
        return amount;
    }

    @Override
    public void addInterest() {
        balance+=balance*interestRate;
    }

    @Override
    public void applyFee() {
        balance-=operationFee;
    }
}
