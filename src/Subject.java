import java.util.ArrayList;
import java.util.List;

public class Subject {

    private String subjectName;
    private Teacher teacher;
    private List<Student> registeredStudents;

    public Subject(String subjectName, Teacher teacher) {
        this.subjectName = subjectName;
        this.teacher = teacher;
        this.registeredStudents = new ArrayList<>();
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void registerStudent(Student student) {
        registeredStudents.add(student);
    }

    public void displayRegisteredStudents() {
        for (Student student : registeredStudents) {
            System.out.println(student);
        }
    }
}
