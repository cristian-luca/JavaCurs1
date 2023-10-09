package javaExercises.chapter3;

public class Car {
    String color;
    String model;
    String brand;
    String year;
    int speed;
    public Car(String color, String model, String brand, String year) {
        this.color = color;
        this.model = model;
        this.brand = brand;
        this.year = year;
    }

    public Car(String model, String brand, String year) {
        this.color = "white";
        this.model = model;
        this.brand = brand;
        this.year = year;

    }

    public static void main(String[] args) {
        Car car1 = new Car("M8", "BMW", "2023");
        System.out.println(car1.speed);
        car1.acceleration();
        car1.acceleration();
        car1.acceleration();
        car1.acceleration();
        car1.braking();
        car1.braking();
        car1.braking();
        car1.braking();
        car1.braking();
        car1.reverse();
        car1.reverse();
    }

    public void acceleration() {
        speed += 20;
        System.out.println("Current speed is: " + speed + "km/h" + " , current gear is " + changegear(speed));
    }

    public void braking() {
        speed -= 10;
        if (speed > 0) {
            speed -= 10;
            System.out.println("Current speed is: " + speed + "km/h");
        } else {
            System.out.println("Car is stopped");
        }
    }

    public String changegear(int speed) {
        switch (speed) {
            case 10:
                return "1 gear";
            case 20:
            case 30:
            case 40:
                return "2 gear";
            case 50:
                return "3 gear";
            case 60:
            case 70:
            case 80:
                return "4 gear";
            default:
                return "Neutral";
        }
    }

    public void reverse() {
        if (changegear(this.speed).equalsIgnoreCase("Neutral")) {
            speed -= 10;
            System.out.println("Reversing speed is: " + speed);
        } else {
            speed -= 10;
        }
    }
}
