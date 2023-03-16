package com.Observer;

public class Main {

	public static void main(String[] args) {
		Celebrity BradPitt = new Celebrity("BradPitt");
		
		Follower Chiara = new Follower("Chiara");
		
		//Chiara come follower di BradPitt
		BradPitt.register(Chiara);
		
		// BradPitt ha cambiato stato e il suo messaggio verrà notificato al follower
		BradPitt.notifyAllObserver(" ");
		
		
	}

}
