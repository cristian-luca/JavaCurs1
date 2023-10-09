package javaExercises.chapter3SkillBrain.demo;

public class HandlingRisk extends Warehouseman implements EmployeeRisk {


    @Override
    public void handleRisk() {
        System.out.println("Gestionez marfuri care implica cu risc inalt si primesc un spor extra.");
    }

    @Override
    public double calculateSalary() {
        return 3 * reference + monthlyPremium;
    }
    public HandlingRisk(String firstName, String lastName, int age, String employmentDate, int reference) {
        super(firstName, lastName, age, employmentDate, reference);
    }
}
