package Classes;

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
     * @param name      - The name of the student
     * @param age       - The age of the student
     * @param address   - The address of the student
     * @param studentId - The student ID
     */
    public Student(String name, int age, String address, String studentId) {
        super(name, age, address);
        this.studentId = studentId;
    }

    /**
     * Returns the student ID (private)
     */
    public String getStudentId() {
        return studentId;
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
        return getName() + " is studying.";
    }
}

