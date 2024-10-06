public class Professor extends Person {
    private String department;

    public Professor(String name, int age, String address, String department) {
        super(name, age, address);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String getRole() {
        return "Professor";
    }

    public String teach() {
        return getName() + " is teaching.";
    }
}
