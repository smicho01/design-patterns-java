package decorator.christmastree;

import decorator.christmastree.decorators.BubbleLights;
import decorator.christmastree.decorators.Garland;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeImplTest {

    @Test
    public void should_ReturnCorrectDecoratorStrings_when_DecoratedWithGarland () {
        ChristmasTree tree1 = new Garland(new ChristmasTreeImpl());
        assertEquals(tree1.decorate(), "Christmas Tree with Garland");
    }

    @Test
    public void should_ReturnCorrectDecoratorStrings_when_DecoratedWithBubbleLights() {
        ChristmasTree tree1 = new BubbleLights(new ChristmasTreeImpl());
        assertEquals(tree1.decorate(), "Christmas Tree with Bubble Lights");
    }

    @Test
    public void should_ReturnCorrectDecoratorStrings_when_both() {
        ChristmasTreeImpl christmasTree = new ChristmasTreeImpl();
        ChristmasTree decBLight = new BubbleLights(christmasTree);
        ChristmasTree decGarl = new Garland(decBLight);

        assertEquals(decGarl.decorate(), "Christmas Tree with Bubble Lights with Garland");
    }
}