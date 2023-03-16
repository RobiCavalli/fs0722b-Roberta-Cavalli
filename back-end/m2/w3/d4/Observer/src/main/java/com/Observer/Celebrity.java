package com.Observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Celebrity implements Subject {
 //nome della celebrità
 private String celebrityName;
 //lista di followers
 private List<Observer> followers;
 // costruttore 
 public Celebrity (String celebrityName) { 
	 super();
	 this.celebrityName= celebrityName;
	 this.followers= new ArrayList<>();
 }
	

@Override
public void register(Observer o) {
followers.add(o);
System.out.println( o + "ha iniziato a seguirti" +  this.celebrityName);
	
}

@Override
public void unregister(Observer o) {
followers.remove(o);
System.out.println(o + "ha smesso di seguirti" +  this.celebrityName);
	
}

@Override
public void notifyAllObserver(String s) {

for (Observer observer : followers) { 
	observer.update(celebrityName, s);
	System.out.println("Brad ha cambiato stato in occupato");
}
	
}	








	
}


