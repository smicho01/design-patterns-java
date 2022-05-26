package facade.shapes.concrete_shapes;

import facade.shapes.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle:draw()");
    }
}
