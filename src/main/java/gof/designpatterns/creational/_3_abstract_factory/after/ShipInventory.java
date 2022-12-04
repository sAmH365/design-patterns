package gof.designpatterns.creational._3_abstract_factory.after;

import gof.designpatterns.creational._2_factory.after.Ship;
import gof.designpatterns.creational._2_factory.after.ShipFactory;

public class ShipInventory {

    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteShipFactory(new WhiteShipPartsFactory());
        Ship ship = shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());
    }
}
