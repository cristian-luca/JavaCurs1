package javaExercises.testJava;

public class ExNr3 {
    static char x = 'g';
    public static void main(String[] args) {
    switch (x) {
            case 'a':
                System.out.println("Rosu");
                break;
            case 'b':
                System.out.println("Galben");
                break;
            case 'c':
                System.out.println("Albastru");
                break;
            case 'd':
                System.out.println("Violet");
                break;
            case 'e':
                System.out.println("Verde");
                break;
            case 'f':
            case 'g':             //Portocaliu
            case 'h':
                System.out.println("Portocaliu");
                break;
            default:
                System.out.println("val default : Alb");
        }
    }
}
