package Lambda;

public class MainLambda {

	public static void main(String[] args) {
		Prova l = ()->{
			System.out.println("Hello World");
		};
		l.Hello();

	
		//lambda con parametri
		
			prova2 r = (x)->{
				System.out.println("Hello World da " +x);
			};
			r.hello1("Mario");
		
		
	}

}
