package facade.shapes.concrete_shapes;

import facade.shapes.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle:draw()");
    }
}
