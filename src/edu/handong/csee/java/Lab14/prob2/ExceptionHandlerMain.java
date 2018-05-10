package edu.handong.csee.java.Lab14.prob2;

import java.util.Scanner;// import scanner for getting input.

public class ExceptionHandlerMain {// declare class for main method.
	public static void main(String[] args) {// declare main method.
		ExceptionHandlerMain actor = new ExceptionHandlerMain();// instantiate this class to use method.
		actor.acto();// use method in instance.
	}
	
	private void acto() {// declare a method that does what should be done in main method.
		int x = 0,y = 0;// initiate two integer variables.
		Scanner keyboard = new Scanner(System.in);// declare scanner to get input.
		System.out.print("x: ");// instruct user to input x.
		x = keyboard.nextInt();// assign next given integer to x.
		System.out.print("y: ");// instruct user to input y.
		y = keyboard.nextInt();// assign next given integer to y.
		ExceptionHandler hand = new ExceptionHandler();// instantiate exception handler.
		hand.DetermineError(x, y);// determine x over y occurs error.
		keyboard.close();// close the scanner.
	}
}
