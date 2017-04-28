package com.example.anantawasthy.fragmentpractice;

/**
 * Created by anantawasthy on 4/25/17.
 */
enum LootType {POTION , RING , ARMOUR}

public class Loot {
    private String name;
    private LootType lootType;
    private int value;

    public Loot(String name, LootType lootType, int value){
        this.name = name;
        this.lootType = lootType;
        this.value = value;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setLootType(LootType lootType){
        this.lootType = lootType;
    }

    public void setValue(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    public String getName(){
        return name;
    }

    public LootType getLootType(){
        return lootType;
    }


}
