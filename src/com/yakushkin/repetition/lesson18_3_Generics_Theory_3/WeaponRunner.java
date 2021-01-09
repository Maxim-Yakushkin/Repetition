package com.yakushkin.repetition.lesson18_3_Generics_Theory_3;

import com.yakushkin.repetition.lesson18_3_Generics_Theory_3.hero.Archer;
import com.yakushkin.repetition.lesson18_3_Generics_Theory_3.hero.Hero;
import com.yakushkin.repetition.lesson18_3_Generics_Theory_3.hero.Warrior;
import com.yakushkin.repetition.lesson18_3_Generics_Theory_3.weapon.Bow;
import com.yakushkin.repetition.lesson18_3_Generics_Theory_3.weapon.Sword;
import com.yakushkin.repetition.lesson18_3_Generics_Theory_3.weapon.Weapon;

public class WeaponRunner {
    public static void main(String[] args) {
        Archer<Bow> legolas = new Archer<>("Legolas", 10);
        legolas.setWeapon(new Bow());

        Warrior<Sword> boromir = new Warrior<>("Boromir", 15);
        boromir.setWeapon(new Sword());

        printWeaponDamageFirstVariant(legolas);
        printWeaponDamageFirstVariant(boromir);

        System.out.println("--------------------------");

        printWeaponDamageSecondVariant(legolas);
        printWeaponDamageSecondVariant(boromir);
    }

    public static <T extends Weapon> void printWeaponDamageFirstVariant(Hero<T> hero) {
        System.out.println(hero.getWeapon().getDamage());
    }

    // ? (wildcard) — вместо типа использовать вопросительный знак. Они используются тогда, когда нужно абстрагироваться от конкретных аргументов типа
    //Подробнее: http://cyclowiki.org/wiki/Generic_(Java)
    public static void printWeaponDamageSecondVariant(Hero<? extends Weapon> hero) {
        System.out.println(hero.getWeapon().getDamage());
    }
}
