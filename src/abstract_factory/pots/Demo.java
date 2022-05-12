package abstract_factory.pots;

import abstract_factory.shapes.AbstractFactory;

import java.awt.*;

public class Demo {

    public static void main(String[] args) {

        AbstractPotFactory aluFactory = PotsFactoryProducer.getFactory("aluminium");
        Pot aluPot = aluFactory.getPot("pot");
        aluPot.name();
        Pot aluPan = aluFactory.getPot("pan");
        aluPan.name();

        AbstractPotFactory steelFactory = PotsFactoryProducer.getFactory("steel");
        Pot steelPot = steelFactory.getPot("pot");
        steelPot.name();
        Pot steelPan = steelFactory.getPot("pan");
        steelPan.name();

    }
}
