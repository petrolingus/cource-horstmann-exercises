package me.petrolingus.chapter04.task04_task05;

import me.petrolingus.chapter04.task04_task05.geometry.Circle;
import me.petrolingus.chapter04.task04_task05.geometry.Point;
import me.petrolingus.chapter04.task04_task05.geometry.Rectangle;

/**
 * Define an abstract class Shape with an instance variable of class Point, a
 * constructor, a concrete method public void moveBy(double dx, double dy) that
 * moves the point by the given amount, and an abstract method public Point
 * getCenter(). Provide concrete subclasses Circle, Rectangle, Line with constructors
 * public Circle(Point center, double radius), public Rectangle(Point topLeft, double width,
 * double height), and public Line(Point from, Point to).
 *
 * Define clone methods for the classes of the four exercise.
 */
public class Solution {

    public static void main(String[] args) {

        Circle circle = new Circle(new Point(100.0, 23.0), 34.0);
        System.out.println(circle);
        circle.moveBy(100, 0);
        System.out.println(circle);

        Point point2 = new Point(50, 30);
        Rectangle rectangle = new Rectangle(point2, 180, 15);
        System.out.println(rectangle);

    }

}
