package edu.handong.csee.java.Lab14.prob4;

public class Boundary {// declare a class to try out array index out of bounds exception.
	private static int[] array = new int[5];// assign 5 integers to an array.
	private static int counter = 0;// initiate an integer variable.
	public void receive(int num) throws ArrayIndexOutOfBoundsException{// declare a method that throws exception when error occurs.
		int i = counter;// assign class variable to local variable.
		array[i] = num;// assign parameter to class array.
		counter++;// add a counter.
		System.out.printf("array[%d] <- %d", i, num);// print out the result of assignment.
	}
}
