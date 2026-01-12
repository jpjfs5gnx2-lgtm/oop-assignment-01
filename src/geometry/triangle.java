package geometry;

public class Triangle {
    private Point p1;
    private Point p2;
    private Point p3;

    public Triangle() {
        this(new Point(0,0), new Point(1,1), new Point(2,5));
    }

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Point getP1() { return p1; }
    public Point getP2() { return p2; }
    public Point getP3() { return p3; }

    public void setP1(Point p) { p1 = p; }
    public void setP2(Point p) { p2 = p; }
    public void setP3(Point p) { p3 = p; }

    private double area(Point a, Point b, Point c) {
        return Math.abs(
                (b.getX() - a.getX()) * (c.getY() - a.getY()) -
                        (c.getX() - a.getX()) * (b.getY() - a.getY())
        ) / 2.0;
    }

    public double getArea() {
        return area(p1, p2, p3);
    }

    public double getPerimeter() {
        return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
    }

    public boolean contains(Point p) {
        double A = getArea();
        double A1 = area(p, p2, p3);
        double A2 = area(p1, p, p3);
        double A3 = area(p1, p2, p);
        return Math.abs(A - (A1 + A2 + A3)) < 1e-6;
    }

    public boolean contains(Triangle t) {
        return contains(t.p1) && contains(t.p2) && contains(t.p3);
    }

    public boolean overlaps(Triangle t) {
        return contains(t.p1) || contains(t.p2) || contains(t.p3);
    }
}