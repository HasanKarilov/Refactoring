package com.javarush.task.task29.task2909.car;

/**
 * Created by hanaria on 4/20/17.
 */
public class Truck extends Car{
    public Truck(int numberOfPassengers){
        super(Car.TRUCK, numberOfPassengers);
    }

    @Override
    public int getMaxSpeed() {
        final int TRUCK_MAX_SPEED = 80;
        return TRUCK_MAX_SPEED;
    }
}
