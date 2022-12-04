package gof.designpatterns.creational._3_abstract_factory.after;

public interface ShipPartsFactory {

    Anchor createAnchor();

    Wheel createWheel();
}
