import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create students and professors
        Student student1 = new Student("Alice", 20, "123 Main St", "S001");
        Student student2 = new Student("Bob", 21, "456 Oak St", "S002");
        Professor professor1 = new Professor("Dr. Smith", 45, "789 Pine St", "Computer Science");

        // Create courses
        UndergraduateCourse cs101 = new UndergraduateCourse("Intro to CS", "CS101");
        GraduateCourse ai500 = new GraduateCourse("Advanced AI", "AI500", "Artificial Intelligence");

        // Add participants to courses
        cs101.addParticipant(student1);
        cs101.addParticipant(student2);
        cs101.addParticipant(professor1);

        ai500.addParticipant(professor1);

        // Display course participants
        System.out.println("Participants in " + cs101.getCourseName() + ":");
        displayParticipants(cs101.getParticipants());

        System.out.println("\nParticipants in " + ai500.getCourseName() + ":");
        displayParticipants(ai500.getParticipants());
    }

    private static void displayParticipants(List<Person> participants) {
        for (Person person : participants) {
            System.out.println(person.getName() + " - " + person.getRole());
        }
    }
}
