package Esercizio1;

public class Rettangolo {
	int altezza;
	int larghezza;

	
public Rettangolo ( int altezza, int larghezza ){
	this.altezza = altezza;
	this.larghezza = larghezza;

}


public int  perimetro () {
    return     (this.altezza+ this.larghezza)*2;
}
public int  area () {
    return      this.larghezza *this.altezza;
}


public void  stampaRettangolo () {

System.out.println("perimetro:" + perimetro());
System.out.println("area:"+ area());

}


public static void stampaDueRettangoli(Rettangolo a ,Rettangolo b){
 a.stampaRettangolo();
 b.stampaRettangolo();
int sommaArea = a.area()+b.area();
int sommaPerimetro = a.perimetro() + b.perimetro();
System.out.println("somma delle aree:" +sommaArea);
System.out.println("somma dei perimetri:" + sommaPerimetro);
}



}
