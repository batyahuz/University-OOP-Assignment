import java.util.ArrayList;
import java.util.List;

public class GraduateCourse implements Course {
    private String courseName;
    private String courseCode;
    private String researchFocus;
    private List<Person> participants = new ArrayList<>();

    public GraduateCourse(String courseName, String courseCode, String researchFocus) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.researchFocus = researchFocus;
    }

    @Override
    public String getCourseName() {
        return courseName;
    }

    @Override
    public String getCourseCode() {
        return courseCode;
    }

    @Override
    public void addParticipant(Person person) {
        participants.add(person);
    }

    @Override
    public List<Person> getParticipants() {
        return participants;
    }

    public String getResearchFocus() {
        return researchFocus;
    }
}
