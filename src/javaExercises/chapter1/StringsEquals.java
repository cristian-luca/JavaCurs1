package javaExercises.chapter1;

import utils.Utils;

public class StringsEquals {
    public static void main(String[] args) {
        System.out.println("Read string1 object from keyboard: ");
        String string1 = Utils.scanner().nextLine();
        System.out.println("Read string2 object from keyboard: ");
        String string2 = Utils.scanner().nextLine();

        String result = ((string1.equals(string2))? "These strings are equals": "These strings aren't equals");
        System.out.println(result);

        /*
        I can use The equalsIgnoreCase() method compares two strings,
         ignoring lower case and upper case differences.
         */
    }
}
