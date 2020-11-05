package ls1030_ReadingTextFiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Demo {
    public static void main(String[] args) {
        //Files.lines(Paths.get("test.txt")).forEach(System.out::println);

        //чтение из reader - для работы с текстовыми файлами
        //для чтения бинарной информации (байты) - InputStream, 1 char = 2 bytes

        //try with resources - конструкция позволяет избегать необходимости закрытия потока, без finally
        try (BufferedReader br = new BufferedReader(new FileReader("images.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
