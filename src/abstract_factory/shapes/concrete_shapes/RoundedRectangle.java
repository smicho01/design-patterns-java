package abstract_factory.shapes.concrete_shapes;

import abstract_factory.shapes.Shape;

public class RoundedRectangle implements Shape  {
    @Override
    public void draw() {
        System.out.println("Inside RoundedRectangle::draw() method.");
    }
}
