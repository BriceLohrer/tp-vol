package model;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Ville {
	@Id
	@GeneratedValue
	private Long id;
	@Column(nullable=false)
	private String nom;
	private String pays;
	@Transient
	private ArrayList<Aeroport> aeroports = new ArrayList<Aeroport>();
	
	public Ville() {
		super();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public ArrayList<Aeroport> getAeroports() {
		return aeroports;
	}

	public void setAeroports(ArrayList<Aeroport> aeroports) {
		this.aeroports = aeroports;
	}
	
	public void addAeroport(Aeroport aeroports) {
		this.aeroports.add(aeroports);
	}

	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", pays=" + pays + "]";
	}
	
	

}
