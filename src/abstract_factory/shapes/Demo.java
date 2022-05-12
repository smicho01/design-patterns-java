package abstract_factory.shapes;

public class Demo {

    public static void main(String[] args) {
        // Get shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        // Get and obj. of Shape Rectangle
        Shape shape1 = shapeFactory.getShape("rectangle");
        // Call draw method on that rectangle
        shape1.draw();
        // Get an obj. of Shape Square
        Shape shape2 = shapeFactory.getShape("square");
        // Draw square
        shape2.draw();


        // Get shape factory (will be rounded shape factory)
        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
        // Get and obj. of Shape RoundedRectangle
        Shape shape3 = shapeFactory1.getShape("rectangle");
        // Call draw method on that rectangle
        shape3.draw();
        // Get an obj. of Shape RoundedSquare
        Shape shape4 = shapeFactory1.getShape("square");
        // Draw square
        shape4.draw();
    }
}
