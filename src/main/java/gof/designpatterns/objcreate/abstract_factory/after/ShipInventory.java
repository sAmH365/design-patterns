package gof.designpatterns.objcreate.abstract_factory.after;

import gof.designpatterns.objcreate.factory.after.Ship;
import gof.designpatterns.objcreate.factory.after.ShipFactory;

public class ShipInventory {

    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteShipFactory(new WhiteShipPartsFactory());
        Ship ship = shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());
    }
}
