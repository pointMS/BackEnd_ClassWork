package ls1013_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("ab", "abc", "abcd", "efghk", "c", "cb");

        int sum = strings.stream().mapToInt(String::length).sum();
        strings.stream().filter(s -> s.length() >= 2).forEach(System.out::println);
    }
}
