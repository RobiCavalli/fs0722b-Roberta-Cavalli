package com.SistemaAntIncedio.Main;

import com.SistemaAntIncedio.model.CentroControllo;
import com.SistemaAntIncedio.model.Sonda;

public class Main {

	public static void main(String[] args) {
		CentroControllo controllo = new CentroControllo();
		
        Sonda sonda1 = new Sonda();
        sonda1.setId(1);
        sonda1.setLongitude(20.3);
        sonda1.setLatitude(50.3);
        sonda1.getLivellofumo(5.2);
        sonda1.setSistemaControllo();
        
        Sonda sonda2 = new Sonda();
        sonda2.setId(2);
        sonda2.setLongitude(40.3);
        sonda2.setLatitude(50.3);
        sonda2.getLivellofumo(5.5);
        sonda2.setSistemaControllo();
        
        controllo.nuovaSonda(sonda1);
        controllo.nuovaSonda(sonda2);
  
        
        
	}

}
