import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Student> students;
    private List<Teacher> teachers;
    private List<Subject> subjects;

    public School() {
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
        this.subjects = new ArrayList<>();
    }

    public void admitStudent(Student student) {
        students.add(student);
    }

    public void hireTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void takeSubject(Subject subject) {
        subjects.add(subject);
    }

    public void displaySchoolInfo() {
        System.out.println("Students in the school: ");
        for (Student student :students) {
            System.out.println(student);
        }

        System.out.println("\nTeachers in the school: ");
        for (Teacher teacher :teachers) {
            System.out.println(teachers);
        }

        System.out.println("\nSubjects offered in the school: ");
        for (Subject subject : subjects) {
            System.out.println("Subject: "
                    + subject.getTeacher().getSubject()
                    + " | Teacher: "
                    + subject.getTeacher().getName());
            subject.displayRegisteredStudents();
            System.out.println();
        }
    }
}
