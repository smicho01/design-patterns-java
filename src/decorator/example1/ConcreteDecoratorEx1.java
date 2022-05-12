package decorator.example1;

public class ConcreteDecoratorEx1 extends AbstractDecorator {

        public void doJob() {
            super.doJob();
            System.out.println("Did job as Concrete Decorator Ex1");
        }

}
