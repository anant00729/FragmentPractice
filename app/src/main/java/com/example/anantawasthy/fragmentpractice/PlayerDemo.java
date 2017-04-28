package com.example.anantawasthy.fragmentpractice;

import java.util.ArrayList;

/**
 * Created by anantawasthy on 4/25/17.
 */

public class PlayerDemo {

    private String handleName;
    private int level;
    private int score;
    private int lives;
    private WeaponDemo weaponDemo;
    private ArrayList<LootDemo> inventory;


    public PlayerDemo(){
        this("Unknown Name");
    }

    public PlayerDemo(String handle){
        this(handle,3);
    }

    public PlayerDemo(String handleName,int lives){
        setHandleName(handleName);
        setLives(lives);
        setLevel(12);
        setScore(100);
        setDefaultWeapon();
        inventory = new ArrayList<>();
    }

    private void setDefaultWeapon() {
        weaponDemo = new WeaponDemo("Sword", 10 ,20);
    }

    public WeaponDemo getWeaponDemo() {
        return weaponDemo;
    }

    public ArrayList<LootDemo> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<LootDemo> inventory) {
        this.inventory = inventory;
    }

    public void setWeaponDemo(WeaponDemo weaponDemo) {
        this.weaponDemo = weaponDemo;
    }


    public String getHandleName() {
        return handleName;
    }

    public void setHandleName(String handleName) {
        if(handleName.length() < 3){
            System.out.println("The Length of the Name Given is too Short");
            return;
        }
        this.handleName = handleName;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }


    public void addItemToInventory(LootDemo lootDemo){
        inventory.add(lootDemo);
    }

    public boolean dropItemInventory(LootDemo lootDemo){
        if(inventory.contains(lootDemo)){
            inventory.remove(lootDemo);
            return true;
        }
        return false;
    }

    public void showInventory(){
        int i = 1;
        for(LootDemo lootDemo : inventory){
            System.out.println("The "+i+" Name " + lootDemo.getName());
            System.out.println("The "+i+" Loot Type is " + lootDemo.getLootDemoType());
            System.out.println("The "+i+" Value is " + lootDemo.getValue());
            System.out.println("==========================================");
            i++;
        }

    }
}
