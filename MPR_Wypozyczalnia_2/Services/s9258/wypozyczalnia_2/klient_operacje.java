package s9258.wypozyczalnia_2;






import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class klient_operacje {


	
	public void saveKlient(Klient klient) {
		// otwiera sesje hibernate

		
		SessionFactory SessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		
		Session session = SessionFactory.openSession();
		// otwiera transakcje bazy danych
		session.beginTransaction();
		// zapisuje klienta
		session.persist(klient);
		// commituje transakcje, zatwierdza
		session.getTransaction().commit();
		// zamkniecie sesji
		session.close();
	}

}
