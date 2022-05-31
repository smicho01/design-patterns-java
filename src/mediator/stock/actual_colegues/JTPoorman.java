package mediator.stock.actual_colegues;

import mediator.stock.Colleague;
import mediator.stock.Mediator;

public class JTPoorman extends Colleague {
    public JTPoorman(Mediator mediator) {
        super(mediator);
        System.out.println("JTPoorman joined ...");
    }
}
