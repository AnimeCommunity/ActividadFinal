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

    public abstract double calculateSalary();

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public String toString() {
        return String.format("%s - Salary: %.2f", name, calculateSalary());
    }
}
