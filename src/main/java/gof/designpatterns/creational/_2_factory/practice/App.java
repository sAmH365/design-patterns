package gof.designpatterns.creational._2_factory.practice;

public class App {

    public static void main(String[] args) {
        Computer computer = new Computer(new SamsungMouse(), new SamsungKeyboard());

        System.out.println("keyboard = " + computer.keyboard.printBrand());
        System.out.println("mouse = " + computer.mouse.printBrand());
    }
}
