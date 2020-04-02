package model;

import java.util.ArrayList;

public class Aeroport {
	private String nom;
	private ArrayList<Ville> villes = new ArrayList<Ville>();
	
	public Aeroport() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public ArrayList<Ville> getVilles() {
		return villes;
	}

	public void setVilles(ArrayList<Ville> villes) {
		this.villes = villes;
	}
	

	public void addVille(Ville villes) {
		this.villes.add(villes);
	}

	@Override
	public String toString() {
		return "Aeroport [nom=" + nom + ", villes=" + villes + "]";
	}
	
	
	
}
