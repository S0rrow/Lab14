package edu.handong.csee.java.Lab14.Prob1;

public class SpeedLimiter {// declare class for speed limiter.
	int limit = 0;// initiate an integer variable.
	int speed = 0;// initiate an integer variable.
	public SpeedLimiter(int limit, int speed) {// declare a constructor.
		this.limit = limit;// assign parameter integer to class variable.
		this.speed = speed;// assign parameter integer to class variable.
	}
	
	public void acto() {// declare a method to try exceptions.
		try {
			if(this.limit > this.speed) {// set condition that limit is higher than speed.
				System.out.println("You drive like a ruler.");// if so, print out a given string.
			}
			else {// if not,
				throw new Exception("Made in Heaven.");// throw an exception.
			}
		} catch (Exception e) {// catch the exception.
			System.out.println(e.getMessage());// print out the message for exception.
			System.out.println("You got a star like Grand theft auto. lol.");// print out the given string.
		}
	}
}
