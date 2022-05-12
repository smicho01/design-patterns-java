package abstract_factory.animals;

public class Main {

    public static void main(String[] args) {
        AbstractFactory<Animal> animalFactory = FactoryProvider.getFactory("animal");
        Animal duck = animalFactory.create("duck");
        System.out.println(duck.getAnimal());
        System.out.println(duck.makeSound());


        AbstractFactory<Color> colorFactory = FactoryProvider.getFactory("color");
        Color red = colorFactory.create("red");
        System.out.println(red.getColor());
    }
}
