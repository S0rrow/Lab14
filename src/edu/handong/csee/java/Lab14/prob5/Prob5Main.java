package edu.handong.csee.java.Lab14.prob5;
import java.util.Scanner;
public class Prob5Main {
	public static void main(String[] args) {
		Prob5Main actor = new Prob5Main();
		actor.acto();
	}
	
	private void acto() {
		try {
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Type in a string: ");
			String txt = keyboard.nextLine();
			Prob5Main.myTest(txt);
			keyboard.close();
		}
		catch(MyException e) {
			System.out.println("Inside catch block : " + e);
		}
	}
	
	static void myTest(String txt) throws MyException{
		if(txt.equals("null")) {
			throw new MyException("String value is null.");
		}
		else {
			System.out.println("String value is " + txt);
		}
	}

}
