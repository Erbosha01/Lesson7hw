package com.company;

public class Main {

    public static void main(String[] args) {
        HavingSuperAbility[] superAbilities = {new Magic(), new Medic(), new Warrior()};
        for (int i = 0; i < superAbilities.length; i++) {
            System.out.println(superAbilities[i].applySuperAbility("kldjflkjsdkfsdjlk"));

        }
    }
}
