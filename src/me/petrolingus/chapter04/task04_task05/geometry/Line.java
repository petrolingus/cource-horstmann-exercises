package me.petrolingus.chapter04.task04_task05.geometry;

public class Line extends Shape {

    private final Point from;

    private final Point to;

    public Line(Point from, Point to) {
        super(new Point((from.x + to.x) / 2.0, (from.y + to.y) / 2.0));
        this.from = from;
        this.to = to;
    }

    @Override
    public Point getCenter() {
        return center;
    }

    @Override
    public Shape clone() {
        Point clonedFrom = new Point(from.x, from.y);
        Point clonedTo = new Point(to.x, to.y);
        return new Line(clonedFrom, clonedTo);
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
