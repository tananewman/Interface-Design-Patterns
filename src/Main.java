public class Main {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();

        mallardDuck.performQuack();
        mallardDuck.performFly();

        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performFly();
        modelDuck.performQuack();

        modelDuck.setFlyBehavior(new RocketPoweredFlyer());
        modelDuck.performFly();
    }
}
