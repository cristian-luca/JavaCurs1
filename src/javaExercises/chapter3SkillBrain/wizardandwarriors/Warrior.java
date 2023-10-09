package javaExercises.chapter3SkillBrain.wizardandwarriors;

public class Warrior extends Fighter {

    @Override
    int damagePoints(Fighter f) {
        return f.isVulnerable() ? 10 : 6;
    }

    public static void main(String[] args) {
        Fighter warrior = new Warrior();
        System.out.println(warrior);
        Fighter warrior2 = new Warrior();
        System.out.println(warrior.damagePoints(warrior2));  //false=>6; true=>10
        Fighter wizard = new Wizard();
        System.out.println(wizard);
        System.out.println(warrior.damagePoints(wizard));
        System.out.println(wizard.damagePoints(warrior));
        ((Wizard)wizard).prepareSpell();
        System.out.println(warrior.damagePoints(wizard));
        System.out.println(wizard.damagePoints(warrior));
        System.out.println("Dupa vraja ================");
        System.out.println(warrior.damagePoints(wizard));
        System.out.println(wizard.damagePoints(warrior));

    }
}
/*
Instructions
In this exercise you're playing a role-playing game named "Wizards and Warriors,"
which allows you to play as either a Wizard or a Warrior.

There are different rules for Warriors and Wizards to determine how much damage
 points they deal.

For a Warrior, these are the rules:

Deal 6 points of damage if the fighter they are attacking is not vulnerable
Deal 10 points of damage if the fighter they are attacking is vulnerable
For a Wizard, these are the rules:

Deal 12 points of damage if the Wizard prepared a spell in advance
Deal 3 points of damage if the Wizard did not prepare a spell in advance
In general, fighters are never vulnerable. However, Wizards are vulnerable
 if they haven't prepared a spell.

You have six tasks that work with Warriors and Wizard fighters.

1. Describe a fighter
Override the toString() method on the Fighter class to return a description
of the fighter, formatted as "Fighter is a <FIGHTER_TYPE>".

Fighter warrior = new Warrior();
warrior.toString();
// => "Fighter is a Warrior"
2. Make fighters not vulnerable by default
Ensure that the Fighter.isVulnerable() method always returns false.

Fighter warrior = new Warrior();
warrior.isVulnerable();
// => false
3. Allow Wizards to prepare a spell
Implement the Wizard.prepareSpell() method to allow a Wizard to prepare a spell in advance.

Wizard wizard = new Wizard();
wizard.prepareSpell();
4. Make Wizards vulnerable when not having prepared a spell
Ensure that the isVulnerable() method returns true if the wizard did not prepare a spell;
 otherwise, return false.

Fighter wizard = new Wizard();
wizard.isVulnerable();
// => true
5. Calculate the damage points for a Wizard
Implement the Wizard.damagePoints() method to return the damage points dealt:
12 damage points when a spell has been prepared, 3 damage points when not.

Wizard wizard = new Wizard();
Warrior warrior = new Warrior();

wizard.prepareSpell();
wizard.damagePoints(warrior);
// => 12
6. Calculate the damage points for a Warrior
Implement the Warrior.damagePoints() method to return the damage points dealt:
 10 damage points when the target is vulnerable, 6 damage points when not.

Warrior warrior = new Warrior();
Wizard wizard = new Wizard();

warrior.damagePoints(wizard);
// => 10
 */
