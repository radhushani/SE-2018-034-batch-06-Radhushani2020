package com.company;

public class MyGame {

    public static void main(String[] args){
        Warrior warrior1 = new Warrior("Alex",75);
        Warrior warrior2 = new Warrior("Andrew",35);
        Monster monster = new Monster("Devil",100);

        warrior1.age = monster.age;
        monster.StealStick(warrior2);
    }
}
