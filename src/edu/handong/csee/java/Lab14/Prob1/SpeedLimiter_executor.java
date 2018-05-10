package edu.handong.csee.java.Lab14.Prob1;
import java.util.Scanner;// import scanner for getting input.
import java.util.Random;// import random for generating random numbers.
public class SpeedLimiter_executor {// declare class for executing speed limiter.
	public static void main(String args[]) {// declare main method.
		SpeedLimiter_executor actor = new SpeedLimiter_executor();// instantiate this class for executing internal method.
		actor.acto();// start internal method
	}
	private void acto() {// declare method that does what should be done in main.
		Scanner keyboard = new Scanner(System.in);// declare scanner for getting inputs.
		Random rand = new Random();// declare random for generating random numbers.
		System.out.println("Give me the limit :");// instruct user to give limit.
		int limit = keyboard.nextInt();// assign next given integer to variable.
		int speed = rand.nextInt(101);// assign next given integer lower than 101 to variable.
		SpeedLimiter Speedgun = new SpeedLimiter(limit, speed);// instantiate speed limiter.
		Speedgun.acto();// start speed limiter.
		keyboard.close();// close the keyboard.
	}

}
