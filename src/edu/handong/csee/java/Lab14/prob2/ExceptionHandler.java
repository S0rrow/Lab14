package edu.handong.csee.java.Lab14.prob2;
import java.util.*;

public class ExceptionHandler {
	public ExceptionHandler() {
	}
	
	public void DetermineError(int x, int y) {
		try {
			System.out.println(x/y);
		}
		catch(ArithmeticException e) {
			System.out.println("java.long.AritchmeticException:" + e.getMessage());
		}
		catch(InputMismatchException e) {
			System.out.println("java.util.InputMismatchException");
		}
		catch(Exception e) {
			System.out.println("Some other exception has occured: " + e.getMessage());
		}
	}
}
