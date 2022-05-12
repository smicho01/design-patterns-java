package decorator.example1;

public class ConcreteComponent extends Component {

    @Override
    public void doJob() {
        System.out.println("I am Concrete class.Closed for modification.");
    }

}
