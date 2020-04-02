package model;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Vol {
	@Id
	@GeneratedValue
	private Long id;
	@Column (nullable =false)
	private String numeroDeVol;
	private Boolean ouvert;
	@Transient
	private ArrayList<Trajet> trajets = new ArrayList<Trajet>();
	@Transient
	private Compagnie compagnie;
	@Transient
	private Avion avion;
	@Transient
	private Arrivee arrivee;
	@Transient
	private Depart depart;

	
	public Vol() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNumeroDeVol() {
		return numeroDeVol;
	}

	public void setNumeroDeVol(String numeroDeVol) {
		this.numeroDeVol = numeroDeVol;
	}

	public Boolean getOuvert() {
		return ouvert;
	}

	public void setOuvert(Boolean ouvert) {
		this.ouvert = ouvert;
	}

	public ArrayList<Trajet> getTrajets() {
		return trajets;
	}

	public void setTrajets(ArrayList<Trajet> trajets) {
		this.trajets = trajets;
	}

	public Compagnie getCompagnie() {
		return compagnie;
	}

	public void setCompagnie(Compagnie compagnie) {
		this.compagnie = compagnie;
	}

	public Avion getAvion() {
		return avion;
	}

	public void setAvion(Avion avion) {
		this.avion = avion;
	}

	public Arrivee getArrivee() {
		return arrivee;
	}

	public void setArrivee(Arrivee arrivee) {
		this.arrivee = arrivee;
	}

	public Depart getDepart() {
		return depart;
	}

	public void setDepart(Depart depart) {
		this.depart = depart;
	}
	
	public void addTrajet(Trajet trajet) {
		this.trajets.add(trajet);
	}

	@Override
	public String toString() {
		return "Vol [numeroDeVol=" + numeroDeVol + ", ouvert=" + ouvert + ", compagnie=" + compagnie + ", avion="
				+ avion + ", arrivee=" + arrivee + ", depart=" + depart + "]";
	}
	




	
	
	
	
}
