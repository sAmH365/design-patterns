package gof.designpatterns.creational.abstract_factory.after;

import gof.designpatterns.creational.factory.after.Ship;
import gof.designpatterns.creational.factory.after.ShipFactory;

public class ShipInventory {

    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteShipFactory(new WhiteShipPartsFactory());
        Ship ship = shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());
    }
}
