package ls1006_DemoInterface;

//функциональный интерфейс - содержит только один метод, по умолчанию public
//аннотация для распознавания ошибки во время компилляции - для лямбда-выражений, проверка, что метод единственный
@FunctionalInterface
public interface DemoInterface {
    String getString(String input);
}
