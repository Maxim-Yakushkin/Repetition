package com.yakushkin.repetition.lesson18_2_Generics_Theory_2;

import com.yakushkin.repetition.lesson18_2_Generics_Theory_2.hero.Archer;
import com.yakushkin.repetition.lesson18_2_Generics_Theory_2.hero.Warrior;
import com.yakushkin.repetition.lesson18_2_Generics_Theory_2.weapon.Bow;
import com.yakushkin.repetition.lesson18_2_Generics_Theory_2.weapon.Sword;

public class WeaponRunner {
    public static void main(String[] args) {
        Archer<Bow> legolas = new Archer<>("Legolas", 15);
        legolas.setWeapon(new Bow());

        Warrior<Sword> boromir = new Warrior<>("Boromir", 10);
        boromir.setWeapon(new Sword());
    }
}
