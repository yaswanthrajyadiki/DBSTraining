package utilities;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import models.Role;
import models.User;
import models.UserRole;
import models.UserToken;

public class UserUtilities {

	SessionFactory sessionFactory;
	
	public UserUtilities() {
		try {
			Configuration configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");
			sessionFactory = configuration.buildSessionFactory();
		} catch (Exception e) {
			System.out.println("Following exception raised at class " + this.getClass().getName() + " constructor : " + e);
		}
	}
	
	public void addUser(String firstname, String lastname, String email, String password, Integer roleId) {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			User user = new User(email, firstname, lastname, password);
			session.save(user);
			Role role = session.get(Role.class, roleId);
			UserRole userRole = new UserRole(user, role);
			session.save(userRole);
			transaction.commit();
		} catch (Exception e) {
			System.out.println("Following exception raised at addUser method of class " + this.getClass().getName() + " : " + e);
		} finally {
			if(session != null)
				session.close();
		}
		
	}
	
	public void updateUser(Integer userId, String firstname, String lastname, String password) {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			User user = session.get(User.class, userId);
			if(firstname != null && !firstname.isEmpty())
				user.setFirstname(firstname);
			if(lastname != null && !lastname.isEmpty())
				user.setLastname(lastname);
			if(password != null && !password.isEmpty())
				user.setPassword(password);
			session.save(user);
			transaction.commit();
		} catch (Exception e) {
			System.out.println("Following exception raised at updateUser method of class " + this.getClass().getName() + " : " + e);
		} finally {
			if(session != null)
				session.close();
		}
		
	}
	
	public boolean isAdmin(Integer userId) {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			UserRole userRole = (UserRole)session.createQuery("FROM UserRole WHERE user.id="+ userId);
			if(userRole.getRole().getId() == DefaultConfigurations.ADMIN_ROLE_ID)
				return true;
			transaction.commit();
		} catch (Exception e) {
			System.out.println("Following exception raised at isAdmin method of class " + this.getClass().getName() + " : " + e);
		} finally {
			if(session != null)
				session.close();
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	public UserToken validateUser(String email, String password) {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			List<User> users = (List<User>) session.createQuery("FROM User where email=\'" + email + "\'").list();
			User user = null;
			if(!users.isEmpty())
				user = users.get(0);
			if(user != null && user.getPassword().equals(password))
				return getUserToken(user.getId());
			transaction.commit();
		} catch (Exception e) {
			System.out.println("Following exception raised at valdateUser method of class " + this.getClass().getName() + " : " + e);
		} finally {
			if(session != null)
				session.close();
		}
		return null;
	}
	
	private UserToken getUserToken(Integer userId) {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			UserToken userToken = session.get(UserToken.class, userId);
			if(userToken == null) {
				User user = session.get(User.class, userId);
				userToken = new UserToken(user, user.getEmail());
				session.save(userToken);
			}
			transaction.commit();
			return userToken;
		} catch (Exception e) {
			System.out.println("Following exception raised at getUserToken method of class " + this.getClass().getName() + " : " + e);
		} finally {
			if(session != null)
				session.close();
		}	
		return null;
	}
	
}
