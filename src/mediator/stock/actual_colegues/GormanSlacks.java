package mediator.stock.actual_colegues;

import mediator.stock.Colleague;
import mediator.stock.Mediator;

public class GormanSlacks extends Colleague  {

    public GormanSlacks(Mediator mediator) {
        super(mediator);
        System.out.println("GormanSlacks joined ...");
    }
}
