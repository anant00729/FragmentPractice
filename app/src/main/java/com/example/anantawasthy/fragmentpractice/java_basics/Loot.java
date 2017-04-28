package com.example.anantawasthy.fragmentpractice.java_basics;

/**
 * Created by anantawasthy on 4/26/17.
 */

enum LootType {POTION,ARMOUR,SHIELD};

public class Loot {
    private String name;
    private LootType lootType;
    private int value;

    public Loot(String name, LootType lootType, int value) {
        this.name = name;
        this.lootType = lootType;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LootType getLootType() {
        return lootType;
    }

    public void setLootType(LootType lootType) {
        this.lootType = lootType;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
