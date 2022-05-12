package abstract_factory.pots.concrete_pots;

import abstract_factory.pots.Pot;

public class AluminiumPot implements Pot  {
    @Override
    public void name() {
        System.out.println("Aluminium Pot");
    }
}
