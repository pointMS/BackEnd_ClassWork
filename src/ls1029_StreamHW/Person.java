package ls1029_StreamHW;

import java.util.List;

public class Person {
    private String name;
    private List<BankAccount> accounts;

    public Person(String name, List<BankAccount> accounts) {
        this.name = name;
        this.accounts = accounts;
    }

    public String getName() {
        return name;
    }

    public List<BankAccount> getAccounts() {
        return accounts;
    }
}
