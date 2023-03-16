package com.Observer;

public class Follower implements Observer{
	private String followerName;
	
	public Follower(String followerName) {
		super();
		this.followerName = followerName;
	}
	

	@Override
	public void update(String name, String s) {
		System.out.println( followerName + " ha ricevuto " + s + " un tweet da " +  name);
		
	}

	

	@Override
	public String toString() { 
		return "Follower [ followerName=" + followerName + "]";
	}
	
	
}
