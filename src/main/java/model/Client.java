package model;

import java.util.ArrayList;

public abstract class Client {
	private String nom;
	private String type;
	private String mail;
	private String telephone;
	private Integer numeroAdresse;
	private Integer codePostal;
	private String rue;
	private String ville;
	private String complementAdresse;
	private String pays;
	private Utilisateur utilisateur;
	private ArrayList<Passager>passagers = new ArrayList<Passager>();
	private ArrayList<Reservation>reservations = new ArrayList<Reservation>();
	
	//Generator
	
	public Client() {
		super();
	}
	public Client(String nom, String type, String mail) {
		super();
		this.nom = nom;
		this.type = type;
		this.mail = mail;
	}

	//Getters and setters
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public Integer getNumeroAdresse() {
		return numeroAdresse;
	}
	public void setNumeroAdresse(Integer numeroAdresse) {
		this.numeroAdresse = numeroAdresse;
	}
	public Integer getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(Integer codePostal) {
		this.codePostal = codePostal;
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getComplementAdresse() {
		return complementAdresse;
	}
	public void setComplementAdresse(String complementAdresse) {
		this.complementAdresse = complementAdresse;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public ArrayList<Passager> getPassagers() {
		return passagers;
	}
	public void setPassagers(ArrayList<Passager> passagers) {
		this.passagers = passagers;
	}
	public ArrayList<Reservation> getReservations() {
		return reservations;
	}
	public void setReservations(ArrayList<Reservation> reservations) {
		this.reservations = reservations;
	}
	
	//Add
	
	public void addPassager (Passager passager) {
		this.passagers.add(passager);
	}
	public void addReservation (Reservation reservation) {
		this.reservations.add(reservation);
	}
	
	//toString
	
	@Override
	public String toString() {
		return "Client [nom=" + nom + ", type=" + type + ", mail=" + mail + ", telephone=" + telephone
				+ ", numeroAdresse=" + numeroAdresse + ", codePostal=" + codePostal + ", rue=" + rue + ", ville="
				+ ville + ", complementAdresse=" + complementAdresse + ", pays=" + pays + ", utilisateur=" + utilisateur
				+ "]";
	}
	
	
	
	

}
