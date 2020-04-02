package model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

@Entity
public class Trajet {
	@Id
	@GeneratedValue
	private Long id;
	@Transient
	private ArrayList<Vol> volsOrdonne = new ArrayList<Vol>();
	@OneToOne
	@JoinColumn(name="reservation_id")
	private Reservation res;
	
	public Trajet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Vol> getVolsOrdonne() {
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
