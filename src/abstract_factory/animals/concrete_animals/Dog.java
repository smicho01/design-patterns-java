package abstract_factory.animals.concrete_animals;

import abstract_factory.animals.Animal;

public class Dog implements Animal {
    @Override
    public String getAnimal() {
        return "Dog";
    }

    @Override
    public String makeSound() {
        return "Barks";
    }
}
