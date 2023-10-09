package javaExercises.interfaces;

public class InstructorCisco implements Instructor {

    public void experientaRetelistica(int nrAni) {
        System.out.println("Instructorul are: " + nrAni);
    }

    public void numeInstructor(String nume) {
        System.out.println("Numele antrenorului este: " + nume);
    }

    @Override
    public void preda() {
        System.out.println("Instuctorul Cisco preda.");
    }

    @Override
    public void corecteaza() {
        System.out.println("Instructorul Cisco corecteaza.");
    }

    @Override
    public void evaluezaExamenul() {
        System.out.println("Istructorul Cisco evalueaza examenul.");
    }
}
