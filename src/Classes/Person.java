package Classes;

/**
 * Abstract class representing a person associated with the university.
 */
public abstract class Person {
    /**
     * The name of the person (private)
     */
    private String name;
    /**
     * The age of the person (private)
     */
    private int age;
    /**
     * The address of the person (protected)
     */
    protected String address;

    /**
     * Constructor for the Person class
     *
     * @param name    - The name of the person
     * @param age     - The age of the person
     * @param address -The address of the person
     */
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    /**
     * Returns the name of the person
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the age of the person
     */
    public int getAge() {
        return age;
    }

    /**
     * Returns the address of the person
     */
    public String getAddress() {
        return address;
    }

    /**
     * Abstract method that returns the role of the person
     */
    public abstract String getRole();
}

