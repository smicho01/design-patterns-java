package decorator.christmastree.decorators;

import decorator.christmastree.ChristmasTree;
import decorator.christmastree.TreeDecorator;

public class BubbleLights extends TreeDecorator {

    public BubbleLights(ChristmasTree tree) {
        super(tree);
    }

    public String decorate() {
        return super.decorate() + decorateWithBubbleLight();
    }

    private String decorateWithBubbleLight() {
        return " with Bubble Lights";
    }
}
