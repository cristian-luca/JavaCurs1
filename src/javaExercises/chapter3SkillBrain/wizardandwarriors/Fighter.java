package javaExercises.chapter3SkillBrain.wizardandwarriors;

public abstract class Fighter {
    boolean isVulnerable() {
            return false;   //am testat si cu true
    }
    abstract int damagePoints(Fighter fighter);

    @Override
    public String toString() {
        return "Fighter is " + this.getClass().getSimpleName();
    }
}
