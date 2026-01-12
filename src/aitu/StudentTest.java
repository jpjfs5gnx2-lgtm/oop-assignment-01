package aitu;

import java.util.Random;

public class StudentTest {
    public static void main(String[] args) {
        Student.setNextId(250001);
        Student[] students = new Student[3];
        Random r = new Random();

        students[0] = new Student("Aruana", "Zhaksylyk");
        students[1] = new Student("Ali", "Khan");
        students[2] = new Student("Dana", "Nur");

        for (Student s : students) {
            for (int i = 0; i < 5; i++)
                s.addGrade(2 + r.nextDouble() * 2);
            System.out.println(
                    s.getId() + " " +
                            s.getFullName() + " " +
                            s.getEmail() + " " +
                            s.getGpa()
            );
        }
    }
}