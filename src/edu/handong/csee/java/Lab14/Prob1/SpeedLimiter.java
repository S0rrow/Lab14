package edu.handong.csee.java.Lab14.Prob1;

public class SpeedLimiter {
	int limit = 0;
	int speed = 0;
	public SpeedLimiter(int limit, int speed) {
		this.limit = limit;
		this.speed = speed;
	}
	
	public void acto() {
		try {
			if(this.limit > this.speed) {
				System.out.println("You drive like a ruler.");
			}
			else {
				throw new Exception("Made in Heaven.");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("You got a star like Grand theft auto. lol.");
		}
	}
}
