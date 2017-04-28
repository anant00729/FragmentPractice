package com.example.anantawasthy.fragmentpractice;

import java.util.ArrayList;

/**
 * Created by anantawasthy on 4/25/17.
 */


public class NonDuplicatedPlayer {

    private String handleName;
    private int lives;
    private int score;
    private int level;
    private Weapon weapon;
    private ArrayList<Loot> inventory;

    public NonDuplicatedPlayer(){
        this("UnKnown Name");
    }

    public NonDuplicatedPlayer(String handleName){
        this(handleName,10);
    }


//    The Parameter passed inside diffrent contructor are the method signature
//    the method signature helps to identify which method is called/used in the main method

    public NonDuplicatedPlayer(String handleName,int level){
        this.setHandleName(handleName);
        this.setLevel(level);
        this.setScore(100);
        this.setLives(4);
        setDefaultWeapon();
        inventory = new ArrayList<>();
    }


    public void setHandleNameAndLevel(String handleName, int level){
       setHandleName(handleName);
        setLevel(level);
    }

    public String getHandleName() {
        return handleName;
    }

    public void setHandleName(String handleName) {

//        Here this method is called inside the setHandleNameAndLevel(); Hence this will help us to validate the
//        length of the handle Name if it is less than three charatres then it will not set the value and
//        finally Displayes the default value.

        if(handleName.length() < 3){
            System.out.println("The Size of the Name is too Small pls increase the size of Name");
            return;
        }
        this.handleName = handleName;

    }

    public void setDefaultWeapon(){
        this.weapon = new Weapon("Sword" , 10 , 20);
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Weapon getWeapon(){
        return weapon;
    }

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public ArrayList<Loot> getLoot(){
        return inventory;
    }

    public void setLoot(ArrayList<Loot> lootList){
        this.inventory = lootList;
    }

    public void AddItemToLoot(Loot loot){
        inventory.add(loot);
    }

    public boolean dropItemFromLoot(Loot loot){
        if(this.inventory.contains(loot)){
            inventory.remove(loot);
            return true;
        }
        else{
            return false;
        }
    }
}
