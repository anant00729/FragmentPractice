package com.example.anantawasthy.fragmentpractice;

/**
 * Created by anantawasthy on 4/24/17.
 */

public class Sample {
    public static void main(String[] args) {
        int lives = 0;
        boolean isGameOver = (lives < 1);

        System.out.println(isGameOver);

        if(isGameOver){
            System.out.println("Game Over..!");
        }else{
            System.out.println("You are still alive");
        }
    }
}
