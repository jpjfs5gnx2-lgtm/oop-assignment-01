package aitu;

public class Student {
    private int id;
    private String firstname;
    private String lastname;
    private double[] grades;

    private static int nextId;
    private static String domain = "astanait.edu.kz";

    public Student() {
        this("John", "Wick", new double[0]);
    }

    public Student(String f, String l) {
        this(f, l, new double[0]);
    }

    public Student(String f, String l, double[] g) {
        firstname = f;
        lastname = l;
        grades = g;
        id = nextId++;
    }

    public int getId() { return id; }
    public String getFirstname() { return firstname; }
    public String getLastname() { return lastname; }
    public static int getNextId() { return nextId; }

    public String getFullName() {
        return firstname + " " + lastname;
    }

    public double getGpa() {
        if (grades.length == 0) return 0;
        double sum = 0;
        for (double g : grades) sum += g;
        return sum / grades.length;
    }

    public boolean isHonors() {
        return getGpa() >= 3.5;
    }

    public String getEmail() {
        return id + "@" + domain;
    }

    public void addGrade(double grade) {
        double[] newArr = new double[grades.length + 1];
        for (int i = 0; i < grades.length; i++)
            newArr[i] = grades[i];
        newArr[grades.length] = grade;
        grades = newArr;
    }

    public static void setNextId(int id) {
        nextId = id;
    }
}