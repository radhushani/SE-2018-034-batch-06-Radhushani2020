package com.company;

public class Monster {
    String name;
    int age;

    public Monster(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void StealStick(Warrior warrior){
        System.out.println("Monster " + this.name + " has stolen Warrior " + warrior.name + "'s walking stick.");
        warrior.HaveStick(false);
    }
}
