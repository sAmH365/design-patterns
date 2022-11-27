package gof.designpatterns.objcreate.abstract_factory.before;

import gof.designpatterns.objcreate.factory.after.Ship;
import gof.designpatterns.objcreate.factory.after.ShipFactory;
import gof.designpatterns.objcreate.factory.after.WhiteShip;

public class WhiteShipFactory implements ShipFactory {

    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(new WhiteAnchor());
        ship.setWheel(new WhiteWheel());
        return ship;
    }
}
