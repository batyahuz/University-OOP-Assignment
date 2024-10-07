package Classes;

import java.util.UUID;

/**
 * Represents a student with a unique ID in the university system.
 */
public class Student extends Person {
    /**
     * The student ID (private)
     */
    private String studentId;

    /**
     * Constructor for the Student class
     *
     * @param name    - The name of the student
     * @param age     - The age of the student
     * @param address - The address of the student
     */
    public Student(String name, int age, String address) {
        super(name, age, address);
        this.studentId = "S" + UUID.randomUUID().toString();
    }

    /**
     * Returns the role of the person (Student)
     */
    @Override
    public String getRole() {
        return "Student";
    }

    /**
     * Method that describes a study activity
     */
    public String study() {
        return getRole() + ": " + studentId + " - " + getName() + " is studying.";
    }
}

