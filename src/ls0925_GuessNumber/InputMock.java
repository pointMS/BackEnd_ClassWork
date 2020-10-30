package ls0925_GuessNumber;

//тестовый класс, заглушка
public class InputMock implements NumberInput {
    int nextNumber;

    @Override
    public int getNextNumber() {
        return 2;
    }
}
