package factory.shapes.concrete_shapes;

import factory.shapes.Shape;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
