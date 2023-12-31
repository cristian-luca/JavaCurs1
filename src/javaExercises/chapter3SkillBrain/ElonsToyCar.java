package javaExercises.chapter3SkillBrain;

public class ElonsToyCar {

    private int battery = 100;
    private int totalDistance;

    public static void main(String[] args) {
        ElonsToyCar car1 = ElonsToyCar.buy();
        System.out.println(car1);
        System.out.println(car1.distanceDisplay());
        System.out.println(car1.displayBattery());
        car1.drive();
        car1.drive();
        System.out.println("===============================");
        System.out.println(car1.distanceDisplay());
        System.out.println(car1.displayBattery());
        for (int i = 0; i < 200; i++) {
            car1.drive();
        }
        System.out.println(car1.distanceDisplay());
        System.out.println(car1.displayBattery());
    }

    public void drive() {
        if (battery > 0) {
            totalDistance += 20;
            battery -= 1;
        }
    }
    public  static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + totalDistance + " meters.";
    }

    public String displayBattery() {
        if (battery <= 0) {
            return "Battery is empty";
        }
        return "Battery is at " + battery + " %.";
    }
}
/*
Instructions
In this exercise you'll be playing around with a remote controlled car, which you've finally saved enough money for to buy.

Cars start with full (100%) batteries. Each time you drive the car using the remote control, it covers 20 meters and drains one percent of the battery.

The remote controlled car has a fancy LED display that shows two bits of information:

The total distance it has driven, displayed as: "Driven <METERS> meters".
The remaining battery charge, displayed as: "Battery at <PERCENTAGE>%".
If the battery is at 0%, you can't drive the car anymore and the battery display will show "Battery empty".

You have six tasks, each of which will work with remote controlled car instances.

1. Buy a brand-new remote controlled car
Implement the (static) ElonsToyCar.buy() method to return a brand-new remote controlled car instance:

ElonsToyCar car = ElonsToyCar.buy();
2. Display the distance driven
Implement the ElonsToyCar.distanceDisplay() method to return the distance as displayed on the LED display:

ElonsToyCar car = ElonsToyCar.buy();
car.distanceDisplay();
// => "Driven 0 meters"
3. Display the battery percentage
Implement the ElonsToyCar.batteryDisplay() method to return the distance as displayed on the LED display:

ElonsToyCar car = ElonsToyCar.buy();
car.batteryDisplay();
// => "Battery at 100%"
4. Update the number of meters driven when driving
Implement the ElonsToyCar.drive() method that updates the number of meters driven:

ElonsToyCar car = ElonsToyCar.buy();
car.drive();
car.drive();
car.distanceDisplay();
// => "Driven 40 meters"
5. Update the battery percentage when driving
Update the ElonsToyCar.drive() method to update the battery percentage:

ElonsToyCar car = ElonsToyCar.buy();
car.drive();
car.drive();
car.batteryDisplay();
// => "Battery at 98%"
6. Prevent driving when the battery is drained
Update the ElonsToyCar.drive() method to not increase the distance driven nor decrease the battery percentage when the battery is drained (at 0%):

ElonsToyCar car = ElonsToyCar.buy();

// Drain the battery
// ...

car.distanceDisplay();
// => "Driven 2000 meters"

car.batteryDisplay();
// => "Battery empty"

 */
