package Classes;

import Interfaces.Course;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a graduate course with a research focus and participants.
 */
public class GraduateCourse implements Course {
    /**
     * The name of the course (private)
     */
    private String courseName;

    /**
     * The course code (private)
     */
    private String courseCode;

    /**
     * The research focus of the course (private)
     */
    private String researchFocus;

    /**
     * List of participants in the course (private)
     */
    private List<Person> participants = new ArrayList<>();

    /**
     * Constructor for the GraduateCourse class
     *
     * @param courseName    - The name of the course
     * @param courseCode    - The course code
     * @param researchFocus - The research focus of the course
     */
    public GraduateCourse(String courseName, String courseCode, String researchFocus) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.researchFocus = researchFocus;
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
     * Adds a participant to the list
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

    /**
     * Returns the research focus of the course (private)
     */
    public String getResearchFocus() {
        return researchFocus;
    }
}
