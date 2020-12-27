package com.yakushkin.repetition.lesson16_1_Vnutrennie_Vlojennie_Class;

public class Mage extends Hero {

    public Mage(String name, Integer damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy, Integer damage) {
        System.out.println(String.format("%s (%s) наложил заклинание на %s (%s)!",
                this.getName(), this.getClass().getSimpleName(), enemy.getName(), damage));
        enemy.takeDamage(damage);
    }
}
