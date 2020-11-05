package ls1105_Bank.exceptions;

public class InvalidIbanLengthException extends Exception{
    public InvalidIbanLengthException(String message) {
        super(message);
    }
}
