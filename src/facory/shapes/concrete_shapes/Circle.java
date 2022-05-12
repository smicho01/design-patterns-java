package facory.shapes.concrete_shapes;

import facory.shapes.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
