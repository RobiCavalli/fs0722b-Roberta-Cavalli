package com.SistemaAntIncedio.model;

import java.util.List;


import com.Observer.Observer;
import com.Observer.Subject;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//La sonda è l'oggetto che viene osservato dal centro di controllo 
public class Sonda implements Subject{
	private Long id;
    private double latitude;
    private double longitude;
    private double livellofumo;
    private SistemaControllo SistemaControllo;
    
    public Sonda(Long id, double latitude, double longitude, double livellofumo, SistemaControllo sistemaControllo) {
		super();
		this.id = id;
		this.latitude = latitude;
		this.longitude = longitude;
		this.livellofumo = livellofumo;
		SistemaControllo = sistemaControllo;
	}
    
	
	public Sonda() {
		// TODO Auto-generated constructor stub
	}


	public void livelloFumo(double livellofumo) {
        this.getLivellofumo(livellofumo);
       
        if (this.id > 5) {
           SistemaControllo.invioMessaggio("http://host/alarm?=idsonda=" + id + "&lat=" + latitude + "&lon=" + longitude + "&smokelevel=" + livellofumo);
        }
    }

	@Override
	public void register(Observer o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unregister(Observer o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyAllObserver(String s) {
		// TODO Auto-generated method stub
		
	}

	public Object getIdSonda(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public void setId(Object id2) {
		// TODO Auto-generated method stub
		
	}

	public void setLongitude(double longitude2) {
		// TODO Auto-generated method stub
		
	}

	public void setSistemaControllo() {
		// TODO Auto-generated method stub
	
	}


	public void getLivellofumo(double d) {
		// TODO Auto-generated method stub
		
	}

	

	
}
