package edu.handong.csee.java.Lab14.prob5;
import java.util.Scanner;// import scanner for getting input.
public class Prob5Main {// declare a class for main method.
	public static void main(String[] args) {// declare main method.
		Prob5Main actor = new Prob5Main();// instantiate this class to use internal method.
		actor.acto();// use internal method.
	}
	
	private void acto() {//declare a method that does what should be done in main method.
		try {
			Scanner keyboard = new Scanner(System.in);// declare scanner for getting input
			System.out.println("Type in a string: ");// instruct user to input a string.
			String txt = keyboard.nextLine();// assign next give string to variable.
			Prob5Main.myTest(txt);// use internal method with parameter given as string.
			keyboard.close();// close the keyboard.
		}
		catch(MyException e) {// if exception caught as my exception,
			System.out.println("Inside catch block : " + e);// print out the error message.
		}
	}
	
	static void myTest(String txt) throws MyException{// declare a method that throws my exception
		if(txt.equals("null")) {// if string given is in its initial form,
			throw new MyException("String value is null.");// give error message that value is null.
		}
		else {// if not,
			System.out.println("String value is " + txt);// give the value of string.
		}
	}

}
