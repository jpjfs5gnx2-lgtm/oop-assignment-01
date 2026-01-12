package geometry;

public class Circle {
    private double x;
    private double y;
    private double radius;

    public Circle() {
        this(0, 0, 1);
    }

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() { return x; }
    public double getY() { return y; }
    public double getRadius() { return radius; }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public boolean contains(double px, double py) {
        double d = Math.sqrt(Math.pow(px - x, 2) + Math.pow(py - y, 2));
        return d <= radius;
    }

    public boolean contains(Circle c) {
        double d = Math.sqrt(Math.pow(c.x - x, 2) + Math.pow(c.y - y, 2));
        return d + c.radius <= radius;
    }

    public boolean overlaps(Circle c) {
        double d = Math.sqrt(Math.pow(c.x - x, 2) + Math.pow(c.y - y, 2));
        return d < radius + c.radius;
    }
}
