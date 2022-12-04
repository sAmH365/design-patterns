package gof.designpatterns.struct._7_bridge.before;

import gof.designpatterns.struct._7_bridge.after.Skin;

public interface Champion extends Skin {

    void move();

    void skillQ();

    void skillW();

    void skillE();

    void skillR();

}
