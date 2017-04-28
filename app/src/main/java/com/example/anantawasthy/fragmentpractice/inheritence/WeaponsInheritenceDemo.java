package com.example.anantawasthy.fragmentpractice.inheritence;

/**
 * Created by anantawasthy on 4/25/17.
 */

public class WeaponsInheritenceDemo {
    private String name;
    private int damageInflicted;
    private int hitPointes;

    public WeaponsInheritenceDemo(String name, int damageInflicted, int hitPointes) {
        this.name = name;
        this.damageInflicted = damageInflicted;
        this.hitPointes = hitPointes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamageInflicted() {
        return damageInflicted;
    }

    public void setDamageInflicted(int damageInflicted) {
        this.damageInflicted = damageInflicted;
    }

    public int getHitPointes() {
        return hitPointes;
    }

    public void setHitPointes(int hitPointes) {
        this.hitPointes = hitPointes;
    }
}
