package ls1008_LambdaDemo;


import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Demo {
    public static void main(String[] args) {
        Comparator<String> c = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        };

        DemoInterface demo = new DemoImpl();
        System.out.println(demo.transform(5));

        DemoInterface dia = new DemoInterface() {
            @Override
            public String getString(int i) {
                return String.valueOf(i);
            }
        };

        DemoInterface di = (i) -> String.valueOf(i);

        //"abc" -> 3
        Function<String, Integer> f1 = (s) -> s.length();
        System.out.println(f1.apply("hello"));

        //5 -> 25
        // метод apply()
        Function<Integer, Integer> f2 = (a) -> a * a;

        //"abc" -> false
        //"aabb" -> true
        // метод test()
        Predicate<String> f3 = (s) -> s.length() % 2 == 0;
        System.out.println(f3.test("aabb"));

        //что-то принимает, ничего не возвращает
        //метод accept()
        Consumer<String> f4 = x -> System.out.println(x);

        //ничего не принимает, что-то возвращает
        //метод get()
        Supplier<Integer> f5 = () -> (int) (Math.random());

        //---------- метод reference: --------------//

        Function<Integer, Integer> ff1 = (a) -> a * a;
        doSomeMath(ff1, 10);

        Function<Integer, Integer> ff2 = (a) -> a % 2 == 0 ? 1 : -1;
        doSomeMath(ff2, 56);

        //определяется анонимный класс (класс без имени и сразу создается объект),
        //создается переменная этого класса и левой части присваивается ссылка на метод справа
        Function<String, String> getString = Demo::getString;
        getString.apply("gj;lkgj;dfgjh");

        Function<String, String> getString1 = (s) -> s;

        transformString((s) -> s, "qwrt");
        transformString(Demo::getString, "qwert");

        //вызов статического метода
        Person.type();

        //1 ссылка на статический метод
        Supplier<String> type = Person::type;

        //2 ссылка на метод (геттер) конкретного объекта
        Person p = new Person("Ivan");
        Supplier<String> getName = p::getName;
        System.out.println("getter: "+getName.get());

        //3 ссылка на метод произвольного объекта конкретного типа,
        // геттер как функция, принимает в качестве параметра объект p и возвращает его свойство - name
        Function<Person, String> getName1 = Person::getName;
        System.out.println(getName1.apply(p));

        //4 ссылка на конструктор
        Supplier<Person> person = Person::new;

    }

    public static int doSomeMath(Function<Integer, Integer> f, int a) {
        System.out.println(a);
        return f.apply(a);
    }

    public static String transformString(Function<String, String> f, String s) {
        return f.apply(s);
    }

    public static String getString(String input) {
        return input;
    }
}
