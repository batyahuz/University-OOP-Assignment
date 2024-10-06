public class Student extends Person {
    private String studentId;

    public Student(String name, int age, String address, String studentId) {
        super(name, age, address);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    @Override
    public String getRole() {
        return "Student";
    }

    public String study() {
        return getName() + " is studying.";
    }
}

