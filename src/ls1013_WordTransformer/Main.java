package ls1013_WordTransformer;

import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    //"abc defG ikl" -> "ABC defG IKL"
    // length == 3 -> toUpperCase
    // length == 5 -> *****
    // length == 2 -> toLowerCase

    public static void main(String[] args) {
        System.out.println(transform2("abc GF iklki"));
        System.out.println(transform3("abc defG ikl"));
        System.out.println(transform5("abcde fG iklki"));

    }

    public static String transform(String s, Predicate<String> p, Function<String, String> f) {
        String[] temp = s.split(" ");
        for (int i = 0; i < temp.length; i++) {
            if (p.test(temp[i])) {
                temp[i] = f.apply(temp[i]);
            }
        }
        return String.join("  ", temp);
    }

    public static String transform3(String s) {
        Predicate<String> strPredicate = (str) -> str.length() == 3;
        Function<String, String> strFunction = String::toUpperCase;
        return transform(s, strPredicate, strFunction);
    }

    public static String transform5(String s) {
        return transform(s, (str) -> str.length() == 5, (str) -> str.replaceAll("[^*]", "*"));
    }

    public static String transform2(String s) {
        return transform(s, (str) -> str.length() == 2, String::toLowerCase);
    }
}
