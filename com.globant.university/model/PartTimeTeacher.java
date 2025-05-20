package model;

public class PartTimeTeacher extends Teacher {
    //trabaja x horas

    private int hoursPerWeek;

    public PartTimeTeacher(String name, double baseSalary, int experienceYears, int hoursPerWeek) {
        super(name, baseSalary, experienceYears);
        this.hoursPerWeek = hoursPerWeek;
    }

    @Override
    public double calculateSalary() {
        return baseSalary * hoursPerWeek;
    }

    public int getHoursPerWeek() {
        return hoursPerWeek;
    }

    @Override
    public String toString() {
        return "PartTime - " + super.toString() + " | Hours/Week: " + hoursPerWeek;
    }
}
