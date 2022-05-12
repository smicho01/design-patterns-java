package abstract_factory.shapes;

import abstract_factory.shapes.concrete_factories.RoundedShapeFactory;
import abstract_factory.shapes.concrete_factories.ShapeFactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(boolean rounded) {
        return rounded ? new RoundedShapeFactory() : new ShapeFactory();
    }
}
