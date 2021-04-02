package me.petrolingus.chapter02.task05;

public class Point {

    private final double x;

    private final double y;

    public Point() {
        this(0.0, 0.0);
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point translate(double x, double y) {
        return new Point(this.x + x, this.y + y);
    }

    public Point scale(double scale) {
        return new Point(this.x * scale, this.y * scale);
    }
}
