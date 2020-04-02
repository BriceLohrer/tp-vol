package Test;

import java.util.Date;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Singleton.Application;
import model.Aeroport;
import model.Arrivee;
import model.Avion;
import model.Compagnie;
import model.Depart;
import model.Paiement;
import model.Particulier;
import model.Passager;
import model.Reservation;
import model.Trajet;
import model.Utilisateur;
import model.Ville;
import model.Vol;

public class Test_vide {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vol");
		
		Particulier moi = new Particulier();
		moi.setPrenom("Damien");
		moi.setNom("Dubreuil");
		moi.setCodePostal(33610);
		moi.setMail("dubreuil.damien@laposte.net");
		moi.setTelephone("06.45.87.20.52");
		moi.setNumeroAdresse(5);
		moi.setRue("impasse de Granet");
		moi.setVille("Canejan");
		moi.setComplementAdresse(null);
		moi.setPays("France");
		
		moi = Application.getInstance().getParticulierDao().save(moi);

		Utilisateur user = new Utilisateur();
		user.setIdentifiant("ddub");
		user.setMotDePasse("azerty");
		user.setClient(moi);
		
		user = Application.getInstance().getUtilisateurDao().save(user);
		
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
		
		toi=Application.getInstance().getPassagerDao().save(toi);
		
		Reservation res = new Reservation();
		res.setAnnulee(false);
		res.setConfirmee(true);
		res.setOuverte(true);
		res.setNumeroDeReservation("46579845");
		res.setClient(moi);
		res.setPassager(toi);
		
		res=Application.getInstance().getReservationDao().save(res);
		
		Paiement paiement = new Paiement();
		paiement.setMontant(54.56f);
		paiement.setType("CB");
		paiement.setReservation(res);
		
		paiement=Application.getInstance().getPaiementDao().save(paiement);
		
		Ville paris = new Ville();
		paris.setNom("Paris");
		paris.setPays("France");
		
		paris=Application.getInstance().getVilleDao().save(paris);
		
		Aeroport roisy = new Aeroport();
		roisy.setNom("Roisy");
		roisy.addVille(paris);
		
		roisy=Application.getInstance().getAeroportDao().save(roisy);
		
		Depart dep = new Depart();
		dep.setAeroport(roisy);
		dep.setDateDepart(new Date());
		
		Arrivee arr = new Arrivee();
		arr.setAeroprt(roisy);
		arr.setDateArrivee(new Date());
		
		Avion airbus = new Avion();
		airbus.setModele("Airbus A 320");
		airbus=Application.getInstance().getAvionDao().save(airbus);
		
		Compagnie airfrance = new Compagnie();
		airfrance.setNom("Air France");
		airfrance=Application.getInstance().getCompagnieDao().save(airfrance);
		
		Vol vol1 = new Vol();
		vol1.setNumeroDeVol("213");
		vol1.setOuvert(true);
		vol1.setDepart(dep);
		vol1.setArrivee(arr);
		vol1.setAvion(airbus);
		vol1.setCompagnie(airfrance);
		
		vol1=Application.getInstance().getVolDao().save(vol1);
		
		Trajet traj = new Trajet();
		traj.setRes(res);
		traj=Application.getInstance().getTrajetDao().save(traj);

		
		vol1.addTrajet(traj);
		vol1=Application.getInstance().getVolDao().save(vol1);

		
		emf.close();
	}

}
