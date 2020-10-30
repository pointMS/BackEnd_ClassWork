package ls1008_LambdaDemo;

public interface DemoInterface {
    String getString(int i);
    //String transform(int i);

    default String transform(int i){
        return "Hello ";
    }

}
