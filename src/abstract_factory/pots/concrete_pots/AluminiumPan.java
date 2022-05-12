package abstract_factory.pots.concrete_pots;

import abstract_factory.pots.Pot;

public class AluminiumPan implements Pot  {
    @Override
    public void name() {
        System.out.println("Aluminium Pan");
    }
}
