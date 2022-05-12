package abstract_factory.animals.concrete_animals;

import abstract_factory.animals.Animal;

public class Bear implements Animal {
    @Override
    public String getAnimal() {
        return "Bear";
    }

    @Override
    public String makeSound() {
        return "Roars";
    }
}
