package com.snake;

import java.util.Random;

public class SnakeAndLadder {
	public static final int NO_PLAY = 1;
	public static final int LADDER = 2;
	public static final int SNAKE =3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Snake and Ladder Program");
		
		int position=0;
		System.out.println("Single player is at postion "+position);
		
		Random random = new Random();
		
		while(position != 100) {
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
	
		}
	}

}
