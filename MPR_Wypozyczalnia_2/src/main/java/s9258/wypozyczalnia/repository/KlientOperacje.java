package s9258.wypozyczalnia.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import s9258.wypozyczalnia.Klient;

public class KlientOperacje {

	public void saveKlient(Klient klient) {
		// otwiera sesje hibernate

		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		// otwiera transakcje bazy danych
		session.beginTransaction();
		// zapisuje studenta
		session.persist(klient);
		// commituje transakcje, zatwierdza
		session.getTransaction().commit();
		// zamkniecie sesji
		session.close();
	}

	public Klient getKlientById(int id) {
		// otwiera sesje hibernate

		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		// otwiera transakcje bazy danych
		session.beginTransaction();
		// zapisuje studenta
		Klient k = (Klient) session.get(Klient.class, id);
		// commituje transakcje, zatwierdza
		session.getTransaction().commit();
		// zamkniecie sesji
		session.close();

		return k;
	}

	public List<Klient> getAllKlient() {
		// otwiera sesje hibernate
		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		// otwiera transakcje bazy danych
		session.beginTransaction();
		// zapisuje studenta

		List<Klient> klientAll = session.createQuery("from Klient").list();
		
		// commituje transakcje, zatwierdza
		session.getTransaction().commit();
		// zamkniecie sesji
		session.close();

		return klientAll;
	}

}
