package edu.handong.csee.java.Lab14.prob6;
import java.util.Scanner;// import scanner for getting input.

public class Prob6Main {// declare a class for main method.
	public static void main(String[] args) {// declare main method.
		Prob6Main actor = new Prob6Main();// instantiate this class to use internal method.
		actor.acto();// use internal method.
	}
	
	private void acto() {// declare a method that does what should be done in main method.
		String name = "", race = "";// initiate two string variables.
		int age = 0;// initiate integer variable.
		Scanner keyboard = new Scanner(System.in);// declare a scanner for getting input.
		CustomID inst = new CustomID();// instantiate custom id class.
		int trigger = 1;// initiate trigger variable to 1.
		while(trigger==1) {// in condition trigger is 1, continue the loop.
			try {
				if(inst.getState() == 0) {// if state of instance is 0,
					System.out.println("Enter your name : ");// instruct user to give name.
					name = keyboard.nextLine();// assign next give string to variable.
					inst.setName(name);// set name of instance.
				}
				else if(inst.getState() == 1){// else if state of instance is 1,
					System.out.println("Enter your age : ");// instruct user to give age.
					age = keyboard.nextInt();// assign next given integer to variable.
					inst.setAge(age);// set age of instance.
				}
				else if(inst.getState()==2) {// else if state of instance is 2.
					System.out.println("Enter your race : ");// instruct user to give race.
					race = keyboard.nextLine();// assign next given string to variable.
					inst.setRace(race);// set race of instance.
				}
			}
			catch(Exception e) {// catch with exception
				System.out.println(e.getMessage());// print out the error message.
				continue;// continue the loop.
			}
			keyboard.close();// close the keyboard.
		}
	}
}
