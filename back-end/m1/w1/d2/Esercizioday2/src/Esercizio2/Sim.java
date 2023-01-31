package Esercizio2;

public class Sim {
String numero;
String credito = "0";
String[][] chiamate = new String[5][2];

public Sim ( String numero) {
	this.numero = numero;
}

public void getDati() {
System.out.println (this.numero);
System.out.println (this.credito);

}

public void chiama( String n, String min) {
	chiamate[0][0] = n;
	chiamate[0][1] = min;
	chiamate[1][0] = n;
	chiamate[1][1] = min;
	chiamate[2][0] = n;
	chiamate[2][1] = min;
	chiamate[3][0] = n;
	chiamate[3][1] = min;
	chiamate[4][0] = n;
	chiamate[4][1] = min;
	System.out.println(java.util.Arrays.deepToString(chiamate));
}

}