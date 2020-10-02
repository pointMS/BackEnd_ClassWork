package ls20200925_GuessNumber;

public class ConsoleOutput implements GameOutput{
    @Override
    public void print(String text) {
        System.out.println(text);
    }
}
