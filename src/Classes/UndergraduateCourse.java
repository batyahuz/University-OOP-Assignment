package Classes;

import Interfaces.Course;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Represents an undergraduate course with participants and course details.
 */
public class UndergraduateCourse implements Course {
    /**
     * The name of the course (private)
     */
    private String courseName;
    /**
     * The course code (private)
     */
    private String courseCode;
    /**
     * List of participants in the course (private)
     */
    private List<Person> participants = new ArrayList<>();

    /**
     * Constructor for the UndergraduateCourse class
     *
     * @param courseName - The name of the course
     */
    public UndergraduateCourse(String courseName) {
        this.courseName = courseName;
        this.courseCode = UUID.randomUUID().toString();;
    }

    /**
     * Returns the name of the course
     */
    @Override
    public String getCourseName() {
        return courseName;
    }

    /**
     * Returns the course code
     */
    @Override
    public String getCourseCode() {
        return courseCode;
    }

    /**
     * Adds a person to the course
     */
    @Override
    public void addParticipant(Person person) {
        participants.add(person);
    }

    /**
     * Returns the list of participants in the course
     */
    @Override
    public List<Person> getParticipants() {
        return participants;
    }
}

