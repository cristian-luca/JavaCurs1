package javaExercises.cevaProiectIDontKnow;

public class aVeryLostMainFunction {
    public static void main(String[] args) {
        System.out.println("==================");

        Bicicleta bicicleta = new Bicicleta("bicicleta", "pegas", 15, 10);
        Masina masina = new Masina("masina", "vw", 23, 2);
        Motocicleta motocicleta = new Motocicleta("motoreta", "yamaha", 12, 2);

        bicicleta.displayInfo();
        System.out.println("==================");
        masina.displayInfo();
        System.out.println("==================");
        motocicleta.displayInfo();
        System.out.println("====================================================================");

        bicicleta.calculateChirie(6);
        masina.calculateChirie(7);
        motocicleta.calculateChirie(8);

    }
}
