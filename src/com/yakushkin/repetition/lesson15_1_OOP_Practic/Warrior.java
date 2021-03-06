package com.yakushkin.repetition.lesson15_1_OOP_Practic;

public class Warrior extends Hero {

    public Warrior(String name, Integer damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy, Integer damage) {
        System.out.println(String.format("%s (%s) нанес удар мечом по %s (%d)!",
                this.getName(), this.getClass().getSimpleName(), enemy.getName(), damage));
        enemy.takeDamage(damage);
    }
}
