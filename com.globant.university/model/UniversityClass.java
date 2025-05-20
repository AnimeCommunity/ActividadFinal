package model;

import java.util.ArrayList;
import java.util.List;

public class UniversityClass {
    private String name;
    private String classroom;
    private Teacher teacher;
    private List<Student> students;
    
    private List<FullTimeTeacher> fullTimeTeachers;
    private List<PartTimeTeacher> partTimeTeachers;

    public UniversityClass(String name, String classroom, Teacher teacher) {
        this.name = name;
        this.classroom = classroom;
        this.teacher = teacher;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public String getName() { return name; }
    public Teacher getTeacher() { return teacher; }
    public List<Student> getStudents() { return students; }

    @Override
    public String toString() {
        return name + " | Room: " + classroom + " | Teacher: " + teacher.getName();
    }

    public String getFullDetails() {
        StringBuilder sb = new StringBuilder(toString());
        sb.append("\nStudents:");
        for (Student s : students) {
            sb.append("\n - ").append(s.toString());
        }
        return sb.toString();
    }
}
