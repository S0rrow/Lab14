package edu.handong.csee.java.Lab14.prob4;

public class Boundary {
	private static int[] array = new int[5];
	private static int counter = 0;
	public void receive(int num) throws ArrayIndexOutOfBoundsException{
		int i = counter;
		array[i] = num;
		counter++;
		System.out.printf("array[%d] <- %d", i, num);
	}
}
