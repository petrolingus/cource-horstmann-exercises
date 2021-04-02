package me.petrolingus.chapter04.task04_task05;

import me.petrolingus.chapter04.task04_task05.geometry.*;

/**
 *<h1>Cay S. Horstmann: Core Java SE 9.</h1>
 *
 *<h2>Chapter 4. Task 4</h2>
 *<p>
 * Define an abstract class Shape with an instance variable of class Point, a
 * constructor, a concrete method public void moveBy(double dx, double dy) that
 * moves the point by the given amount, and an abstract method public Point
 * getCenter(). Provide concrete subclasses Circle, Rectangle, Line with constructors
 * public Circle(Point center, double radius), public Rectangle(Point topLeft, double width,
 * double height), and public Line(Point from, Point to).
 * </p><br>
 *
 * <h2>Chapter 4. Task 5</h2>
 * <p>
 * Define clone methods for the classes of the four exercise.
 * </p><br>
 *
 * @author Lebedev Aleksandr
 *
 */
public class Solution {

    public static void main(String[] args) {

        System.out.println("Main shapes when init");

        // Creating main Circle and print it
        Circle circle = new Circle(new Point(100.0, 23.0), 34.0);
        System.out.println(circle);

        // Creating main Rectangle and print it
        Rectangle rectangle = new Rectangle(new Point(50, 30), 180, 15);
        System.out.println(rectangle);

        // Creating main Line and print it
        Line line = new Line(new Point(33, 228), new Point(137, 137));
        System.out.println(line + "\n");

        // Creating Shape array with ten geometric shapes which clone from main
        Shape[] shapes = new Shape[10];
        for (int i = 0; i < shapes.length; i++) {
            double choice = Math.random();
            if (choice < 0.33) {
                shapes[i] = circle.clone();
            } else if (choice < 0.66) {
                shapes[i] = rectangle.clone();
            } else {
                shapes[i] = line.clone();
            }
        }

        // Move all main shapes
        circle.moveBy(10, 10);
        rectangle.moveBy(20, 20);
        line.moveBy(30, 30);

        // and print it
        System.out.println("Main shapes after moveBy()");
        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(line);

        // Print cloned shapes
        System.out.println("\nCloned shapes");
        sortedShapesPrint(shapes);

        // Random moved cloned shapes and print it
        System.out.println("\nMoving cloned shapes");
        randomMoveShapes(shapes);
        sortedShapesPrint(shapes);

    }

    private static void sortedShapesPrint(Shape[] shapes) {

        for (Shape shape : shapes) {
            if (shape instanceof Circle)
                System.out.println(shape);
        }

        for (Shape shape : shapes) {
            if (shape instanceof Rectangle)
                System.out.println(shape);
        }

        for (Shape shape : shapes) {
            if (shape instanceof Line)
                System.out.println(shape);
        }
    }

    private static void randomMoveShapes(Shape[] shapes) {

        for (Shape shape : shapes) {
            shape.moveBy(10 * Math.random(), 10 * Math.random());
        }
    }

}
