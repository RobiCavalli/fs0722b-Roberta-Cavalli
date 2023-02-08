package Thread;

public class Thread1 extends Thread {
private String message;

public Thread1(String message) {
	this.message = message;
}

@Override
public void run() {
	 for ( int i=0; i<10; i++) {
		System.out.println(message);
	 }
}




}
