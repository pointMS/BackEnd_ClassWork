package ls20200925_Repeat;

import java.util.Scanner;

public class KeyboardInput implements NumberInput {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public int getNextNumber() {
        return scanner.nextInt();
    }
}
