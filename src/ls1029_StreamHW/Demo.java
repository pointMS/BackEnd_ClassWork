package ls1029_StreamHW;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {

        BankAccount b1 = new BankAccount("DE1234546");
        BankAccount b2 = new BankAccount("DE6554878");
        BankAccount b3 = new BankAccount("DE21548784");
        BankAccount b4 = new BankAccount("DE98654321");

        Person p1 = new Person("Ivan", Arrays.asList(b1, b2));
        Person p2 = new Person("Peter", Arrays.asList(b3, b4));

        List<String> ibnasForClients = getIbans(Arrays.asList(p1, p2));
        System.out.println(ibnasForClients);


    }

    public static List<String> getIbans(List<Person> persons) {
        List<String> collect = persons.stream().flatMap(p -> p.getAccounts().stream())
                .map(BankAccount::getIban)
                .map(s -> allianateIban(s)).collect(Collectors.toList());
        return collect;
    }

    public static String allianateIban(String s) {
        return s.substring(0, 2) + s.substring(2).replaceAll("\\d", "*");
    }
}
