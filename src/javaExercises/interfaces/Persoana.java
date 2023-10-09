package javaExercises.interfaces;

public class Persoana {
    public static void main(String[] args) {
        AntrenorHandbal antrenorHandbal = new AntrenorHandbal();
        antrenorHandbal.alearga();
        antrenorHandbal.antreneaza();
        antrenorHandbal.nrEchipe(4);
        antrenorHandbal.sportAntrenor("handbal");
        antrenorHandbal.tipa();
        antrenorHandbal.suteaza();
        System.out.println("==================================");
        InstructorCisco instructorCisco = new InstructorCisco();
        instructorCisco.numeInstructor("Cristian");
        instructorCisco.experientaRetelistica(8);
        System.out.println("==================================");
        InstructorCisco instructor =  new InstructorCisco();
        instructor.experientaRetelistica(7);
        instructor.numeInstructor("Alex");
        instructor.corecteaza();
        instructor.evaluezaExamenul();
        instructor.preda();
        System.out.println("==================================");
        Instructor instructor1 = new InstructorCisco();
        instructor1.preda();
        instructor1.corecteaza();
        instructor1.evaluezaExamenul();
    }
}
