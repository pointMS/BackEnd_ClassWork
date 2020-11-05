package ls1105_Bank.validator;

import ls1105_Bank.entity.Customer;
import ls1105_Bank.exceptions.InvalidCustomerAgeException;
import ls1105_Bank.exceptions.InvalidIbanLengthException;

import java.util.List;

public class Validator {
    public static void validate(List<Customer> customers) {
        for (Customer c : customers) {
            validateCustomer(c);
        }
    }

    private static void validateCustomer(Customer customer) {
        try {
            validateAge(customer);
        } catch (InvalidCustomerAgeException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            validateIbanLength(customer);
        } catch (InvalidIbanLengthException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void validateAge(Customer customer) throws InvalidCustomerAgeException {
        if (customer.getAge() < 17) {
            throw new InvalidCustomerAgeException("Invalid age " + customer.getAge()
                    + " for customer " + customer.getName());
        }
    }

    private static void validateIbanLength(Customer customer) throws InvalidIbanLengthException {
        if (customer.getBankAccount().getIBAN().length() != 8) {
            throw new InvalidIbanLengthException("Invalid IBAN length " + customer.getBankAccount().getIBAN()
                    + " for customer " + customer.getName());
        }
    }
}
