package model;

import java.util.Date;

public class Arrivee {
	
	private Date dateArrivee;
	private Aeroport aeroport;
	private Vol vol;
	
	public Arrivee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Date getDateArrivee() {
		return dateArrivee;
	}
	public void setDateArrivee(Date dateArrivee) {
		this.dateArrivee = dateArrivee;
	}
	public Aeroport getAeroprt() {
		return aeroport;
	}
	public void setAeroprt(Aeroport aeroprt) {
		this.aeroport = aeroprt;
	}
	public Vol getVol() {
		return vol;
	}
	public void setVol(Vol vol) {
		this.vol = vol;
	}
	@Override
	public String toString() {
		return "Arrivee [dateArrivee=" + dateArrivee + ", aeroport=" + aeroport + "]";
	}
	
	
	
	
	
	

}
