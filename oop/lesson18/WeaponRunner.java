package com.vpdev.oop.lesson18;

import com.vpdev.oop.lesson15.Archer;
import com.vpdev.oop.lesson15.Hero;
import com.vpdev.oop.lesson15.Warrior;
import com.vpdev.oop.lesson18.weapon.Bow;
import com.vpdev.oop.lesson18.weapon.Sword;

import java.util.ArrayList;


public class WeaponRunner {
    ArrayList<String> arrayList = new ArrayList<>();

    public static void main(String[] args) {
        Archer<Bow> archer = new Archer<>("Леголас", 15);
        archer.setWeapon(new Bow());

        Warrior<Sword> warrior = new Warrior<>("Боромир", 10);
        warrior.setWeapon(new Sword());

        printWeaponDamage(warrior);
    }

    //                                       Warrior<----->
    public static void printWeaponDamage(Hero<Sword> hero) {
        Sword weapon = hero.getWeapon();
        hero.setWeapon(new Sword());
        System.out.println(hero.getWeapon().getDamage());
    }
}