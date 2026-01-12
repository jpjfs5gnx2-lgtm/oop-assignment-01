package geometry;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle(
                new Point(0,0),
                new Point(1,0),
                new Point(0,1)
        );

        System.out.println(t1.getArea());
        System.out.println(t1.contains(new Point(1,1)));
        System.out.println(t1.overlaps(t2));
    }
}