package ls1027_Exception;

public class Demo {
    public static void main(String[] args) {
        System.out.println(someMethod());
    }

    public static int someMethod() {
        try {
            String value = transform("abcde");
            return 10;
        } catch (InvalidStringLengthException | TooLongStringException ex) { //что делать, если случился exception, в скобках - какой именно
            System.out.println(ex.getMessage());
        } finally { //блок закрывает поток и освобождает ресурсы
            System.out.println("This code works in any case");
        }
        //System.out.println("Everything went fine!");
        return 0;
    }

    //length == 5 - toUpperCase
    //length != 5 - throw Exception
    public static String transform(String input) throws InvalidStringLengthException, TooLongStringException {
        if (input.length() == 5) {
            return input.toUpperCase();
        } else if (input.length() > 10) {
            throw new TooLongStringException("Invalid argument");
        } else {
            throw new InvalidStringLengthException("Input length is invalid " + input.length());
        }
    }
}
