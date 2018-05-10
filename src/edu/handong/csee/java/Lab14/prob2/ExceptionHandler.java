package edu.handong.csee.java.Lab14.prob2;
import java.util.*;// import utilities from java library.

public class ExceptionHandler {// declare class for handling exceptions.
	public ExceptionHandler() {// declare a constructor.
	}
	
	public void DetermineError(int x, int y) {// declare a method to try exceptions.
		try {
			System.out.println(x/y);// try to print out x divided by y.
		}
		catch(ArithmeticException e) {// if error occurred by arithmetic exception,
			System.out.println("java.long.AritchmeticException:" + e.getMessage());// print out the error message.
		}
		catch(InputMismatchException e) {// if error occurred by mismatch in input types,
			System.out.println("java.util.InputMismatchException");// print out the error message.
		}
		catch(Exception e) {// if error occurred by other exceptions,
			System.out.println("Some other exception has occured: " + e.getMessage());// print out the error message.
		}
	}
}
