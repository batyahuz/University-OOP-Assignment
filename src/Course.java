import java.util.List;

public interface Course {
    String getCourseName();

    String getCourseCode();

    void addParticipant(Person person);

    List<Person> getParticipants();
}

