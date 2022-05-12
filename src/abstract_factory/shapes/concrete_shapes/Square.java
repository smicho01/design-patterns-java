package abstract_factory.shapes.concrete_shapes;

import abstract_factory.shapes.Shape;

public class Square implements Shape  {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
