package utilities;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import models.Drug;

public class DrugUtilities {
	
	SessionFactory sessionFactory;
	
	public DrugUtilities() {
		try {
			Configuration configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");
			sessionFactory = configuration.buildSessionFactory();
		} catch (Exception e) {
			System.out.println("Following exception raised at class " + this.getClass().getName() + " constructor : " + e);
		}
	}

	public void addDrug(String name, String formula, Date expiry, String supplier, Integer units) {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			Drug drug = new Drug(name, formula, expiry, supplier, units);
			session.save(drug);
			transaction.commit();
		} catch (Exception e) {
			System.out.println("Following exception raised at addDrug method of class " + this.getClass().getName() + " : " + e);
		} finally {
			if(session != null)
				session.close();
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Drug> getAllDrugs() {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			List<Drug> drugs = (List<Drug>) session.createQuery("From Drug").list();
			transaction.commit();
			return drugs;
		} catch (Exception e) {
			System.out.println("Following exception raised at getAllDrug method of class " + this.getClass().getName() + " : " + e);
		} finally {
			if(session != null)
				session.close();
		}
		return null;
	}
	
	public boolean isDrugExpired(Integer drugId) {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			Drug drug = session.get(Drug.class, drugId);
			Date currentDate = new Date(Calendar.getInstance().getTimeInMillis());
			if(drug.getExpiry().compareTo(currentDate) > 0) 
				return true;
			transaction.commit();
		} catch (Exception e) {
			System.out.println("Following exception raised at isDrugExpired method of class " + this.getClass().getName() + " : " + e);
		} finally {
			if(session != null)
				session.close();
		}
		return false;
	}
	
}
