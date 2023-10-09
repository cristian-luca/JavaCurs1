package javaExercises.chapter3SkillBrain.demo;

public class Warehouseman extends Employee {



    @Override
    double calculateSalary() {
        return 2.5 * reference;
    }

    @Override
    String getName() {
       return  "Angajatul care gestioneaza marfuri se numeste " + firstName + " " + lastName;
    }

    public Warehouseman(String firstName, String lastName, int age, String employmentDate, int reference) {
        super(firstName, lastName, age, employmentDate);
        this.reference = reference;
    }
}
