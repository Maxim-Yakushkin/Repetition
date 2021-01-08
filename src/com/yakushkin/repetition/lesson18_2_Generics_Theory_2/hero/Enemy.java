package com.yakushkin.repetition.lesson18_2_Generics_Theory_2.hero;

public class Enemy implements Mortal {

    private final String name;
    private Integer health;

    public Enemy(String name, Integer health) {
        this.name = name;
        this.health = health;
    }

    public void takeDamage(Integer damage) {
        if (isAlive() && health <= damage) {
            health = 0;
            System.out.println(getName() + " погиб!".toUpperCase());
        } else {
            this.health -= Math.min(health, damage);
            System.out.println(name + " получил урон " + damage + ". Осталось " + health);
        }
    }

    @Override
    public boolean isAlive() {
        return this.health > 0;
    }

    public String getName() {
        return name;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }
}
