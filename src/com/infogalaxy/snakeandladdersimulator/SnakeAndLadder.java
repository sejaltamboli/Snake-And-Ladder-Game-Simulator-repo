package com.infogalaxy.snakeandladdersimulator;

import java.util.Random;

public class SnakeAndLadder {
    //UC-1  Position of Player

    int position = 0;
    int countRoll = 0;
    //Define Constant for options
    final int NO_PLAY = 1;
    final int LADDER = 2;
    final int SNAKE = 3;
    //Showing the Player Current position
    public void showposition( int playerNo ) {
        System.out.println("Player" +playerNo + "Position : " +position);
    }
    //UC-2- Roll die to generate 1 to 6 no. using randon method
    //Rolling the Die to get Position
    public void rollDie( int playerNo) {
        countRoll++;
        int dieno = (int) ((Math.random() * 7 - 1) + 1);
        System.out.println("Die No is: "+ dieno);

        //UC-3-Checking fot Option to Play
        int option = (int) ((Math.random() * 4 - 1) + 1);
        System.out.println("Option No:" +option);
        switch (option) {
            case NO_PLAY:
                System.out.println("No Play Arrived. Stay on Same Position. ");
                break;
            case LADDER:
                System.out.println("HURRAY !!! You got Ladder. ");
                position = position + dieno;
                if(position > 100) {
                    System.out.println("Player Position is Out of Board. ");
                    position = position - dieno;
                }
                break;
            case SNAKE:
                System.out.println("OOPS !!! You got Snake. ");
                position = position - dieno;
                if(position < 0) {
                    position = 0;
                }
                break;
        }
        showposition(playerNo);
    }
    public void printCountRoll() {
        System.out.println("Total Number of Play Die Roll for the Wining the Game: ");
    }

    public static void main(String[] args) {
        //Creating snakeAndLadder Object
        SnakeAndLadder player1 = new SnakeAndLadder();
        SnakeAndLadder player2 = new SnakeAndLadder();
        //Showing snakeAndLadder Position
        System.out.println("Game Start Position. ");
        player1.showposition(1);
        player2.showposition(2);
        //Rolling the Die
        while ( player1.position != 100 && player2.position != 100) {
            System.out.println("Player 1 Chance. ");
            player1.rollDie(1);
            if ( player1.position == 100){break;}
            System.out.println("Player 2 Chance. ");
            player2.rollDie(2);
        }
        if (player1.position == 100) {
            System.out.println("Player 1 Winner !!! ");
        } else {
            System.out.println("Player 2 Winner !!1 ");
        }
    }
}
