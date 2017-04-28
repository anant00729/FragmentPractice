package com.example.anantawasthy.fragmentpractice;

/**
 * Created by anantawasthy on 4/25/17.
 */

public class Player {
    private String handleName;
    private int score;
    private int level;
    private int lives;

    public Player(){
        this.handleName = "Unknown Name";
        this.score = 0;
        this.level = 1;
        this.lives = 3;
    }
//  this is used to implement the Overloading of Constructor
    public Player(String handleName){
        this.handleName = handleName;
        this.score = 0;
        this.level = 1;
        this.lives = 3;
    }

    public String getHandleName(){
        return handleName;
    }

    public int getScore(){
        return score;
    }
    public int getLevel(){
        return level;
    }
    public int getLives(){
        return lives;
    }

    public void setHandleName(String handleName){
//        we can also retrict the execusion of this method by limiting the number of charaters passed by the user
//        the handle name will be the name comming through the parameter list in the method.
        if(handleName.length()<3){
            return;
        }
        this.handleName = handleName;
    }

    public void setScore(int score){
        this.score = score;
    }

    public void setLevel(int level){
        this.level = level;
    }
    public void setLives(int lives){
        this.lives = lives;
    }
}
