package com.example.anantawasthy.fragmentpractice.inheritence;

/**
 * Created by anantawasthy on 4/25/17.
 */


enum LootTypeInheritence {ARMOUR,SHIELD,POTION};
public class LootInheritenceDemo {
    private String name;
    private LootTypeInheritence lootTypeInheritence;
    private int value;

    public LootInheritenceDemo(String name, LootTypeInheritence lootTypeInheritence, int value) {
        this.name = name;
        this.lootTypeInheritence = lootTypeInheritence;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LootTypeInheritence getLootTypeInheritence() {
        return lootTypeInheritence;
    }

    public void setLootTypeInheritence(LootTypeInheritence lootTypeInheritence) {
        this.lootTypeInheritence = lootTypeInheritence;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
