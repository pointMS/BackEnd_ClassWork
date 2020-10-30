package ls1008_LambdaDemo;

public class DemoImpl implements DemoInterface {

    int anInt;

    @Override
    public String getString(int i) {
        return String.valueOf(i);
    }

    @Override
    public String transform(int i) {
        anInt = 4;
        return "Hello " + i + anInt;
    }

}
