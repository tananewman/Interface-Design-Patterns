package ImplementationBehavior;

public class Quack implements Interfaces.QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quackety quack quack!!");
    }
}
