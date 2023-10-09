package javaExercises.chapter3;

public class EncapsulationClass {
    private String text1 = "Hello, world!";
    private String text2;

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }

    public void displayMessage() {
        System.out.println(text1 + " " + text2);
    }

    public static void main(String[] args) {
        EncapsulationClass obj = new EncapsulationClass();
        obj.setText1("Ana are");
        obj.setText2("mere rosii");
        obj.displayMessage();
        obj.setText1("sex feminin");
        System.out.println(obj.getText1());
    }
}
