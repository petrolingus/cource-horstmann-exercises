package me.petrolingus.chapter03.task01_task02;

public class Employee implements Measurable {

    private final String name;

    private final double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getMeasure() {
        return salary;
    }
}
