package model;

public class Paiement {
	private String type;
	private Float montant;
	private Reservation reservation;
	
	//generator
	
	public Paiement() {
		super();
	}
	public Paiement(String type, Float montant) {
		super();
		this.type = type;
		this.montant = montant;
	}
	
	//Getters and setters
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Float getMontant() {
		return montant;
	}
	public void setMontant(Float montant) {
		this.montant = montant;
	}
	public Reservation getReservation() {
		return reservation;
	}
	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
	
	//toString
	
	@Override
	public String toString() {
		return "Paiement [type=" + type + ", montant=" + montant + "]";
	}
	
	
	

}
