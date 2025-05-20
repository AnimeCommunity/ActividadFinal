import service.UniversityService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        private UniversityService service = new UniversityService();
        private Scanner scanner = new Scanner(System.in);

        do{
        System.out.println("\nUniversity Tracker Menu:");
        System.out.println("1. Print all professors");
        System.out.println("2. Print all classes and select one");
        System.out.println("3. Create a new student and add to a class");
        System.out.println("4. Create a new class");
        System.out.println("5. List classes for a student by ID");
        System.out.println("6. Exit");
        System.out.print("Choose an option: ");
        
        option = scanner.nextInt();

        switch (option) {
            case 1 -> service.printTeachers();
            case 2 -> service.printClasses(true);
            case 3 -> service.createStudent();
            case 4 -> service.createClass();
            case 5 -> service.listClassesByStudentId();
            case 6 -> System.out.println("Exiting...");
            default -> System.out.println("Invalid option.");
        }
        } while (option != 6);
    }
}
