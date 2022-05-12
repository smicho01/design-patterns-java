package decorator.christmastree.decorators;

import decorator.christmastree.Tree;
import decorator.christmastree.TreeDecorator;

public class BubbleLights extends TreeDecorator {

    public BubbleLights(Tree tree) {
        super(tree);
    }

    public String decorate() {
        return super.decorate() + decorateWithBubbleLight();
    }

    private String decorateWithBubbleLight() {
        return " with Bubble Lights";
    }
}
