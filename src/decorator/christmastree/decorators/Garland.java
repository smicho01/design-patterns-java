package decorator.christmastree.decorators;

import decorator.christmastree.Tree;
import decorator.christmastree.TreeDecorator;

public class Garland extends TreeDecorator {

    public Garland(Tree tree) {
        super(tree);
    }

    public String decorate() {
        return super.decorate() + decorateWithGarland();
    }

    private String decorateWithGarland() {
        return " with Garland";
    }
}
