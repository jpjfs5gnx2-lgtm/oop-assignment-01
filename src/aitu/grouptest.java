package aitu;

public class GroupTest {
    public static void main(String[] args) {
        Group g = new Group("OOP");

        Student s1 = new Student("Aruana", "Z");
        s1.addGrade(4);
        s1.addGrade(4);

        Student s2 = new Student("Ali", "K");
        s2.addGrade(3);

        g.addStudent(s1);
        g.addStudent(s2);

        System.out.println(g);
        g.printHallOfFame();
        g.removeStudent(s2.getId());
        System.out.println(g);
    }
}