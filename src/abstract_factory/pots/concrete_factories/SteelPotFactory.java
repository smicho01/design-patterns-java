package abstract_factory.pots.concrete_factories;

import abstract_factory.pots.AbstractPotFactory;
import abstract_factory.pots.Pot;
import abstract_factory.pots.concrete_pots.SteelPan;
import abstract_factory.pots.concrete_pots.SteelPot;

import java.util.Locale;

public class SteelPotFactory extends AbstractPotFactory {
    @Override
    protected Pot getPot(String potType) {
        return switch (potType.toUpperCase(Locale.ROOT)) {
            case "POT" -> new SteelPot();
            case "PAN" -> new SteelPan();
            default -> null;
        };
    }
}
