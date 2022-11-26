package gof.designpatterns.objcreate.factory.java;

import gof.designpatterns.objcreate.factory.after.BlackShip;
import gof.designpatterns.objcreate.factory.after.WhiteShip;

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
