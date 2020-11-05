package ls1105_Bank.entity;

public class Customer {
    private String Name;
    private int age;
    private BankAccount bankAccount;

    public Customer(String name, int age, BankAccount bankAccount) {
        Name = name;
        this.age = age;
        this.bankAccount = bankAccount;
    }

    public String getName() {
        return Name;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "Name='" + Name + '\'' +
                ", age=" + age +
                ", bankAccount=" + bankAccount +
                '}';
    }
}
