package me.petrolingus.chapter04.task04_task05.geometry;

public class Rectangle extends Shape {

    private final double width;

    private final double height;

    public Rectangle(Point center, double width, double height) {
        super(center);
        this.width = width;
        this.height = height;
    }

    @Override
    public Point getCenter() {
        return center;
    }

    @Override
    public Rectangle clone() {
        return new Rectangle(new Point(center.x, center.y), width, height);
    }

    @Override
    public String toString() {
        return "Rectangle[" +
                "width=" + width +
                ", height=" + height +
                ", center=" + center +
                ']';
    }
}
