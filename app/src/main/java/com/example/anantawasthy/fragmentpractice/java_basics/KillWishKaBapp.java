package com.example.anantawasthy.fragmentpractice.java_basics;

/**
 * Created by anantawasthy on 4/26/17.
 */

public class KillWishKaBapp extends KillWish{

    public KillWishKaBapp(String name){
        super(name,140,4);
    }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage/2);
    }
}
