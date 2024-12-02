package model;

// Student class to represent the data model
public class Student {
    private String id; // Student ID (e.g., S-1234)
    private String name; // Student's name
    private int age; // Student's age
    private double gpa; // Student's GPA

    // Constructor
    public Student(String id, String name, int age, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    // Getter and Setter methods
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // Override toString to display student details
    @Override
    public String toString() {
        return "Student [ID=" + id + ", Name=" + name + ", Age=" + age + ", GPA=" + gpa + "]";
    }
}
