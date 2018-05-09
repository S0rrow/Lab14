package edu.handong.csee.java.Lab14.prob2;

import java.util.Scanner;

public class ExceptionHandlerMain {
	public static void main(String[] args) {
		acto();
	}
	
	private static void acto() {
		int x = 0,y = 0;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("x: ");
		x = keyboard.nextInt();
		System.out.print("y: ");
		y = keyboard.nextInt();
		ExceptionHandler hand = new ExceptionHandler();
		hand.DetermineError(x, y);
		keyboard.close();
	}
}
