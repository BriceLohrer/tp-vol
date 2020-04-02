package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
public class Depart {
	@Column(name = "datedepart", length = 255)
	private Date dateDepart;
	@Column(name = "vols", length = 255)
	private Vol vols;
	@Embedded
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
