package com.infogalaxy.snakeandladdersimulator;

import java.util.Random;

public class SnakeAndLadder {
    //UC-1  Position of Player

    int position = 0;
    //Define Constant for options
    final int NO_PLAY = 1;
    final int LADDER = 2;
    final int SNAKE = 3;
    //Showing the Player Current position
    public void showposition() {
        System.out.println("Welcome to Snake and Ladder Game. ");
        int position = 0;
        System.out.println("Player Position = "+position);
    }
    //UC-2- Roll die to generate 1 to 6 no. using randon method
    //Rolling the Die to get Position
    public void rollDie() {
        int dieno = (int) ((Math.random() * 6 - 1) + 1);
        System.out.println("Die No is: "+ dieno);

        //UC-3-Checking fot Option to Play
        int option = (int) ((Math.random() * 6 - 1) + 1);
        System.out.println("Option No:" +option);
        switch (option) {
            case NO_PLAY:
                System.out.println("No Play Arrived. Stay on Same Position. ");
                break;
            case LADDER:
                System.out.println("HURRAY !!! You got Ladder. ");
                break;
            case SNAKE:
                System.out.println("OOPS !!! You got Snake. ");
                break;
        }
    }

    public static void main(String[] args) {
        //Creating snakeAndLadder Object
        SnakeAndLadder snakeAndLadder = new SnakeAndLadder();
        //Showing snakeAndLadder Position
        snakeAndLadder.showposition();
        //Rolling the Die
        snakeAndLadder.rollDie();
        snakeAndLadder.showposition();
    }
}
