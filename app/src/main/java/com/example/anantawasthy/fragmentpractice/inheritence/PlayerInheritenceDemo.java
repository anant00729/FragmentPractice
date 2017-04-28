package com.example.anantawasthy.fragmentpractice.inheritence;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by anantawasthy on 4/25/17.
 */

public class PlayerInheritenceDemo {

    private String handleName;
    private int score;
    private int levels;
    private int lives;
    private WeaponsInheritenceDemo weaponsInheritenceDemo;
    private ArrayList<LootInheritenceDemo> inventory;



    public PlayerInheritenceDemo(){
        this("Unknown Name");
    }


    public PlayerInheritenceDemo (String handle){
        this(handle,2);
    }
    public PlayerInheritenceDemo(String handle,int score){
        this.setHandleName(handle);
        this.setScore(score);
        this.setLives(4);
        this.setLevels(10);
        setDefaultWeapon();
        inventory = new ArrayList<>();

    }

    public List<LootInheritenceDemo> getLootInheritenceDemoList() {
        return inventory;
    }

    public void setLootInheritenceDemoList(ArrayList<LootInheritenceDemo> lootInheritenceDemoList) {
        this.inventory= lootInheritenceDemoList;
    }


    private void setDefaultWeapon() {
        weaponsInheritenceDemo = new WeaponsInheritenceDemo("SWORD" , 12 ,20);
    }

    public WeaponsInheritenceDemo getWeaponsInheritenceDemo() {
        return weaponsInheritenceDemo;
    }

    public void setWeaponsInheritenceDemo(WeaponsInheritenceDemo weaponsInheritenceDemo) {
        this.weaponsInheritenceDemo = weaponsInheritenceDemo;
    }

    public String getHandleName() {
        return handleName;
    }

    public void setHandleName(String handleName) {
        if(handleName.length()<3){
            System.out.println("The Name is Too Short ");
            return;
        }
        this.handleName = handleName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public void addItemToLoot(LootInheritenceDemo weLootInheritenceDemo){
        inventory.add(weLootInheritenceDemo);
    }

    public boolean dropItemFromLoot(LootInheritenceDemo loot){
        if(inventory.contains(loot)){
            System.out.println("=================================");
            System.out.println("Item Droped from the List");
            inventory.remove(loot);
            return true;
        }
        return false;
    }

    public void showItems(){
        int i = 1;
        for(LootInheritenceDemo loot : inventory){
            System.out.println("=============== "+i+" ===============");
            System.out.println("Name " + loot.getName() );
            System.out.println("Values " + loot.getValue());
            System.out.println("Loot type " + loot.getLootTypeInheritence());

            i++;
        }
    }

}
