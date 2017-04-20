package com.javarush.task.task29.task2909.car;

/**
 * Created by hanaria on 4/20/17.
 */
public class Cabriolet extends Car {

    public Cabriolet(int numberOfPassengers){
        super(Car.CABRIOLET, numberOfPassengers);
    }

    @Override
    public int getMaxSpeed() {
        {
            final int CABRIOLET_MAX_SPEED = 90;
            return CABRIOLET_MAX_SPEED;
        }
    }
}
