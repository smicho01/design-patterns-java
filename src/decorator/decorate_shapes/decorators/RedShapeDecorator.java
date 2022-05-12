package decorator.decorate_shapes.decorators;

import decorator.decorate_shapes.Shape;
import decorator.decorate_shapes.ShapeDecorator;

public class RedShapeDecorator extends ShapeDecorator  {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setBorder(decoratedShape);
    }

    private void setBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }
}
