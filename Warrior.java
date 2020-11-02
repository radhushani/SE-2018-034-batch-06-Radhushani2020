package com.company;

public class Warrior {
    String name;
    int age;

    public Warrior(String name,int age){
        this.name = name;
        this.age = age;
        HaveStick(true);
    }
    public void HaveStick(boolean stick){
        if(stick){
            walk();
        }
        else{
            fail();
        }
    }
    public void walk(){
        System.out.println("Warrior " + this.name + " is alive and walking");
    }
    public void fail(){
        System.out.println("Warrior " + this.name + " has lost stick and immobile");
    }
}
