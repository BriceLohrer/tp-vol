package Test;

import java.util.Date;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Aeroport;
import model.Arrivee;
import model.Avion;
import model.Compagnie;
import model.Depart;
import model.Paiement;
import model.Particulier;
import model.Passager;
import model.Reservation;
import model.Societe;
import model.Trajet;
import model.Ville;
import model.Vol;
import Singleton.Application;

public class Test_vide {

	public static void main(String[] args) {
	
		Societe sopraSteria = new Societe();
		sopraSteria.setSiret("1234");
		sopraSteria.setNumeroDeTva("5454");
		sopraSteria.setNom("Sopra Steria");
		sopraSteria.setCodePostal(33700);
		sopraSteria.setMail("mlskqsd@qlksjd.qsd");
		sopraSteria.setTelephone("06.48.54.21.32");
		sopraSteria.setNumeroAdresse(5);
		sopraSteria.setRue("rue de mlqksd");
		sopraSteria.setVille("M�rignac");
		sopraSteria.setComplementAdresse(null);
		sopraSteria.setPays("France");
		
		sopraSteria = Application.getInstance().getSocieteDao().save(sopraSteria); // managed
		
		Particulier moi = new Particulier();
		moi.setPrenom("Damien");
		moi.setNom("Dubreuil");
		moi.setCodePostal(33610);
		moi.setMail("dubreuil.damien@laposte.net");
		moi.setTelephone("06.45.87.20.52");
		moi.setNumeroAdresse(5);
		moi.setRue("impasse de Granet");
		moi.setVille("Can�jan");
		moi.setComplementAdresse(null);
		moi.setPays("France");
		
		user = Application.getInstance().getUtilisateurDao().save(user);
		
		moi = Application.getInstance().getParticulierDao().save(moi); // managed
		
		toi=Application.getInstance().getPassagerDao().save(toi);
		
		
		Passager toi = new Passager();
		toi.setNom("Ujsdhf");
		toi.setPrenom("Cl�ment");
		toi.setDateDeNaissance(new Date());
		toi.setNationalite("fran�aise");
		toi.setSexe("H");
		toi.setNumeroPasseport("qsdlk");
		toi.setDateValidite(new Date());
		toi.setTypePieceIdentite("passeport");
		toi.setHandicap(false);
		toi.setClient(moi);
		
		toi = Application.getInstance().getPassagerDao().save(toi); // managed
		
		moi.addPassager(toi);
		
		moi = Application.getInstance().getParticulierDao().save(moi); // managed
		
		
		
		Reservation res = new Reservation();
		res.setAnnulee(false);
		res.setConfirmee(true);
		res.setOuverte(true);
		res.setNumeroDeReservation("46579845");
		res.setClient(moi);
		res.setPassager(toi);
		
		res = Application.getInstance().getReservationDao().save(res); // managed
		
	
		

				
		Paiement paiement = new Paiement();
		paiement.setMontant(54.56f);
		paiement.setType("CB");
		paiement.setReservation(res);
		paiement = Application.getInstance().getPaiementDao().save(paiement); // managed
		
	
		res.setPaiement(paiement);
		res = Application.getInstance().getReservationDao().save(res); // managed
		
		Ville paris = new Ville();
		paris.setNom("Paris");
		paris.setPays("France");
		
		paris = Application.getInstance().getVilleDao().save(paris);
		
		Aeroport roisy = new Aeroport();
		roisy.setNom("Roisy");
		roisy.addVille(paris);
		
		roisy = Application.getInstance().getAeroportDao().save(roisy);
		
		paris.addAeroport(roisy);
		paris = Application.getInstance().getVilleDao().save(paris);
		
		Depart dep = new Depart();
		dep.setAeroport(roisy);
		dep.setDateDepart(new Date());
				
		Arrivee arr = new Arrivee();
		arr.setAeroprt(roisy);
		arr.setDateArrivee(new Date());
		
		Avion airbus = new Avion();
		airbus.setModele("Airbus A 320");

		airbus = Application.getInstance().getAvionDao().save(airbus);
		
		Compagnie airfrance = new Compagnie();
		airfrance.setNom("Air France");

		airfrance = Application.getInstance().getCompagnieDao().save(airfrance);
		
		Vol vol1 = new Vol();
		vol1.setNumeroDeVol("65498");
		vol1.setOuvert(true);
		vol1.setDepart(dep);
		vol1.setArrivee(arr);
		vol1.setAvion(airbus);
		vol1.setCompagnie(airfrance);
		
		vol1 = Application.getInstance().getVolDao().save(vol1); 
		

		
		Trajet traj = new Trajet();
		
		traj.setRes(res);
		res.setTraj(traj);
		
		
		
		
		traj = Application.getInstance().getTrajetDao().save(traj); 
		vol1.addTrajet(traj);
		vol1 = Application.getInstance().getVolDao().save(vol1); 
	}

}
