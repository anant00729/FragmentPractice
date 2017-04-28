package com.example.anantawasthy.fragmentpractice.java_basics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by anantawasthy on 4/26/17.
 */

public class Player {
    private String handlerName;
    private int lives;
    private int levels;
    private int score;
    private Weapon weapon;
    private List<Loot> inventory;


    public Player(){
        this("Unknown Name");
    }


    public Player(String handle){
        this(handle,3);
    }
    public Player(String handlerName, int lives) {
        this.setHandlerName(handlerName);
        this.setLives(lives);
        this.setLevels(12);
        this.setScore(100);
        setDefauldWeapon();
        inventory = new ArrayList<>();
    }

    public void setDefauldWeapon(){
        weapon = new Weapon("Sword", 20, 10);
    }

    public String getHandlerName() {
        return handlerName;
    }


    public void setHandlerName(String handlerName) {
        if(handlerName.length() < 3){

            System.out.println("The Name is Too Short");
            return;
        }
        else{
            this.handlerName = handlerName;
        }

    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }


    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public List<Loot> getInventory() {
        return inventory;
    }

    public void setInventory(List<Loot> inventory) {
        this.inventory = inventory;
    }

    public void addItemToInventory(Loot loot){
        inventory.add(loot);
    }

    public boolean dropItemToInventory(Loot loot){
        if(inventory.contains(loot)){
            System.out.println("Item droped");
            inventory.remove(loot);
            return true;
        }
        else{
            return false;
        }
    }

    public void displayInfo(){
        int i=1;
        for(Loot loot : inventory){
            System.out.println("=================="+ i + "==================");
            System.out.println("The Weapon " + loot.getName());
            System.out.println("Weapon type " + loot.getLootType());
            System.out.println("The Weapon Value " + loot.getValue());
            System.out.println("==========================================");
            i++;
        }
    }
}
