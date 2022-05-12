package abstract_factory.animals.concrete_factories;

import abstract_factory.animals.AbstractFactory;
import abstract_factory.animals.Color;
import abstract_factory.animals.concrete_colors.Brown;
import abstract_factory.animals.concrete_colors.Red;

public class ColorFactory implements AbstractFactory<Color> {

    @Override
    public Color create(String objectType) {
        if("Red".equalsIgnoreCase(objectType)){
            return new Red();
        } else if ("Brown".equalsIgnoreCase(objectType)){
            return new Brown();
        }

        return null;
    }
}
