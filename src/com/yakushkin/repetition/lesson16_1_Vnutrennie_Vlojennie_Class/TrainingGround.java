package com.yakushkin.repetition.lesson16_1_Vnutrennie_Vlojennie_Class;

public class TrainingGround {

    public static void main(String[] args) {



        Warrior warrior = new Warrior("Боромир", 15);
        Mage mage = new Mage("Гендальф", 20);
        Archer archer = new Archer("Леголас", 10);

        Enemy enemy = new Enemy("Зомби", 100);

        attack(enemy, warrior, mage, archer);
    }

    public static void attack(Enemy enemy, Hero... heroes) {
        while (enemy.isAlive()) {
            for (Hero hero : heroes) {
                if (enemy.isAlive()) {
                    hero.attackEnemy(enemy, hero.getDamage());
                    System.out.println();
                }
            }
        }
    }
}
