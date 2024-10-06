package Classes;

/**
 * Represents a professor associated with a specific department in the university.
 */
public class Professor extends Person {
    /**
     * The department of the professor (private)
     */
    private String department;

    /**
     * Constructor for the Professor class
     *
     * @param name       - The name of the professor
     * @param age        - The age of the professor
     * @param address    - The address of the professor
     * @param department - The department of the professor
     */
    public Professor(String name, int age, String address, String department) {
        super(name, age, address);
        this.department = department;
    }

    /**
     * Returns the department of the professor (private)
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Returns the role of the person (Professor)
     */
    @Override
    public String getRole() {
        return "Professor";
    }

    /**
     * Method that describes a teaching activity
     */
    public String teach() {
        return getName() + " is teaching.";
    }
}
