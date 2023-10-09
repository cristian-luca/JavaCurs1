package javaExercises.chapter3SkillBrain.wizardandwarriors;

public class Wizard extends Fighter {
    private int spells;
    boolean isVulnerable() {
        return spells == 0;
    }

    public void prepareSpell() {
        spells++;
    }
    @Override
    int damagePoints(Fighter f) {
        if (spells == 0) {
            return 3;
        }
        spells --;
        return 12;
    }
}
