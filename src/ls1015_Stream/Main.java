package ls1015_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("ab", "abc", "abcd", "efghk", "c", "cb");

        List<String> collect = strings.stream().filter(s -> s.length() > 2).collect(Collectors.toList());
        Map<Integer, List<String>> collect1 = strings.stream().collect(Collectors.groupingBy(String::length));

        collect1.forEach((k, v) -> System.out.println(k + " = " + v));


        //strings.stream().mapToInt(Main::getStringLength).forEach(System.out::println);

        //IntStream intStream = strings.stream().mapToInt(Main::getStringLength);
        //int sum = intStream.sum(); //вызов терминального метода, если его нет в основном стриме
        //конвейерные операции вызываются только после вызова терминальной операции

//        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5);
//        Integer reduce = ints.stream().reduce(1, (x, y) -> {
//            System.out.println("x = " + x + " y = " + y);
//            return x * y;
//        });
//        System.out.println(reduce);

    }

    public static Integer getStringLength(String input) {
        System.out.println("string = " + input);
        return input.length();
    }
}
