package javaExercises.inheritance.inheritanceExample;

public class Main {



    public static void main(String[] args) {
        Pisica pisica = new Pisica();
        Animal pisica2 =  new Pisica();
        Animal x = (Animal) pisica;   //Casting 'pisica' to 'Animal' is redundant
        // Caine caine = (Caine) new Pisica(); //nu are cum Cainele e un animal independent Pisica nu poate fi facuta caine
        pisica.zgarie();
        pisica2.zgarie();
    }


}
