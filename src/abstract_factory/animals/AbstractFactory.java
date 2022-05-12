package abstract_factory.animals;

public interface AbstractFactory<T> {
    T create(String objectType);
}
