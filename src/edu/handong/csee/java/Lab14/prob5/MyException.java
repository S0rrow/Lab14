package edu.handong.csee.java.Lab14.prob5;

public class MyException extends Exception{// declare an inherited class extends from exception class.
	private String message = "null";// initiate string variable with value "null"
	public MyException() {// cite inherited method.
		super();// cite the inheritance.
	}
	public MyException(String message) {// overload inherited method.
		super(message);// cite the inheritance.
		this.message = message;// assign parameter to class variable.
	}
	public MyException(Throwable cause) {// overload inherited method.
		super(cause);// cite the inheritance.
	}
	public String toString() {// declare a method to return message.
		return message;// return message.
	}
}
