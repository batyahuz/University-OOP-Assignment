import Classes.*;

import java.util.List;

/**
 * Main class that simulates the university management system and its functionality.
 */
public class University {
    public static void main(String[] args) {
        // Create students and professors
        Student student1 = new Student("John", 20, "123 Main St", "S001");
        Student student2 = new Student("Bob", 21, "456 Rock St", "S002");
        Professor professor1 = new Professor("Dr. Smith", 45, "789 Pine St", "Computer Science");

        // Create courses
        UndergraduateCourse jv101 = new UndergraduateCourse("Intro to JAVA", "JV101");
        GraduateCourse ai500 = new GraduateCourse("Advanced AI", "AI500", "Artificial Intelligence");

        // Add participants to courses
        jv101.addParticipant(student1);
        jv101.addParticipant(student2);
        jv101.addParticipant(professor1);

        ai500.addParticipant(professor1);

        // Display course participants
        System.out.println("Participants in " + jv101.getCourseName() + ":");
        displayParticipants(jv101.getParticipants());

        System.out.println("\nParticipants in " + ai500.getCourseName() + ":");
        displayParticipants(ai500.getParticipants());
    }

    /**
     * Display the participants in a course
     */
    private static void displayParticipants(List<Person> participants) {
        for (Person person : participants) {
            System.out.println(person.getName() + " - " + person.getRole());
        }
    }
}
