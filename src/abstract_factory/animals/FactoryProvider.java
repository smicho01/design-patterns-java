package abstract_factory.animals;

import abstract_factory.animals.concrete_factories.AnimalFactory;
import abstract_factory.animals.concrete_factories.ColorFactory;

public class FactoryProvider {

    public static AbstractFactory getFactory(String choice) {
        if("Animal".equalsIgnoreCase(choice)) {
            return new AnimalFactory();
        } else if("Color".equalsIgnoreCase(choice)) {
            return new ColorFactory();
        }
        return null;
    }
}
