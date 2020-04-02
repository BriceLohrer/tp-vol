package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

public class Trajet {
	
	
	@ManyToMany
	@JoinColumn(name = "vols_id")
	private List<Vol> volsOrdonne = new ArrayList<Vol>();
	private Reservation res;
	
	public Trajet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Vol> getVolsOrdonne() {
		return volsOrdonne;
	}

	public void setVolsOrdonne(ArrayList<Vol> volsOrdonne) {
		this.volsOrdonne = volsOrdonne;
	}

	
	public void AddVol(Vol volsOrdonne) {
		this.volsOrdonne.add(volsOrdonne);
	}

	public Reservation getRes() {
		return res;
	}

	public void setRes(Reservation res) {
		this.res = res;
	}

	@Override
	public String toString() {
		return "Trajet [volsOrdonne=" + volsOrdonne + ", res=" + res + "]";
	}


	
	

}
