package ls1006_DemoInterface;

public class Demo {
    public static void main(String[] args) {

        //анонимный класс для единственной реализации данного интерфейса
        //создается объект интерфейса с реализацией метода
        DemoInterface demo = new DemoInterface() {
            @Override
            public String getString(String input) {
                return input.toUpperCase();
            }
        };

//        Function<String, Integer> f = new Function<String, Integer>() {
//            @Override
//            public Integer apply(String s) {
//                return s.length();
//            }
//        };

        //лямбда-выражения
        //слева - переменная-указатель / справа тело метода, реализация
        DemoInterface demoFunctional = (s) -> s.toUpperCase();

        //расширенная запись (не используется)
        DemoInterface demoFunctional1 = (String s) -> {
                   return s.toUpperCase();
        };

        //method reference
        DemoInterface demoFunctional2 = String::toUpperCase;
        String hello = demoFunctional2.getString("hello world");
        System.out.println(hello);

    }
}
