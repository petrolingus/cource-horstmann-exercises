package me.petrolingus.chapter02.task05;

/**
 * <h1>Cay S. Horstmann: Core Java SE 9.</h1>
 *
 * <h2>Chapter 2. Task 5</h2>
 *
 * <p>
 * Implement an immutable class Point that describes a point in the plane.
 * Provide a constructor to set it to a specific point, a no-arg constructor to
 * set it to the origin, and methods getX, getY, translate, and scale. The translate
 * method moves the point by a given amount in x- and y-direction. The
 * scale method scales both coordinates by a given factor. Implement these
 * methods so that they return new points with the results.
 * </p><br>
 *
 * @author Lebedev Aleksandr
 *
 */
public class Solution {

    public static void main(String[] args) {

        Point p = new Point(3, 4).translate(1, 3).scale(0.5);
        System.out.println("(" + p.getX() + ", " + p.getY() + ")");
    }
}
