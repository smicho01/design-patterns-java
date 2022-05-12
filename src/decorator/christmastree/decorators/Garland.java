package decorator.christmastree.decorators;

import decorator.christmastree.ChristmasTree;
import decorator.christmastree.TreeDecorator;

public class Garland extends TreeDecorator {

    public Garland(ChristmasTree tree) {
        super(tree);
    }

    public String decorate() {
        return super.decorate() + decorateWithGarland();
    }

    private String decorateWithGarland() {
        return " with Garland";
    }
}
