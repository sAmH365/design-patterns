package gof.designpatterns.creational.factory.practice;

public interface ComputerFactory {
    Computer createComputer(Keyboard keyboard, Mouse mouse);
}
