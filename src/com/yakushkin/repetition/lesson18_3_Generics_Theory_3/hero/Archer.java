package com.yakushkin.repetition.lesson18_3_Generics_Theory_3.hero;

import com.yakushkin.repetition.lesson18_3_Generics_Theory_3.weapon.RangeWeapon;

public class Archer<T extends RangeWeapon> extends Hero<T> {

    private Wolf wolf;

    public Archer(String name, Integer damage) {
        super(name, damage);
        this.wolf = new Wolf("Wolf", 7);
    }

    @Override
    public void attackEnemy(Enemy enemy, Integer damage) {
        System.out.println(String.format("%s (%s) выстрелил из лука в %s (%d)!",
                this.getName(), this.getClass().getSimpleName(), enemy.getName(), damage));
        wolf.attackEnemy(enemy);
    }

    class Wolf {
        private String name;
        private int damage;

        public Wolf(String name, int damage) {
            this.name = name;
            this.damage = damage;
        }

        public void attackEnemy(Enemy enemy) {
            System.out.println(name + " и " + Archer.this.getName() + " наносят совместный урон");
            enemy.takeDamage(damage + Archer.this.getDamage());
        }
    }
}
