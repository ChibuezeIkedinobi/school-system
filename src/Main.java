public class Main {
    public static void main(String[] args) {
        Student ikedi = new Student("Ikedinobi", 27, 1200);
        Student uju = new Student("Ononuju", 20, 1201);

        Teacher zik = new Teacher("Mr. Nathan", 30, "Java");

        Subject computer = new Subject("Java", zik);

        computer.registerStudent(ikedi);
        computer.registerStudent(uju);

        School school = new School();
        school.admitStudent(ikedi);
        school.admitStudent(uju);

        school.hireTeacher(zik);
        school.takeSubject(computer);

        school.displaySchoolInfo();


    }
}