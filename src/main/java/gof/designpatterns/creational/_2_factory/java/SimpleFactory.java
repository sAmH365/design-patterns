package gof.designpatterns.creational._2_factory.java;

import gof.designpatterns.creational._2_factory.after.BlackShip;
import gof.designpatterns.creational._2_factory.after.WhiteShip;

public class SimpleFactory {

    public Object createProduct(String name) {
        if (name.equals("white")) {
            return new WhiteShip();
        } else if (name.equals("black")) {
            return new BlackShip();
        }

        throw new IllegalArgumentException();
    }
}
