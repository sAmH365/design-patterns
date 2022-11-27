package gof.designpatterns.creational.abstract_factory.after;

import gof.designpatterns.creational.factory.after.Ship;
import gof.designpatterns.creational.factory.after.ShipFactory;
import gof.designpatterns.creational.factory.after.WhiteShip;

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
