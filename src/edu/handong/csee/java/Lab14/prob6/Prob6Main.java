package edu.handong.csee.java.Lab14.prob6;
import java.util.Scanner;

public class Prob6Main {
	public static void main(String[] args) {
		Prob6Main actor = new Prob6Main();
		actor.acto();
	}
	
	private void acto() {
		String name = "", race = "";
		int age = 0;
		Scanner keyboard = new Scanner(System.in);
		CustomID inst = new CustomID();
		int trigger = 1;
		while(trigger==1) {
			try {
				if(inst.getState() == 0) {
					System.out.println("Enter your name : ");
					name = keyboard.nextLine();
					inst.setName(name);
				}
				else if(inst.getState() == 1){
					System.out.println("Enter your age : ");
					age = keyboard.nextInt();
					inst.setAge(age);
				}
				else if(inst.getState()==2) {
					System.out.println("Enter your race : ");
					race = keyboard.nextLine();
					inst.setRace(race);
				}
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
				continue;
			}
			keyboard.close();
		}
	}
}
