package decorator.example1;

public class ConcreteDecoratorEx1 extends AbstractDecorator {

        public void doJob() {
            super.doJob();
            com.setName("New Component Name");
            System.out.println("Did job as Concrete Decorator Ex1");
            System.out.println("Comp name: " + com.getName());
        }

}
