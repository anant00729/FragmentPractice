package com.example.anantawasthy.fragmentpractice.inheritence;

/**
 * Created by anantawasthy on 4/25/17.
 */

public class DemoInheritence {

    public static void main(String[] args){
//        PlayerInheritenceDemo player  = new PlayerInheritenceDemo("Anant" , 100);
//
//        System.out.println("Name " + player.getHandleName());
//        System.out.println("Score  " + player.getScore());
//
//        LootInheritenceDemo redPotion  =  new LootInheritenceDemo("RedPotion",LootTypeInheritence.POTION,20);
//        LootInheritenceDemo plusShield = new LootInheritenceDemo("+3 Shield", LootTypeInheritence.ARMOUR, 12);
//
//        player.addItemToLoot(redPotion);
//        player.addItemToLoot(plusShield);
//        player.showItems();
//        player.dropItemFromLoot(redPotion);
//        player.showItems();

//        EnemyInheritenceDemo enemyInheritenceDemo = new EnemyInheritenceDemo("Dawood", 10 ,3);
//        enemyInheritenceDemo.showInfo();
//        enemyInheritenceDemo.takeDamage(11);
//        enemyInheritenceDemo.showInfo();

//        now we will create another class wgich will be the subclass of the enemy class
//        the class will inherite all the properties of the Super Class

        Shakal shakal = new Shakal("Kalu Mama", 27 ,1);
        shakal.showInfo();
        shakal.takeDamage(10);
        shakal.showInfo();
        shakal.takeDamage(20);
        shakal.showInfo();

    }

}
