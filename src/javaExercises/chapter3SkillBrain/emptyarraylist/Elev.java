package javaExercises.chapter3SkillBrain.emptyarraylist;

public class Elev {

    int idElev;
    String nameElev;

    public Elev(int myIdElev, String myNameElev) {
        idElev = myIdElev;
        nameElev = myNameElev;
    }
    public String toString() {
        return "[" + idElev + "," + nameElev + "]";
    }
}
