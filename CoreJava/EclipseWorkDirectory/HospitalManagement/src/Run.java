import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import models.Role;

public class Run {

	public static void main(String[] args) {
		try {
			Configuration configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");
			SessionFactory sessionFactory = configuration.buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			Role adminRole = new Role("ADMIN", "This role is for admin");
			session.save(adminRole);
			Role doctorRole = new Role("DOCTOR", "This role is for doctor");
			session.save(doctorRole);
			Role patientRole = new Role("PATIENT", "This role is for patient");
			session.save(patientRole);
			transaction.commit();
			session.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
