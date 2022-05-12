package abstract_factory.pots.concrete_factories;

import abstract_factory.pots.AbstractPotFactory;
import abstract_factory.pots.Pot;
import abstract_factory.pots.concrete_pots.AluminiumPan;
import abstract_factory.pots.concrete_pots.AluminiumPot;

import java.util.Locale;

public class AluminiumPotFactory extends AbstractPotFactory {
    @Override
    protected Pot getPot(String potType) {
        return switch (potType.toUpperCase(Locale.ROOT)) {
            case "POT" -> new AluminiumPot();
            case "PAN" -> new AluminiumPan();
            default -> null;
        };
    }
}
