package geometry;

public class PointTest {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(3, 4);

        System.out.println(p1.distance(p2));
        System.out.println(p2.distance(0, 0));
    }
}