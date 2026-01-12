package aitu;

public class Group {
    private String title;
    private Student[] students;
    private int capacity;
    private int numberOfStudents;

    public Group() {
        this("CS-Group");
    }

    public Group(String title) {
        this.title = title;
        capacity = 4;
        students = new Student[capacity];
        numberOfStudents = 0;
    }

    public void addStudent(Student s) {
        if (numberOfStudents == capacity) {
            capacity *= 2;
            Student[] newArr = new Student[capacity];
            for (int i = 0; i < students.length; i++)
                newArr[i] = students[i];
            students = newArr;
        }
        students[numberOfStudents++] = s;
    }

    public double getAverageGpa() {
        if (numberOfStudents == 0) return 0;
        double sum = 0;
        for (int i = 0; i < numberOfStudents; i++)
            sum += students[i].getGpa();
        return sum / numberOfStudents;
    }

    public void printHallOfFame() {
        for (int i = 0; i < numberOfStudents; i++)
            if (students[i].isHonors())
                System.out.println(students[i].getFullName());
    }

    public boolean removeStudent(int id) {
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].getId() == id) {
                for (int j = i; j < numberOfStudents - 1; j++)
                    students[j] = students[j + 1];
                numberOfStudents--;
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return title + " " + numberOfStudents + " " + getAverageGpa();
    }
}