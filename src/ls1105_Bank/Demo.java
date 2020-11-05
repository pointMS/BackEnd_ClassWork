package ls1105_Bank;

import ls1105_Bank.entity.BankAccount;
import ls1105_Bank.entity.Customer;
import ls1105_Bank.validator.Validator;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) throws Exception{
        BankAccount ba1 = new BankAccount("DE12234655"); //valid
        BankAccount ba2 = new BankAccount("NL1223467"); //invalid NL, length < 8
        BankAccount ba3 = new BankAccount("DE12231"); //invalid length < 8

        Customer c1 = new Customer("Ivan", 35, ba1);
        Customer c2 = new Customer("Piotr", 15, ba2);
        Customer c3 = new Customer("Anna", 25, ba3);


        Validator.validate(Arrays.asList(c1,c2,c3));
    }
}
