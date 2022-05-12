package abstract_factory.shapes.concrete_factories;

import abstract_factory.shapes.AbstractFactory;
import abstract_factory.shapes.Shape;
import abstract_factory.shapes.concrete_shapes.RoundedRectangle;
import abstract_factory.shapes.concrete_shapes.RoundedSquare;
import java.util.Locale;

public class RoundedShapeFactory extends AbstractFactory {

    @Override
    protected Shape getShape(String shapeType) {
        return switch (shapeType.toUpperCase(Locale.ROOT)) {
            case "RECTANGLE" -> new RoundedRectangle();
            case "SQUARE" -> new RoundedSquare();
            default -> null;
        };
    }
}
