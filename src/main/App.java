package src.main;

import src.model.Student;
import src.util.InputValidator;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    // List to store student records
    private static ArrayList<Student> studentList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Student Management System by Oluwaseun Ogunmolu!");

        while (true) {
            // Display menu
            System.out.println("\nMenu:");
            System.out.println("1. Add a new student");
            System.out.println("2. Display all students");
            System.out.println("3. Search for a student by ID");
            System.out.println("4. Update a student’s GPA");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    displayStudents();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    updateGPA();
                    break;
                case 5:
                    System.out.println("Exiting. Thank you!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Add a new student
    private static void addStudent() {
        System.out.print("Enter student ID (S-XXXX): ");
        String id = scanner.nextLine();
        if (!InputValidator.isValidId(id)) {
            System.out.println("Invalid ID format. Please try again.");
            return;
        }

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student age: ");
        int age = scanner.nextInt();

        System.out.print("Enter student GPA: ");
        double gpa = scanner.nextDouble();
        if (!InputValidator.isValidGPA(gpa)) {
            System.out.println("Invalid GPA. Please try again.");
            return;
        }

        Student student = new Student(id, name, age, gpa);
        studentList.add(student);
        System.out.println("Student added successfully!");
    }

    // Display all students
    private static void displayStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students to display.");
            return;
        }
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    // Search for a student by ID
    private static void searchStudent() {
        System.out.print("Enter student ID to search: ");
        String id = scanner.nextLine();
        for (Student student : studentList) {
            if (student.getId().equals(id)) {
                System.out.println(student);
                return;
            }
        }
        System.out.println("Student not found.");
    }

    // Update a student's GPA
    private static void updateGPA() {
        System.out.print("Enter student ID to update GPA: ");
        String id = scanner.nextLine();
        for (Student student : studentList) {
            if (student.getId().equals(id)) {
                System.out.print("Enter new GPA: ");
                double gpa = scanner.nextDouble();
                if (!InputValidator.isValidGPA(gpa)) {
                    System.out.println("Invalid GPA. Please try again.");
                    return;
                }
                student.setGpa(gpa);
                System.out.println("GPA updated successfully!");
                return;
            }
        }
        System.out.println("Student not found.");
    }
}
