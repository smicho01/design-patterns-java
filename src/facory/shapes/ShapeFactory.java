package facory.shapes;

import facory.shapes.concrete_shapes.Circle;
import facory.shapes.concrete_shapes.Rectangle;
import facory.shapes.concrete_shapes.Square;

import java.util.Locale;

public class ShapeFactory {

    public Shape getShape(String shapeType) {
        if(shapeType == null)
            return null;

        return switch (shapeType.toUpperCase(Locale.ROOT)) {
            case "CIRCLE" -> new Circle();
            case "RECTANGLE" -> new Rectangle();
            case "SQUARE" -> new Square();
            default -> null;
        };
    }
}
