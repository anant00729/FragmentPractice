package com.example.anantawasthy.fragmentpractice;

import java.util.ArrayList;

/**
 * Created by anantawasthy on 4/25/17.
 */

public class Demo {
    public static void main(String[] args){
//        Player player = new Player();
//        System.out.println("The Name of player is " + player.getHandleName());
//
//        player.setHandleName("Aa");
//        System.out.println("The Name of Player is " + player.getHandleName());
//
////        we can create multiple objects with diffrent values of their properties
//
//        Player tim = new Player();
//        tim.setHandleName("tim bachalka");
//
//        Player anant = new Player();
//        anant.setHandleName("anant S awasthy");
//
//        System.out.println("The Name of the tutor is " + tim.getHandleName());
//        System.out.println("The Name of the student is " + anant.getHandleName());

//        Now we will call diffrent contructor for diffrent senrio and test the outcome based on the coding

//        NonDuplicatedPlayer player = new NonDuplicatedPlayer();
//
//        System.out.println(player.getHandleName()); // Anant S Awasthy
//        System.out.println(player.getLevel()); // 10
//        System.out.println(player.getLives()); // 3
//        System.out.println(player.getScore()); // 0
//
//        NonDuplicatedPlayer anant = new NonDuplicatedPlayer(12);
//
//        System.out.println(anant.getHandleName()); // Anant S Awasthy
//        System.out.println(anant.getScore()); // 0
//        System.out.println(anant.getLives()); // 3
//        System.out.println(anant.getLevel()); // 12

        NonDuplicatedPlayer player = new NonDuplicatedPlayer();
        System.out.println("The Player Name is : " + player.getHandleName());

        player.setHandleNameAndLevel("An", 4);

        System.out.println("The Name is " + player.getHandleName() + "\n" +
        "The Number of Lives Left " + player.getLives());
//        System.out.println(player.getWeapon().getName());

//        We can also define the weponane as followes

        Weapon playerWeapon = player.getWeapon();

        System.out.println("The Weapon Name is " + playerWeapon.getName());

        NonDuplicatedPlayer louies = new NonDuplicatedPlayer("Louice");

        System.out.println("The Handle Name is " + louies.getHandleName().toUpperCase());

//        To reove the defoault vaule and override with the new value we have to call the contuctor method
//        of weapon class

        Weapon axe = new Weapon("GoldShine Ass" , 20 , 30);

        NonDuplicatedPlayer anant = new NonDuplicatedPlayer();
        anant.setWeapon(axe);

        System.out.println("The Name of the weapon is " +anant.getWeapon().getName());
        System.out.println("The Damage Infilcted is " + anant.getWeapon().getDamageInflicted());
        System.out.println("The Hit Points are " + anant.getWeapon().getHitPoints());

//      Now i m going to implement the concept of how enum works and how the Player class uses the List<Loot> and display it
//        on the screen

        Loot redPotion = new Loot("red potion" , LootType.POTION , 7);
        anant.AddItemToLoot(redPotion);

        Loot plusThreeArmour = new Loot("+3 Armour", LootType.ARMOUR , 20);
        anant.AddItemToLoot(plusThreeArmour);

        ArrayList<Loot> inventory = anant.getLoot();
        int i = 1;
        for(Loot loot : inventory){
            System.out.println("The Weapon "+i+" is " + loot.getName());
            System.out.println("The Value "+i+" is " + loot.getValue());
            System.out.println("The Loot Type " +i+ " is "+ loot.getLootType() );
            i++;
        }




    }
}
