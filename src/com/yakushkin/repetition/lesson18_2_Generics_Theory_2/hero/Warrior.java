package com.yakushkin.repetition.lesson18_2_Generics_Theory_2.hero;

import com.yakushkin.repetition.lesson18_2_Generics_Theory_2.weapon.MeleeWeapon;

public class Warrior<T extends MeleeWeapon> extends Hero<T> {

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
