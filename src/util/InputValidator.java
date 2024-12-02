package src.util;

// InputValidator class to validate student inputs
public class InputValidator {

    // Validates that the ID follows the "S-XXXX" format
    public static boolean isValidId(String id) {
        return id.matches("S-\\d{4}");
    }

    // Validates that the GPA is between 0.0 and 4.0
    public static boolean isValidGPA(double gpa) {
        return gpa >= 0.0 && gpa <= 4.0;
    }
}
