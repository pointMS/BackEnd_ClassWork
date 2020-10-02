package ls20200925_GuessNumber;

public class GuessNumber {
    static int secretNumber = 2;
    static int attempts = 3; //кол-во попыток

    private NumberInput numberInput;
    private GameOutput output;

    public GuessNumber(NumberInput numberInput, GameOutput output) {
        //inversion of control позволяет тестировать программу без привязки к реализации конкретного устройства ввода
        //always Interfaces! no real classes
        this.numberInput = numberInput;
        this.output = output;
    }

    public void game() {
        output.print("Try to guess a secret number");
        int number = numberInput.getNextNumber();
        output.print("You entered " + number);
        boolean correctGuess = false;
        while (attempts > 1 && !correctGuess) {
            if (secretNumber == number) {
                correctGuess = true;
            } else {
                output.print("Wrong number, try again");
                number = numberInput.getNextNumber();
                output.print("You entered " + number);
            }
            attempts--;
        }

        if (correctGuess) {
           output.print("Congratulation, you won!");
        } else {
            output.print("You failed");
        }
    }

    public static void main(String[] args) {
        //справа от "=" реализация интерфейса NumberInput, м.б. заменена любой другой
        NumberInput input = new KeyboardInput();
        GameOutput output = new ConsoleOutput();

        GuessNumber number = new GuessNumber(input, output );
        number.game();

//        NumberInput mockedInput = new InputMock();
//        GuessNumber testGame = new GuessNumber(mockedInput);
//        testGame.game();
    }
}
