package model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity
public class Avion {
	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	
	private String modele;
	@OneToMany (mappedBy = "avion")
	private ArrayList<Vol> vols	 = new ArrayList<Vol>();
	
	public Avion() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Avion(String modele) {
		super();
		this.modele = modele;
	}



	public String getModele() {
		return modele;
	}


	public void setModele(String modele) {
		this.modele = modele;
	}


	public ArrayList<Vol> getVols() {
		return vols;
	}


	public void setVols(ArrayList<Vol> vols) {
		this.vols = vols;
	}


	public void addVol(Vol vols) {
		this.vols.add(vols);
	}



	@Override
	public String toString() {
		return "Avion [modele=" + modele + "]";
	}





	


	



	
	
	

}
