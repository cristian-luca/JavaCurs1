package javaExercises.chapter1;

import utils.Utils;

public class NumberDaysInMonth {
    public static void main(String[] args) {

        System.out.println("Enter a month from 1 to 12: ");     //I numbered every month of the year
        int month = Utils.scanner().nextInt();
        System.out.println("Enter a year: ");
        int year = Utils.scanner().nextInt();

        int numDays;
        switch (month) {
            case 2:
                if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
                    numDays = 29;           //leap year
                } else {
                    numDays = 28;
                }
                break;
            case 3:
            case 5:
            case 7:
            case 8:
            case 12:
                numDays = 31;
                break;
            default:
                numDays = 30;
                break;
        }
        System.out.println("There are " + numDays + " days in " + month + " month " + "of " + year + " year" + ".");
    }
}
