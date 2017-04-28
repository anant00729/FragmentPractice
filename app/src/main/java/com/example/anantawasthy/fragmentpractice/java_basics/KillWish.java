package com.example.anantawasthy.fragmentpractice.java_basics;

/**
 * Created by anantawasthy on 4/26/17.
 */

public class KillWish extends Enemy{

    public KillWish(String name){
        super(name,28,4);
    }

    public KillWish(String name, int hitPoints,int lives){
        super(name,hitPoints,lives);
    }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage/2);
    }
}
