import Interfaces.FlyBehavior;

public class RocketPoweredFlyer implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Rocket powered propulsion in your face!!! I'm finally doing it!!!");
    }
}
