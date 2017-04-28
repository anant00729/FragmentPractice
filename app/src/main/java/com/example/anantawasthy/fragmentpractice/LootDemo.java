package com.example.anantawasthy.fragmentpractice;

/**
 * Created by anantawasthy on 4/25/17.
 */

enum LootDemoType {POTION, ARMOUR , SHIELD}

public class LootDemo {
    private String name;
    private LootDemoType lootDemoType;
    private int value;

    public LootDemo(String name, LootDemoType lootDemoType, int value) {
        this.name = name;
        this.lootDemoType = lootDemoType;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LootDemoType getLootDemoType() {
        return lootDemoType;
    }

    public void setLootDemoType(LootDemoType lootDemoType) {
        this.lootDemoType = lootDemoType;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
