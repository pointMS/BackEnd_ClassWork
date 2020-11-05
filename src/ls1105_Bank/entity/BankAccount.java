package ls1105_Bank.entity;

public class BankAccount {
    private String IBAN;

    public BankAccount(String IBAN) {
        this.IBAN = IBAN;
    }

    public String getIBAN() {
        return IBAN;
    }
}
