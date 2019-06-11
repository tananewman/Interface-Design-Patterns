package ImplementationBehavior;

import Interfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I honestly suck at flying. In fact, I can't do it at all.");
    }
}
