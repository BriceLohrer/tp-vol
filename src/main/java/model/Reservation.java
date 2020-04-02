package model;

public class Reservation {
	private Boolean annulee;
	private Boolean confirmee;
	private Boolean ouverte;
	private String numeroDeReservation;
	private Passager passager;
	private Client client;
	private Paiement paiement;
	private Trajet traj;
	
	//generator
	
	public Reservation() {
		super();
	}
	public Reservation(String numeroDeReservation) {
		super();
		this.numeroDeReservation = numeroDeReservation;
	}
	
	//Getters and setters
		
	public Boolean getAnnulee() {
		return annulee;
	}
	public void setAnnulee(Boolean annulee) {
		this.annulee = annulee;
	}
	public Boolean getConfirmee() {
		return confirmee;
	}
	public void setConfirmee(Boolean confirmee) {
		this.confirmee = confirmee;
	}
	public Boolean getOuverte() {
		return ouverte;
	}
	public void setOuverte(Boolean ouverte) {
		this.ouverte = ouverte;
	}
	public String getNumeroDeReservation() {
		return numeroDeReservation;
	}
	public void setNumeroDeReservation(String numeroDeReservation) {
		this.numeroDeReservation = numeroDeReservation;
	}
	public Passager getPassager() {
		return passager;
	}
	public void setPassager(Passager passager) {
		this.passager = passager;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Paiement getPaiement() {
		return paiement;
	}
	public void setPaiement(Paiement paiement) {
		this.paiement = paiement;
	}
	
	
	//toString
	
	public Trajet getTraj() {
		return traj;
	}
	public void setTraj(Trajet traj) {
		this.traj = traj;
	}
	@Override
	public String toString() {
		return "Reservation [annulee=" + annulee + ", confirmee=" + confirmee + ", ouverte=" + ouverte
				+ ", numeroDeReservation=" + numeroDeReservation + ", passager=" + passager + ", client=" + client
				+ ", paiement=" + paiement + "]";
	}
	
	

}
