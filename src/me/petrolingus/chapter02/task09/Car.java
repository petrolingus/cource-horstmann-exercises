package me.petrolingus.chapter02.task09;

public class Car {

    public final static double MAX_FUEL = 20.0;

    private double position;

    private double fuel;

    private final double milesPerGallon;

    public Car(double milesPerGallon) {
        this.position = 0.0;
        this.fuel = 0.0;
        this.milesPerGallon = milesPerGallon;
    }

    public void drive(double miles) {
        double fuelConsumption = miles / milesPerGallon;
        if (this.fuel - fuelConsumption < 0) {
            this.position += this.fuel * milesPerGallon;
            this.fuel = 0;
        } else {
            this.position += miles;
            this.fuel -= fuelConsumption;
        }
    }

    public void refuel(double gallons) {
        double newFuel = this.fuel + gallons;
        this.fuel = Math.min(newFuel, MAX_FUEL);
    }

    public double getPosition() {
        return position;
    }

    public double getFuel() {
        return fuel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "position=" + position +
                ", fuel=" + fuel +
                ", milesPerGallon=" + milesPerGallon +
                '}';
    }
}
