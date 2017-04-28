package com.example.anantawasthy.fragmentpractice.inheritence;

/**
 * Created by anantawasthy on 4/25/17.
 */

public class EnemyInheritenceDemo {
    private String name;
    private int hitPoints;
    private int lives;

    public EnemyInheritenceDemo(String name, int hitPoints, int lives) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.lives = lives;
    }

    public void takeDamage(int damage){
        int remainingHitPoints = this.hitPoints - damage;

        if(remainingHitPoints > 0){
            setHitPoints(remainingHitPoints);
            System.out.println("The damage done is " + damage + " the points lefy is " + remainingHitPoints);
        }
        else{
            this.lives -= 1;
            if(this.lives < 1){
                System.out.println("I have lost a life " + this.lives + " Lives are Left.");
            }
            else{
                System.out.println("Ohh You are dead");
            }
        }
    }

    public void showInfo(){
        System.out.println("Name " + this.name + " HitPoints "+ hitPoints +" lives "+ this.lives);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }
}
