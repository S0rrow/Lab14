package edu.handong.csee.java.Lab14.Prob3;
import java.util.Scanner;// import scanner for getting input.

public class PowerCalcMain {// declare a class for main method.
	public static final PowerCalc mycalculator = new PowerCalc();// instantiate power calculator class in final.
	public static final Scanner keyboard = new Scanner(System.in);// declare scanner for getting input in final.
	public static void main(String[] args) {// declare main method.
		PowerCalcMain actor = new PowerCalcMain();// instantiate this class to use internal method.
		actor.acto();// use internal method.
	}
	
	private void acto() {// declare a method that does what should be done in main method.
		while(keyboard.hasNextInt()) {// in condition that the scanner gets integer as input, continue the loop.
			int n = keyboard.nextInt();// assign next given integer to variable.
			int r = keyboard.nextInt();// assign next given integer to variable.
			try {
				System.out.println(mycalculator.power(n,r));// try powering.
			}
			catch(Exception e){// if exception occurs, catch the exception
				System.out.println(e);// print out the error message.
			}
		}
	}
}
