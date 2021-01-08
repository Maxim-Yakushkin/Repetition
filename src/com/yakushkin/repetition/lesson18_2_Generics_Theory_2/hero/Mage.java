package com.yakushkin.repetition.lesson18_2_Generics_Theory_2.hero;

import com.yakushkin.repetition.lesson18_2_Generics_Theory_2.weapon.MagicWeapon;

public class Mage<T extends MagicWeapon> extends Hero<T> {

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
