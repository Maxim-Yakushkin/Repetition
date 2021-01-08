package com.yakushkin.repetition.lesson18_2_Generics_Theory_2;

import com.yakushkin.repetition.lesson18_2_Generics_Theory_2.hero.Archer;
import com.yakushkin.repetition.lesson18_2_Generics_Theory_2.hero.Warrior;
import com.yakushkin.repetition.lesson18_2_Generics_Theory_2.weapon.Bow;
import com.yakushkin.repetition.lesson18_2_Generics_Theory_2.weapon.Sword;

public class WeaponRunner {
    public static void main(String[] args) {
        Archer<Bow> legolas = new Archer<>("Legolas", 10);
        legolas.setWeapon(new Bow());
        Integer damage = legolas.getDamage();
        int legolasDamage = legolas.getWeapon().getDamage();
        System.out.println(damage + "\n" + legolasDamage);

        System.out.println();

        Warrior<Sword> boromir = new Warrior<>("Boromir", 15);
        boromir.setWeapon(new Sword());
        Integer damage1 = boromir.getDamage();
        int boromirDamage = boromir.getWeapon().getDamage();

        System.out.println(damage1 + "\n" +boromirDamage);
    }
}
