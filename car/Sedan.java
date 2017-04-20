package com.javarush.task.task29.task2909.car;

/**
 * Created by hanaria on 4/20/17.
 */
public class Sedan extends Car{
    public Sedan(int numberOfPassengers)
    {
        super(Car.SEDAN, numberOfPassengers);
    }

    @Override
    public int getMaxSpeed()
    {
        final int SEDAN_MAX_SPEED = 120;
        return SEDAN_MAX_SPEED;
    }
    /*
      public static void main(String[] args) {
        Truck truck1 = (Truck) Car.create(Car.TRUCK, 12);
        Truck truck2 = (Truck) Car.create(Car.TRUCK, 14);
        System.out.println(truck1);
        System.out.println(truck2);
        Sedan sedan1 = (Sedan) Car.create(Car.SEDAN, 4);
        Sedan sedan2 = (Sedan) Car.create(Car.SEDAN, 5);
        System.out.println(sedan1);
        System.out.println(sedan2);
    }
     */
}
