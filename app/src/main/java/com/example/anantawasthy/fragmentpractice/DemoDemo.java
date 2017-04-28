package com.example.anantawasthy.fragmentpractice;

import java.util.ArrayList;

/**
 * Created by anantawasthy on 4/25/17.
 */

public class DemoDemo {

    public static void main(String[] args) {
//        PlayerDemo tim = new PlayerDemo();
//        System.out.println("Name " + tim.getHandleName());
//        System.out.println("Lives " + tim.getLives());
//        System.out.println("Levels " + tim.getLevel());
//        System.out.println("Score " + tim.getScore());
//
//        PlayerDemo anant = new PlayerDemo("Anant");
//        System.out.println("Name " + anant.getHandleName());
//        System.out.println("Lives " + anant.getLives());
//        System.out.println("Levels " + anant.getLevel());
//        System.out.println("Score " + anant.getScore());
//
//        PlayerDemo arnav = new PlayerDemo("A" , 5);
//        System.out.println("Name " + arnav.getHandleName());
//        System.out.println("Lives " + arnav.getLives());
//        System.out.println("Levels " + arnav.getLevel());
//        System.out.println("Score " + arnav.getScore());

        PlayerDemo anant = new PlayerDemo();

        LootDemo shiningsword = new LootDemo("Golden Potion" , LootDemoType.POTION , 7);
        LootDemo plusThreeShield = new LootDemo("+3 shield" , LootDemoType.SHIELD , 20);
        LootDemo redPotion = new LootDemo("red potion", LootDemoType.POTION,12);
        LootDemo bluePotion = new LootDemo("Blue Loot", LootDemoType.POTION , 100);

        anant.addItemToInventory(shiningsword);
        anant.addItemToInventory(plusThreeShield);
        anant.addItemToInventory(redPotion);
        anant.addItemToInventory(bluePotion);

        ArrayList<LootDemo> inventory = anant.getInventory();
        int i = 1;
        for(LootDemo lootDemo : inventory){
            System.out.println("Weapon " + i +" Name " + lootDemo.getName());
            System.out.println("Weapon " + i +" Type " + lootDemo.getLootDemoType());
            System.out.println("Weapon " + i +" Value " + lootDemo.getValue());
            i++;
        }

        boolean wasDeleted = anant.dropItemInventory(bluePotion);

        System.out.println("Was Deleted Value is " + wasDeleted);
        anant.dropItemInventory(plusThreeShield);
        anant.dropItemInventory(redPotion);

        anant.addItemToInventory(shiningsword);
        anant.addItemToInventory(redPotion);

        i = 1;

//        Rather than using the for each loop here we can use this method to diplay in the PlayerDemo Class
        for(LootDemo lootDemo : inventory){
            System.out.println("Weapon " + i +" Name " + lootDemo.getName());
            System.out.println("Weapon " + i +" Type " + lootDemo.getLootDemoType());
            System.out.println("Weapon " + i +" Value " + lootDemo.getValue());
            i++;
        }

//        Cool..!

        anant.showInventory();







    }
}
