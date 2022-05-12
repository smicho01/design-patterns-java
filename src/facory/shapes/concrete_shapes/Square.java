package facory.shapes.concrete_shapes;

import facory.shapes.Shape;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
