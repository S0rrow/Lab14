package edu.handong.csee.java.Lab14.prob4;
import java.util.Scanner;
public class Prob4Main {

	public static void main(String[] args) {
		Prob4Main actor = new Prob4Main();
		actor.acto();
	}
	
	private void acto() {
		Scanner keyboard = new Scanner(System.in);
		int num = 0;
		Boundary bound = new Boundary();
		int trigger = 0;
		while(trigger == 0) {
			try {
				System.out.print("Enter an integer : ");
				num = keyboard.nextInt();
				bound.receive(num);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Invalid array index access!");
				trigger = 1;
			}
		}
		keyboard.close();
	}
}
