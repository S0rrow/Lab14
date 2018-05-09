package edu.handong.csee.java.Lab14.Prob3;

public class PowerCalc {
	public long power(int n, int r) throws Exception{
		long result = (long)Math.pow(n,r);
		if(n < 0 || r < 0) {
			throw new Exception("n or r should not be negative.");
		}
		else if(n == 0 && r == 0) {
			throw new Exception("n and r should not be zero.");
		}
		return result;
	}
}
