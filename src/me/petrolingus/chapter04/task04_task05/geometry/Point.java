package me.petrolingus.chapter04.task04_task05.geometry;

public class Point {

    double x;

    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point[" +
                "x=" + x +
                ", y=" + y +
                ']';
    }
}
