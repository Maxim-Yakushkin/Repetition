package com.yakushkin.repetition.lesson15_1_OOP_Practic;

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
