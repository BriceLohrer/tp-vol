package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;



@Embeddable
public class Arrivee {
	
	private Date dateArrivee;
	@Embedded
	private Aeroport aeroport;
	@Column(name = "vols", length = 255)
	private Vol vols;
	
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
	
	public Vol getVols() {
		return vols;
	}
	public void setVols(Vol vols) {
		this.vols = vols;
	}
	@Override
	public String toString() {
		return "Arrivee [dateArrivee=" + dateArrivee + ", aeroport=" + aeroport + "]";
	}
	
	
	
	
	
	

}
