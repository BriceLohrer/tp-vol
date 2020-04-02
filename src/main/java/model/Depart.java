package model;

import java.util.Date;

public class Depart {
	
	private Date dateDepart;
	private Vol vols;
	private Aeroport aeroport;
	
	public Depart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Date getDateDepart() {
		return dateDepart;
	}

	public void setDateDepart(Date dateDepart) {
		this.dateDepart = dateDepart;
	}

	public Vol getVols() {
		return vols;
	}

	public void setVols(Vol vols) {
		this.vols = vols;
	}

	public Aeroport getAeroport() {
		return aeroport;
	}

	public void setAeroport(Aeroport aeroport) {
		this.aeroport = aeroport;
	}

	@Override
	public String toString() {
		return "Depart [dateDepart=" + dateDepart + ", aeroport=" + aeroport + "]";
	}
	
	
	

}
