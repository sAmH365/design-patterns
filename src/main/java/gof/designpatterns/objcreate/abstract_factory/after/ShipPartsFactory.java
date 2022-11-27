package gof.designpatterns.objcreate.abstract_factory.after;

public interface ShipPartsFactory {

    Anchor createAnchor();

    Wheel createWheel();
}
