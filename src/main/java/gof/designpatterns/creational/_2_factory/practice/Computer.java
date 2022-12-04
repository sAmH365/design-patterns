package gof.designpatterns.creational._2_factory.practice;

public class Computer {

    Mouse mouse;

    Keyboard keyboard;

    public Computer(Mouse mouse, Keyboard keyboard) {
        this.mouse = mouse;
        this.keyboard = keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }
}
