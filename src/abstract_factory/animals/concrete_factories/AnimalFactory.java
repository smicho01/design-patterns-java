package abstract_factory.animals.concrete_factories;

import abstract_factory.animals.AbstractFactory;
import abstract_factory.animals.Animal;
import abstract_factory.animals.concrete_animals.Dog;
import abstract_factory.animals.concrete_animals.Duck;

public class AnimalFactory implements AbstractFactory<Animal> {
    @Override
    public Animal create(String objectType) {
        if("Dog".equalsIgnoreCase(objectType)){
            return new Dog();
        } else if ("Duck".equalsIgnoreCase(objectType)) {
            return new Duck();
        }
        return null;
    }
}
