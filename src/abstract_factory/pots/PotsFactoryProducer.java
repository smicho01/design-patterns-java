package abstract_factory.pots;

import abstract_factory.pots.concrete_factories.AluminiumPotFactory;
import abstract_factory.pots.concrete_factories.SteelPotFactory;

import java.util.Locale;

public class PotsFactoryProducer {

    public static AbstractPotFactory getFactory(String factoryName) {
        return switch (factoryName.toUpperCase(Locale.ROOT)) {
            case "ALUMINIUM" -> new AluminiumPotFactory();
            case "STEEL" -> new SteelPotFactory();
            default -> null;
        };
    }

}
