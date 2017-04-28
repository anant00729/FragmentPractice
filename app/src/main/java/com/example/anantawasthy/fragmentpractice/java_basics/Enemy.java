package com.example.anantawasthy.fragmentpractice.java_basics;

/**
 * Created by anantawasthy on 4/26/17.
 */

public class Enemy {
    private String name;
    private int hitPonts;
    private int lives;

    public Enemy(String name, int hitPonts, int lives) {
        this.name = name;
        this.hitPonts = hitPonts;
        this.lives = lives;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPonts() {
        return hitPonts;
    }

    public void setHitPonts(int hitPonts) {
        this.hitPonts = hitPonts;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public void displayEnemyInfo(){
        System.out.println("Name " + name + " hitPoints " + hitPonts + " Lives " + lives);
    }

    public void takeDamage(int damage){
        int remainingHitPoints = hitPonts - damage;
        setHitPonts(remainingHitPoints);
        if(remainingHitPoints > 0 ){
            System.out.println("The Damage done is " + damage + " the hitPoints are " + remainingHitPoints +" Left now.");
        }
        else{
            this.lives -= 1;
            if (this.lives < 1){
                System.out.println("You Are dead");
            }
            else{
                System.out.println("You Lost a Life. now the lives left are " + lives);
            }

        }
    }
}
