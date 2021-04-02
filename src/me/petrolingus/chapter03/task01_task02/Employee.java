package me.petrolingus.chapter03.task01_task02;

public class Employee implements Measurable {

    private final double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    @Override
    public double getMeasure() {
        return salary;
    }
}
