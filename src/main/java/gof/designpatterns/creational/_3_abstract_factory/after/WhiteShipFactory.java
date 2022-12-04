package gof.designpatterns.creational._3_abstract_factory.after;

import gof.designpatterns.creational._2_factory.after.Ship;
import gof.designpatterns.creational._2_factory.after.ShipFactory;
import gof.designpatterns.creational._2_factory.after.WhiteShip;

public class WhiteShipFactory implements ShipFactory {

    private ShipPartsFactory shipPartsFactory;

    public WhiteShipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
