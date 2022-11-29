package gof.designpatterns.struct.bridge.before;

import gof.designpatterns.struct.bridge.after.Skin;

public interface Champion extends Skin {

    void move();

    void skillQ();

    void skillW();

    void skillE();

    void skillR();

}
