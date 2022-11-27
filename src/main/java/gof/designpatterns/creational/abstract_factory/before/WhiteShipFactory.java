package gof.designpatterns.creational.abstract_factory.before;

import gof.designpatterns.creational.factory.after.Ship;
import gof.designpatterns.creational.factory.after.ShipFactory;
import gof.designpatterns.creational.factory.after.WhiteShip;

public class WhiteShipFactory implements ShipFactory {

    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(new WhiteAnchor());
        ship.setWheel(new WhiteWheel());
        return ship;
    }
}
