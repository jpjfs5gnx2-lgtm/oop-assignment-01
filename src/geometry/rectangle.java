package geometry;

public class Rectangle {
    private double x, y;
    private double width, height;

    public Rectangle() {
        this(0, 0, 1, 1);
    }

    public Rectangle(double x, double y, double w, double h) {
        this.x = x;
        this.y = y;
        width = w;
        height = h;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public boolean contains(double px, double py) {
        return px >= x - width/2 && px <= x + width/2 &&
                py >= y - height/2 && py <= y + height/2;
    }

    public boolean contains(Rectangle r) {
        return contains(r.x - r.width/2, r.y - r.height/2) &&
                contains(r.x + r.width/2, r.y + r.height/2);
    }

    public boolean overlaps(Rectangle r) {
        return Math.abs(x - r.x) <= (width + r.width)/2 &&
                Math.abs(y - r.y) <= (height + r.height)/2;
    }
}