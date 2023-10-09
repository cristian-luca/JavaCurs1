package javaExercises.modificatoriacces;

public class Elefant extends Animal {
    public final int VARSTA; //folositi underscore la mai multe cuvinte in denumirea variabilei

    public Elefant() {
        this.VARSTA = 150;
    }
    public Elefant(int varsta) {
        this.VARSTA = varsta;
    }

    private void seJoaca(){
        System.out.println("Elefantul se joaca.");
    }

    public void seJoacaCuTrompa(){
        System.out.println("Elefantul este jucaus cu trompa.");
    }

    public void schimbareVarsta(int varsta){
        // this.VARSTA = varsta;  variabila final nu poate fi initializata int-o metoda
        // ea trebuie initializata unde este creata sau intr-un constructor
    }
}
