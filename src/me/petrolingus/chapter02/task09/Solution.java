package me.petrolingus.chapter02.task09;

/**
 * <h1>Cay S. Horstmann: Core Java SE 9.</h1>
 *
 * <h2>Chapter 2. Task 9</h2>
 * <p>
 * Implement a class Car that models a car traveling along the x-axis, consuming gas as it moves.
 * Provide methods to drive by a given number of
 * miles, to add a given number of gallons to the gas tank, and to get the
 * current distance from the origin and fuel level. Specify the fuel efficiency
 * (in miles/gallons) in the constructor. Should this be an immutable class?
 * Why or why not?
 * </p>
 *
 * @author Lebedev Aleksandr
 */
public class Solution {

    public static void main(String[] args) {

        // Create a new car
        Car car = new Car(1.0);

        // Print its state
        System.out.println(car);

        // We need some fuel to drive
        car.refuel(10.0);

        // Let's look out car once more
        System.out.println(car + "\n");

        // So... We can drive little bit
        for (int i = 0; i < 10; i++) {
            double miles = Math.floor(5 * Math.random() + 1);
            car.drive(miles);
            System.out.println("Let's try to drive " + miles + " miles: " + car);
        }
    }
}
