package edu.handong.csee.java.Lab14.Prob3;
import java.util.Scanner;

public class PowerCalcMain {
	public static final PowerCalc mycalculator = new PowerCalc();
	public static final Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		acto();
	}
	
	private static void acto() {
		while(keyboard.hasNextInt()) {
			int n = keyboard.nextInt();
			int r = keyboard.nextInt();
			try {
				System.out.println(mycalculator.power(n,r));
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
	}
}
