package abstract_factory.animals.concrete_animals;

import abstract_factory.animals.Animal;

public class Duck implements Animal {
    @Override
    public String getAnimal() {
        return "Duck";
    }

    @Override
    public String makeSound() {
        return "Squeaks";
    }
}
