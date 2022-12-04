package gof.designpatterns.creational._3_abstract_factory.after;

import gof.designpatterns.creational._3_abstract_factory.before.WhiteAnchor;
import gof.designpatterns.creational._3_abstract_factory.before.WhiteWheel;

public class WhitePartsProFactory implements ShipPartsFactory {
    @Override
    public Anchor createAnchor() {
        return new WhiteAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheel();
    }
}
