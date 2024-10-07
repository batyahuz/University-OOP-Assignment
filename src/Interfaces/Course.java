package Interfaces;

import Classes.Person;

import java.util.List;

/**
 * Interface defining the structure for courses at the university.
 */
public interface Course {
    /**
     * Returns the name of the course
     */
    String getCourseName();

    /**
     * Returns the course code
     */
    String getCourseCode();

    /**
     * Adds a person to the course
     */
    void addParticipant(Person person);

    /**
     * Returns the list of participants in the course
     */
    List<Person> getParticipants();
}

