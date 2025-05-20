package model;

public abstract class Teacher {
    protected String name;
    protected double baseSalary;
    protected int experienceYears;

    public Teacher(String name, double baseSalary, int experienceYears) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.experienceYears = experienceYears;
    }


}
