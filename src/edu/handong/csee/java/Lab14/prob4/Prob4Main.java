package edu.handong.csee.java.Lab14.prob4;
import java.util.Scanner;// import scanner for getting inputs.
public class Prob4Main {// declare a class for main method.
	public static void main(String[] args) {// declare main method.
		Prob4Main actor = new Prob4Main();// instantiate this class to use internal method.
		actor.acto();// use internal method.
	}
	
	private void acto() {// declare a method that does what should be done in main method. 
		Scanner keyboard = new Scanner(System.in);// declare scanner for getting input.
		int num = 0;// initiate integer variable.
		Boundary bound = new Boundary();// instantiate boundary class.
		int trigger = 0;// initiate integer variable.
		while(trigger == 0) {// in condition while trigger is 0, continue the loop.
			try {
				System.out.print("Enter an integer : ");// instruct user to input an integer.
				num = keyboard.nextInt();// assign next given integer to variable.
				bound.receive(num);// instance gets the variable.
			}
			catch(ArrayIndexOutOfBoundsException e) {// if array index out of bounds exception occurs,
				System.out.println("Invalid array index access!");// print out the error message.
				trigger = 1;// set trigger to 1.
			}
		}
		keyboard.close();// close the keyboard.
	}
}
