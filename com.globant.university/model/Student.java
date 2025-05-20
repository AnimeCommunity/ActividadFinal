package model;

public class Student {
    private static int nextId = 1;
    private int id;
    private String name;
    private int age;

    public Student(String name, int age) {
        this.id = nextId++;
        this.name = name;
        this.age = age;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }

    @Override
    public String toString() {
        return "ID: " + id + " | " + name + " | Age: " + age;
    }
    
}
