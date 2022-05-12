package decorator.example1;

public class ConcreteDecoratorEx2 extends AbstractDecorator {

    public void doJob() {
        System.out.println("Decorator Ex2 starting job ..");
        super.doJob();
        System.out.println("Finalizing job of Decorator Ex2 now ...");
    }
}
