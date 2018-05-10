package edu.handong.csee.java.Lab14.Prob3;

public class PowerCalc {// declare class for calculating powers.
	public long power(int n, int r) throws Exception{// declare method to try powering.
		long result = (long)Math.pow(n,r);// assign power or n over r to long variable.
		if(n < 0 || r < 0) {// if n or r is negative,
			throw new Exception("n or r should not be negative.");// throw exception error message.
		}
		else if(n == 0 && r == 0) {// else if n and r is zero,
			throw new Exception("n and r should not be zero.");// throw exception error message.
		}
		return result;// return the long result.
	}
}
