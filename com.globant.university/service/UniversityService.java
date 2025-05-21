package service;

import model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UniversityService {
    private List<Teacher> teachers = new ArrayList<>();
    private List<Student> students = new ArrayList<>();
    private List<UniversityClass> classes = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public UniversityService() {
        initData();
    }

    private void initData() {
        // Teachers
        teachers.add(new FullTimeTeacher("Esteban", 1000, 5));
        teachers.add(new FullTimeTeacher("Silvana", 1100, 3));
        teachers.add(new PartTimeTeacher("Charlie", 40, 0, 10));
        teachers.add(new PartTimeTeacher("Diana", 50, 0, 8));

        // Students
        students.add(new Student("Jeidy", 20));
        students.add(new Student("Gustavo", 22));
        students.add(new Student("Felipe", 19));
        students.add(new Student("Madelin", 21));
        students.add(new Student("Marco", 23));
        students.add(new Student("Santiago", 20));

        // Classes
        UniversityClass class1 = new UniversityClass("Math 101", "Room A", teachers.get(0));
        class1.addStudent(students.get(0));
        class1.addStudent(students.get(1));

        UniversityClass class2 = new UniversityClass("Programming 201", "Room B", teachers.get(2));
        class2.addStudent(students.get(2));
        class2.addStudent(students.get(3));

        UniversityClass class3 = new UniversityClass("English 101", "Room C", teachers.get(1));
        class3.addStudent(students.get(4));
        class3.addStudent(students.get(5));

        UniversityClass class4 = new UniversityClass("Design 301", "Room D", teachers.get(3));
        class4.addStudent(students.get(1));
        class4.addStudent(students.get(3));

        classes.add(class1);
        classes.add(class2);
        classes.add(class3);
        classes.add(class4);
    }

    public void printTeachers() {
        for (Teacher t : teachers) {
            System.out.println(t);
        }
    }

    public void printClasses(boolean withDetails) {
        for (int i = 0; i < classes.size(); i++) {
            System.out.println((i + 1) + ". " + classes.get(i));
        }

        if (withDetails) {
            System.out.print("Select class index: ");
            int index = scanner.nextInt() - 1;
            if (index >= 0 && index < classes.size()) {
                System.out.println(classes.get(index).getFullDetails());
            }
        }
    }

    public void createStudent() {
        scanner.nextLine();
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        Student student = new Student(name, age);
        students.add(student);

        printClasses(false);
        System.out.print("Select class index to add the student: ");
        int index = scanner.nextInt() - 1;
        if (index >= 0 && index < classes.size()) {
            classes.get(index).addStudent(student);
            System.out.println("Student added");
        }
    }

    public void createClass() {
        scanner.nextLine();
        System.out.print("Class name: ");
        String name = scanner.nextLine();
        System.out.print("Classroom: ");
        String room = scanner.nextLine();

        System.out.println("Select a teacher:");
        for (int i = 0; i < teachers.size(); i++) {
            System.out.println((i + 1) + ". " + teachers.get(i).getName());
        }
        int teacherIndex = scanner.nextInt() - 1;

        UniversityClass newClass = new UniversityClass(name, room, teachers.get(teacherIndex));

        System.out.println("Select students (type -1 to finish):");
        for (int i = 0; i < students.size(); i++) {
            System.out.println((i + 1) + ". " + students.get(i));
        }

        while (true) {
            int sIndex = scanner.nextInt() - 1;
            if (sIndex == -2) break;
            if (sIndex >= 0 && sIndex < students.size()) {
                newClass.addStudent(students.get(sIndex));
            }
        }

        classes.add(newClass);
        System.out.println("Class created.");
    }

    public void listClassesByStudentId() {
        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();
        Student found = null;
        for (Student s : students) {
            if (s.getId() == id) {
                found = s;
                break;
            }
        }

        if (found != null) {
            System.out.println("Classes for " + found.getName() + ":");
            for (UniversityClass c : classes) {
                if (c.getStudents().contains(found)) {
                    System.out.println("- " + c.getName());
                }
            }
        } else {
            System.out.println("Student not found");
        }
    }
}
