package com.yakushkin.repetition.lesson18_2_Generics_Theory_2;

import com.yakushkin.repetition.lesson16_1_Vnutrennie_Vlojennie_Class.Enemy;

public abstract class Hero {

    private String name;
    private Integer damage;

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
}
