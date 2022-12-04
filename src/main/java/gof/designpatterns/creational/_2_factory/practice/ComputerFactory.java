package gof.designpatterns.creational._2_factory.practice;

public interface ComputerFactory {
    Computer createComputer(Keyboard keyboard, Mouse mouse);
}
