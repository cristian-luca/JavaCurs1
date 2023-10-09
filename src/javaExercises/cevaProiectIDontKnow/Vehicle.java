package javaExercises.cevaProiectIDontKnow;

public class Vehicle {
    private String make, model;
    private double rentalRatePerDay;

    public Vehicle(String make, String model, double rentalRatePerDay) {
        this.make = make;
        this.model = model;
        this.rentalRatePerDay = rentalRatePerDay;
    }

    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Chiria pe zi: " + rentalRatePerDay);
    }

    public void calculateChirie(int nrDays) {
        System.out.println("Chiria pentru " + make + " " + model + " inchiriata pe " + nrDays + " zile este de " + rentalRatePerDay * nrDays + " euro.");
    }
}
