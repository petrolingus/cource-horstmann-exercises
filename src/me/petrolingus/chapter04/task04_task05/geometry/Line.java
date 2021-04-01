package me.petrolingus.chapter04.task04_task05.geometry;

public class Line extends Shape {

    private final Point from;

    private final Point to;

    public Line(Point from, Point to) {
        super(new Point(from.x - to.x, from.y - to.y));
        this.from = from;
        this.to = to;
    }

    @Override
    public Point getCenter() {
        return center;
    }

    @Override
    public String toString() {
        return "Line[" +
                "from=" + from +
                ", to=" + to +
                ", center=" + center +
                ']';
    }
}
