package com.example.anantawasthy.fragmentpractice.java_basics;

/**
 * Created by anantawasthy on 4/26/17.
 */

public class Main {


    public static void main(String[] args){
        Player anant = new Player();
        System.out.println("Name " + anant.getHandlerName());
        Player arnav = new Player("Arnav");
        System.out.println(arnav.getHandlerName());

        Weapon weapon = anant.getWeapon();

        System.out.println("Weapon Name " + weapon.getName());
        System.out.println("Weapon hitPoints" + weapon.getHitPoints());
        System.out.println("Weapon damageInflicted" + weapon.getDamageInflicted());

        Loot redPotion = new Loot("RED_POTION" ,LootType.POTION , 20);
        Loot plusThreeShield = new Loot("+3 SHIELD" , LootType.SHIELD , 30);
        Loot sunshineArmour = new Loot("SUN ARMOUR" , LootType.ARMOUR , 40);

        anant.addItemToInventory(redPotion);
        anant.addItemToInventory(plusThreeShield);
        anant.addItemToInventory(sunshineArmour);

        anant.displayInfo();

        anant.dropItemToInventory(redPotion);
        anant.dropItemToInventory(sunshineArmour);

        anant.displayInfo();

//        Enemy enemy = new Enemy("Shakal" , 120 ,3);
//
//        enemy.takeDamage(130);
//        enemy.displayEnemyInfo();

        Shakal shakal =new Shakal("SHAKAL", 27 , 4);

        shakal.takeDamage(37);
        shakal.displayEnemyInfo();

        KillWish killWish = new KillWish("Tamraj KillWish");

        killWish.takeDamage(12);
        killWish.displayEnemyInfo();

        KillWishKaBapp baap = new KillWishKaBapp("Kala chuha");
        baap.takeDamage(12);
        baap.displayEnemyInfo();

    }
}
