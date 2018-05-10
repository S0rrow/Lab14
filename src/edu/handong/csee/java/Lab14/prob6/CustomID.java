package edu.handong.csee.java.Lab14.prob6;

public class CustomID extends Exception{// declare an inherited class extends from exception class.
	private String[] races = new String[] {"Vulcan", "Romulan", "Klingon", "Trekkie"};// give array of strings with names of races.
	private String name = "";// initiate string variable.
	private int age = 0;// initiate integer variable.
	private String race = "";// initiate string variable.
	private int state = 0;// initiate integer variable.
	
	public void setName(String txt) throws Exception{// declare a setter for name.
		if(txt.length() < 4) {// if length of parameter is smaller than 4,
			state = 0;// set the state to 0.
			throw new Exception("The name is too short. Please try longer one.");// print out the error message.
		}
		else {// if not,
			this.name = txt;// assign parameter to class variable.
			System.out.println("Name valid.");// print out valid message.
			System.out.println("Name : "+ this.name);// print out the name.
			state++;// add 1 to state.
		}
	}
	
	public void setAge(int num) throws Exception{// declare a setter for age.
		if(num<18) {// if parameter is smaller than 18,
			state = 1;// set the state to 1.
			throw new Exception("Age too young. Try again.");// print out the error message.
		}
		else {// if not,
			this.age = num;// assign parameter to class variable.
			System.out.println("Age valid");// print out the valid message.
			System.out.println("Age : "+this.age);// print out the age.
			state++;// add 1 to state.
		}
	}
	
	public void setRace(String race) throws Exception{// declare a setter for race.
		for(int i = 0; i < races.length; i++) {// within length of races,
			if(races[i].equals(race)) {// if parameter is equal to one of array,
				this.race = races[i];// assign the race to class variable.
				System.out.println("Race valid.");// print out the valid message.
				System.out.println("Races : "+races[i]);// print out the race.
				state = 0;// set the state to 0.
				return;// return and end the loop.
			}
		}
		state = 2;// if the condition did not match at all, set the state to 2.
		throw new Exception("Human! Try again.");// print out the error message.
	}
	
	public int getState() {// declare a getter for state.
		return state;// return state.
	}
}
