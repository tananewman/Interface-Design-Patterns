import ImplementationBehavior.FlyWithWings;
import ImplementationBehavior.Quack;

public class MallardDuck extends Duck{
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm really a mallard duck, tbh");
    }
}
