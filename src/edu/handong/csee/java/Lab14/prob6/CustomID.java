package edu.handong.csee.java.Lab14.prob6;

public class CustomID extends Exception{
	private String[] races = new String[] {"Vulcan", "Romulan", "Klingon", "Trekkie"};
	private String name = "";
	private int age = 0;
	private String race = "";
	private int state = 0;
	public void setName(String txt) throws Exception{
		if(txt.length() < 4) {
			state = 0;
			throw new Exception("The name is too short. Please try longer one.");
		}
		else {
			this.name = txt;
			System.out.println("Name valid.");
			System.out.println("Name : "+ this.name);
			state++;
		}
	}
	
	public void setAge(int num) throws Exception{
		if(num<18) {
			state = 1;
			throw new Exception("Age too young. Try again.");
		}
		else {
			this.age = num;
			System.out.println("Age valid");
			System.out.println("Age : "+this.age);
			state++;
		}
	}
	
	public void setRace(String race) throws Exception{
		for(int i = 0; i < races.length; i++) {
			if(races[i].equals(race)) {
				this.race = races[i];
				System.out.println("Race valid.");
				System.out.println("Races : "+races[i]);
				state = 0;
				return;
			}
		}
		state = 2;
		throw new Exception("Human! Try again.");
	}
	
	public int getState() {
		return state;
	}
}
