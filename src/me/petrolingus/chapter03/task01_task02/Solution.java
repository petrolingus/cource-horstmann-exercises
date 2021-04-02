package me.petrolingus.chapter03.task01_task02;

import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;

/**
 * <h1>Cay S. Horstmann: Core Java SE 9.</h1>
 *
 * <h2>Chapter 3. Task 1</h2>
 *
 * <p>
 * Provide an interface Measurable with a method double getMeasure() that measures an object in some way.
 * Make Employee implement Measurable. Provide
 * a method double average(Measurable[] objects) that computes the average
 * measure. Use it to compute the average salary of an array of employees.
 * </p><br>
 *
 * <h2>Chapter 3. Task 2</h2>
 *
 * <p>
 * Continue with the preceding exercise and provide a method Measurable
 * largest(Measurable[] objects). Use it to find the name of the employee with
 * the largest salary. Why do you need a cast?
 * </p><br>
 *
 * @author Lebedev Aleksandr
 *
 */
public class Solution {

    public static void main(String[] args) {

        Employee tomEmployee = new Employee("Tom", 130.0);
        Employee jerryEmployee = new Employee("Jerry", 260.0);
        Employee spikeEmployee = new Employee("Spike", 1300.0);

        Employee[] employees = {tomEmployee, jerryEmployee, spikeEmployee};

        System.out.println("Classic method: " + average(employees));
        System.out.println("Stream API:     " + averageWithStreamApi(employees));

        System.out.print("The employee's name which have largest salary (classic): ");
        System.out.println(((Employee)largest(employees)).getName());
        System.out.print("The employee's name which have largest salary (Stream API): ");
        System.out.println(((Employee)largestWithStreamApi(employees)).getName());
    }

    private static double average(Measurable[] objects) {
        double sum = 0.0;
        for (Measurable object : objects) {
            sum += object.getMeasure();
        }
        return sum / objects.length;
    }

    private static double averageWithStreamApi(Measurable[] objects) {
        return Arrays.stream(objects)
                .mapToDouble(Measurable::getMeasure)
                .average()
                .orElse(Double.NaN);
    }

    private static Measurable largest(Measurable[] objects) {
        int index = 0;
        for (int i = 1; i < objects.length; i++) {
            if (objects[index].getMeasure() < objects[i].getMeasure()) {
                index = i;
            }
        }
        return objects[index];
    }

    private static Measurable largestWithStreamApi(Measurable[] objects) {
        return Arrays.stream(objects)
                .max(Comparator.comparingDouble(Measurable::getMeasure))
                .orElseThrow(NoSuchElementException::new);
    }
}
