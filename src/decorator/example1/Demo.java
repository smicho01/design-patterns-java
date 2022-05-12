package decorator.example1;

public class Demo {

    public static void main(String[] args) {
        ConcreteComponent cc = new ConcreteComponent();

        ConcreteDecoratorEx1 cd_1 = new ConcreteDecoratorEx1();
        cd_1.setComponent(cc);
        cd_1.doJob();

        ConcreteDecoratorEx2 cd_2 = new ConcreteDecoratorEx2();
        cd_2.setComponent(cc);
        cd_2.doJob();
    }
}
