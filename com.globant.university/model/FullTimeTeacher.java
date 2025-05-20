package model;

public class FullTimeTeacher extends Teacher {

    //profesor a tiempo completo
    
    public FullTimeTeacher(String name, double baseSalary, int experienceYears) {
        super(name, baseSalary, experienceYears);
    }

    @Override
    public double calculateSalary() {
        return baseSalary * (1 + 0.1 * experienceYears);
    }

    @Override
    public String toString() {
        return "FullTime - " + super.toString();
    }
}
