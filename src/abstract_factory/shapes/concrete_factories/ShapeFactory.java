package abstract_factory.shapes.concrete_factories;

import abstract_factory.shapes.AbstractFactory;
import abstract_factory.shapes.Shape;
import abstract_factory.shapes.concrete_shapes.Rectangle;
import abstract_factory.shapes.concrete_shapes.Square;

import java.util.Locale;

public class ShapeFactory extends AbstractFactory {

    @Override
    protected Shape getShape(String shapeType) {
        return switch (shapeType.toUpperCase(Locale.ROOT)) {
            case "RECTANGLE" -> new Rectangle();
            case "SQUARE" -> new Square();
            default -> null;
        };
    }
}
