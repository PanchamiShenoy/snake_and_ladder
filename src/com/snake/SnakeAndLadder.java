package com.snake;

import java.util.Random;

public class SnakeAndLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Snake and Ladder Program");
		
		int position=0;
		System.out.println("Single player is at postion "+position);
		
		Random random = new Random();
		int dieNumber = random.nextInt(7-1)+1;
		System.out.println("the number on die is"+dieNumber);
	}

}
