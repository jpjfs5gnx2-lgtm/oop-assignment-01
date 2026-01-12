package geometry;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(0,0,4,4);
        Rectangle r2 = new Rectangle(1,1,2,2);

        System.out.println(r1.contains(1,1));
        System.out.println(r1.contains(r2));
        System.out.println(r1.overlaps(r2));
    }
}