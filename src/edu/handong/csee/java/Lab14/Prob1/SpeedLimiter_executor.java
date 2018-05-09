package edu.handong.csee.java.Lab14.Prob1;
import java.util.Scanner;
import java.util.Random;
public class SpeedLimiter_executor {
	public void main(String args[]) {
		acto();
	}
	private void acto() {
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Give me the limit:");
		int limit = keyboard.nextInt();
		int speed = rand.nextInt(101);
		SpeedLimiter Speedgun = new SpeedLimiter(limit, speed);
		Speedgun.acto();
		keyboard.close();
	}

}
