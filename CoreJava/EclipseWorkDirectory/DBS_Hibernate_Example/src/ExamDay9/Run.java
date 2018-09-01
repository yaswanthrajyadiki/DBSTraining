package ExamDay9;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Run {
	
	static SessionFactory sessionFactory;
	
	public Integer addPerson(Person person) {
		Integer id = 0;
		Session session = null;
		try {
			session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(person);
			id = person.getId();
			transaction.commit();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			session.close();
		}
		return id;
	}
	
	public void update(Integer id, Person updatablePerson) {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			Person person = (Person) session.get(Person.class, id);
			person.setName(updatablePerson.getName());
			person.setAddress(updatablePerson.getAddress());
			session.update(person);
			transaction.commit();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			session.close();
		}
	}
	
	public void delete(Integer id) {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			Person person = (Person) session.get(Person.class, id);
			session.delete(person);
			transaction.commit();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			session.close();
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Person> list() {
		List<Person> people = new ArrayList<Person>();
		Session session = null;
		try {
			session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			people = (List<Person>) session.createQuery("FROM Person").list();
			transaction.commit();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			session.close();
		}
		return people;
	}
	
	public static void main(String[] args) {
		try {
			Run run = new Run();
			Configuration configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");
			sessionFactory = configuration.buildSessionFactory();
			Integer person1 = run.addPerson(new Person(1, "Ramu", "Gachibowli"));
			Integer person2 = run.addPerson(new Person(2, "Somu", "Indira Nagar"));
			Integer person3 = run.addPerson(new Person(3, "Ramu", "Koti"));
			
			System.out.println(run.list());
			run.update(person1, new Person(1, "Ramu", "AnjaiahNagar"));
			run.update(person3, new Person(3, "Ramnath", "Koti"));
			
			run.delete(person2);
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
}
