package javaExercises.chapter2;

import utils.Utils;

public class Arrays {
    public static void main(String[] args) {
        Arrays arrays  = new Arrays();
        System.out.println("Sa introduci un numar intreg ca sa il convertesti in String: " );
        System.out.println(arrays.conversie(Utils.scanner().nextInt()));
        System.out.println("Sa introduci un character si sa il convertesti in String: ");
        System.out.println(arrays.conversie(Utils.scanner().next().charAt(0)));
    }
    //transform an int to string
    public String conversie (int test) {
        return String.valueOf(test);   //"" + test  //Integer.toString(test)
    }

    public String conversie (char test) {
        return Character.toString(test);   //"" + test  //Integer.toString(test)
    }
}
