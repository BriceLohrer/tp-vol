package Singleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import DAO.JPA.AeroportDaoJpa;
import DAO.JPA.AvionDaoJpa;
import DAO.JPA.CompagnieDaoJpa;
import DAO.JPA.PaiementDaoJpa;
import DAO.JPA.ParticulierDaoJpa;
import DAO.JPA.PassagerDaoJpa;
import DAO.JPA.ReservationDaoJpa;
import DAO.JPA.SocieteDaoJpa;
import DAO.JPA.TrajetDaoJpa;
import DAO.JPA.UtilisateurDaoJpa;
import DAO.JPA.VilleDaoJpa;
import DAO.JPA.VolDaoJpa;
import DAO.interfaces.IAeroportDao;
import DAO.interfaces.IAvionDao;
import DAO.interfaces.ICompagnieDao;
import DAO.interfaces.IPaiementDao;
import DAO.interfaces.IParticulierDao;
import DAO.interfaces.IPassagerDao;
import DAO.interfaces.IReservationDao;
import DAO.interfaces.ISocieteDao;
import DAO.interfaces.ITrajetDao;
import DAO.interfaces.IUtilisateurDao;
import DAO.interfaces.IVilleDao;
import DAO.interfaces.IVolDao;





public class Application {

	private static Application instance = null;

	private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("vol");

	private final IAeroportDao aeroportDao = new AeroportDaoJpa();

	private final IAvionDao avionDao = new AvionDaoJpa();

	private final ICompagnieDao compagnieDao = new CompagnieDaoJpa();

	private final IPaiementDao paiementDao = new PaiementDaoJpa();

	private final IParticulierDao particulierDao = new ParticulierDaoJpa();

	private final IPassagerDao passagerDao = new PassagerDaoJpa();
	
	private final IReservationDao reservationDao = new ReservationDaoJpa();
	
	private final ISocieteDao societeDao = new SocieteDaoJpa();

	private final ITrajetDao trajetDao = new TrajetDaoJpa();
	
	private final IUtilisateurDao utilisateurDao = new UtilisateurDaoJpa();
	
	private final IVilleDao villeDao = new VilleDaoJpa();
	
	private final IVolDao volDao = new VolDaoJpa();
	


	private Application() {

	}


	public static Application getInstance() {

		if (instance == null) {

			instance = new Application();

		}


		return instance;

	}


	public EntityManagerFactory getEmf() {

		return emf;

	}


	public IAeroportDao getAeroportDao() {
		return aeroportDao;
	}


	public IAvionDao getAvionDao() {
		return avionDao;
	}


	public ICompagnieDao getCompagnieDao() {
		return compagnieDao;
	}


	public IPaiementDao getPaiementDao() {
		return paiementDao;
	}


	public IParticulierDao getParticulierDao() {
		return particulierDao;
	}


	public IPassagerDao getPassagerDao() {
		return passagerDao;
	}


	public IReservationDao getReservationDao() {
		return reservationDao;
	}


	public ISocieteDao getSocieteDao() {
		return societeDao;
	}


	public ITrajetDao getTrajetDao() {
		return trajetDao;
	}


	public IUtilisateurDao getUtilisateurDao() {
		return utilisateurDao;
	}


	public IVilleDao getVilleDao() {
		return villeDao;
	}


	public IVolDao getVolDao() {
		return volDao;
	}


	public static void setInstance(Application instance) {
		Application.instance = instance;
	}




}

