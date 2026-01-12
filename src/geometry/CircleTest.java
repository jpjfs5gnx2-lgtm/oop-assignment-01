package geometry;

class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(0, 0, 5);
        Circle c2 = new Circle(3, 0, 2);

        System.out.println(c1.contains(1, 1));
        System.out.println(c1.contains(c2));
        System.out.println(c1.overlaps(c2));
    }
}