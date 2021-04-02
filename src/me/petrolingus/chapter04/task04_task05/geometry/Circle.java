package me.petrolingus.chapter04.task04_task05.geometry;

public class Circle extends Shape {

    private final double radius;

    public Circle(Point center, double radius) {
        super(center);
        this.radius = radius;
    }

    @Override
    public Point getCenter() {
        return center;
    }

    @Override
    public Circle clone() {
        return new Circle(new Point(center.x, center.y), radius);
    }

    @Override
    public String toString() {
        return "Circle[" +
                "radius=" + radius +
                ", center=" + center +
                ']';
    }
}
