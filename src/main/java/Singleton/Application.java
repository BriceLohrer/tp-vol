package Singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;





public class Application {

	private static Application instance = null;


	private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("sopra-formation");


	private final IAeorportDao evaluationDao = new AeroportDao();

	private final IAvionDao filiereDao = new AvionDao();

	private final ICompagnieDao matiereDao = new CompagnieDao();

	private final IPaiementDao salleDao = new PaiementDao();

	private final IParticulierDao stagiaireDao = new ParticulierDao();

	private final IPassagerDao ueDao = new PassagerDao();
	
	private final IReservationDao ueDao = new ReservationDao();
	
	
	
	


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


	public IEvaluationDao getEvaluationDao() {

		return evaluationDao;

	}


	public IFiliereDao getFiliereDao() {

		return filiereDao;

	}


	public IFormateurDao getFormateurDao() {

		return formateurDao;

	}

	public IMatiereDao getMatiereDao() {

		return matiereDao;

	}

	public ISalleDao getSalleDao() {

		return salleDao;

	}

	public IStagiaireDao getStagiaireDao() {

		return stagiaireDao;

	}

	public IUEDao getUeDao() {

		return ueDao;

	}

}

