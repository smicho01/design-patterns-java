package abstract_factory.animals.concrete_colors;

import abstract_factory.animals.Color;

public class Red implements Color {
    @Override
    public String getColor() {
        return "Red color";
    }
}
