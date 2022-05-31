package decorator.example1.concrete_component;

import decorator.example1.Component;

public class ConcreteComponent extends Component {

    @Override
    public void doJob() {
        System.out.println("I am Concrete class.Closed for modification.");
    }

}
