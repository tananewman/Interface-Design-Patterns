import ImplementationBehavior.FlyNoWay;
import ImplementationBehavior.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck that's made of wood and stuff");
    }
}
