package javaExercises.chapter1;

public class ParsareaArgumentelor {
    public static void main(String[] args) {
        //System.out.println(f(3));
        int x = 2;
        int y = 3;
        for(int i = 0; i < 5; i++){
            System.out.println("i: " + i);
            if (i == x) {
                System.out.println("continui iteratia");
                //continue;
            } else if (i == y) {
                System.out.println("am iesit din for");
                break;
            } else {
                System.out.println("closed");
            }
        }
    }
    public static int f(int z) {
        return ++z;
    }
}
