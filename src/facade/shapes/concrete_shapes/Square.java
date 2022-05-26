package facade.shapes.concrete_shapes;

import facade.shapes.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square:draw()");
    }
}
