package com.infogalaxy.snakeandladdersimulator;

import java.util.Random;

public class SnakeAndLadder {
    //UC-1  Position of Player

    public void showposition() {
        System.out.println("Welcome to Snake and Ladder Game. ");
        int position = 0;
        System.out.println("Player Position = "+position);
    }


    public static void main(String[] args) {
        SnakeAndLadder snakeAndLadder = new SnakeAndLadder();
        snakeAndLadder.showposition();
    }
}
