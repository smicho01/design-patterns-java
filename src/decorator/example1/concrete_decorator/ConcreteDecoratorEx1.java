package decorator.example1.concrete_decorator;

import decorator.example1.AbstractDecorator;

public class ConcreteDecoratorEx1 extends AbstractDecorator {

        public void doJob() {
            super.doJob();
            System.out.println("Did job as Concrete Decorator Ex1");
        }

}
