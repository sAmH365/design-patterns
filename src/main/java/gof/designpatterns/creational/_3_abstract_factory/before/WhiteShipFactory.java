package gof.designpatterns.creational._3_abstract_factory.before;

import gof.designpatterns.creational._2_factory.after.Ship;
import gof.designpatterns.creational._2_factory.after.ShipFactory;
import gof.designpatterns.creational._2_factory.after.WhiteShip;

public class WhiteShipFactory implements ShipFactory {

    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(new WhiteAnchor());
        ship.setWheel(new WhiteWheel());
        return ship;
    }
}
