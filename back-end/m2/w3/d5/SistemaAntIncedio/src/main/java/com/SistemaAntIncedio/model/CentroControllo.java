package com.SistemaAntIncedio.model;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@AllArgsConstructor
@Getter
@Setter
public class CentroControllo implements Observer{
	
	private List<Sonda> sonde;
	
	private SistemaControllo sistemacontrollo;
	
    
	public void nuovaSonda(Sonda sonda) {
        sonde.add(sonda);
    }
	
	
	@Override
	public void update(Observable o, Object arg) {
		System.out.println( "La sonda ha cambiato il livello del fumo");
	}


	public CentroControllo() {
		// TODO Auto-generated constructor stub
	}

}
