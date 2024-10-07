import Classes.*;
import Interfaces.Course;

import java.util.ArrayList;
import java.util.List;

/**
 * Main class that simulates the university management system and its functionality.
 */
public class University {
    public static void main(String[] args) {
        // Create students and professors
        Student student1 = new Student("Bob", 21, "456 Rock St");
        Student student2 = new Student("John", 20, "123 Main St");
        Professor professor1 = new Professor("Dr. Smith", 45, "789 Pine St", "Computer Science");
        Professor professor2 = new Professor("Dr. Ariel", 48, "101 Luna Ave", "Computer Science");

        // Create courses
        GraduateCourse course1 = new GraduateCourse("Advanced AI", "Artificial Intelligence");
        UndergraduateCourse course2 = new UndergraduateCourse("Intro to JAVA");

        // Add participants to courses
        course1.addParticipant(professor1);
        course1.addParticipant(professor2);
        course1.addParticipant(student1);

        course2.addParticipant(student1);
        course2.addParticipant(student2);
        course2.addParticipant(professor1);

        // Add courses to a list
        List<Course> courses = new ArrayList<>();
        courses.add(course1);
        courses.add(course2);

        // Display courses participants
        courses.forEach(course -> {
            System.out.println("Participants in " + course.getCourseName() + ":");
            displayParticipants(course.getParticipants());
            System.out.println("\n");
        });
    }

    /**
     * Display the participants in a course
     */
    private static void displayParticipants(List<Person> participants) {
        for (Person person : participants) {
            if (person instanceof Professor)
                System.out.println("teach()\t\t\t" + ((Professor) person).teach());
            else if (person instanceof Student)
                System.out.println("study()\t\t\t" + ((Student) person).study());
            System.out.println("getName()\t\t" + person.getName());
            System.out.println("getAge()\t\t" + person.getAge());
            System.out.println("getAddress()\t" + person.getAddress());
            System.out.println("getRole()\t\t" + person.getRole());
            System.out.println("---");
        }
    }
}
