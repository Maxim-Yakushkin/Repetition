package com.yakushkin.repetition.lesson18_2_Generics_Theory_2.hero;

import com.yakushkin.repetition.lesson18_2_Generics_Theory_2.weapon.Weapon;

public abstract class Hero<T extends Weapon> {

    private String name;
    private Integer damage;
    private T weapon;

    public abstract void attackEnemy(Enemy enemy, Integer damage);

    public Hero(String name, Integer damage) {
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public Integer getDamage() {
        return damage;
    }

    public T getWeapon() {
        return weapon;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }
}
