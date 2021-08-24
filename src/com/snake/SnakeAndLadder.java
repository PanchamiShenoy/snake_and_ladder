package com.snake;

import java.util.Random;

public class SnakeAndLadder {
	public static final int NO_PLAY = 1;
	public static final int LADDER = 2;
	public static final int SNAKE =3;
	public static int count=0; 
	public static Random random = new Random();
	public static int dieNumber=0;
	
	public static int play(int position) {
		
		int dieNumber = random.nextInt(7-1)+1;
		System.out.println("the number on die is"+dieNumber);
		
        int choice = random.nextInt(4-1)+1;
		
		if(choice == NO_PLAY){
			System.out.println("No Play");
		}else if(choice == LADDER) {
			System.out.println("Player inclined by "+dieNumber);
			position+=dieNumber;
		}else if(choice == SNAKE) {
			System.out.println("Player declined by "+dieNumber);
			position-=dieNumber;
		}
		
		if(position<0)
			position = 0;
		
		if(position>100)
			position-= dieNumber;
		
		count++;
		
		return position;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Snake and Ladder Program");
		
		int playerOnePosition=0;
		int playerTwoPosition=0;
		
		
		while(playerOnePosition!= 100 && playerTwoPosition!=100) {
		
			System.out.println("Playe 1 is rolling");
			playerOnePosition=play(playerOnePosition);
			System.out.println("Player position after rolling"+playerOnePosition);
			System.out.println("Player 2 is rolling");
			playerTwoPosition=play(playerTwoPosition);
			System.out.println("Player position after rolling"+playerTwoPosition);
		}
		
		if(playerOnePosition == 100)
			System.out.println("Player 1 has Won.");
		else
			System.out.println("Player 2 has Won.");
		
		System.out.println("total number of times the die rolled is : "+count);
	}

}
