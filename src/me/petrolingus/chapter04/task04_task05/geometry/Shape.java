package me.petrolingus.chapter04.task04_task05.geometry;

public abstract class Shape {

    final Point center;

    public Shape(Point center) {
        this.center = center;
    }

    public void moveBy(double dx, double dy) {
        center.x += dx;
        center.y += dy;
    }

    public abstract Point getCenter();
}
