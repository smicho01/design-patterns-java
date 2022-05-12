package factory.shapes.concrete_shapes;

import factory.shapes.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
