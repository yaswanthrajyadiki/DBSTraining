package ExamDay7;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Servlet implementation class CartServlet
 */
@WebServlet("/Cart")
public class Cart extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	static SessionFactory sessionFactory;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cart() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void updateProduct(String productId, Product updatableProd) {
    	Session session = null;
    	try {
    		session = sessionFactory.openSession();
			Transaction transacetion = session.beginTransaction();
			Product prod = (Product) session.get(Product.class, productId);
			prod.setName(updatableProd.getName());
			prod.setPrice(updatableProd.getPrice());
			prod.setQuantity(updatableProd.getQuantity());
			prod.setUsername(updatableProd.getUsername());
			session.update(prod);
			transacetion.commit();
    	} catch (Exception e) {
			System.out.println(e);
		} finally {
			session.close();
		}
    }
    
    public void addProduct(Product prod) {
    	Session session = null;
    	try {
    		session = sessionFactory.openSession();
			Transaction transacetion = session.beginTransaction();
			session.save(prod);
			transacetion.commit();
			session.close();
			sessionFactory.close();
    	} catch (Exception e) {
			System.out.println(e);
		} finally {
			session.close();
		}
    }
    
    public void deleteProduct(String productId) {
    	Session session = null;
    	try {
    		session = sessionFactory.openSession();
			Transaction transacetion = session.beginTransaction();
			Product prod = (Product) session.get(Product.class, productId);
			session.delete(prod);
			transacetion.commit();
    	} catch (Exception e) {
			System.out.println(e);
		} finally {
			session.close();
		}
    }
    
    @SuppressWarnings("unchecked")
	public List<Product> listProducts(String username) {
    	List<Product> products = new ArrayList<Product>();
    	Session session = null;
    	try {
    		session = sessionFactory.openSession();
//			Transaction transacetion = session.beginTransaction();
			products = (List<Product>) session.createQuery("from Product").list();
    	} catch (Exception e) {
			System.out.println(e);
		} finally {
			session.close();
		}
    	return products;
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Double total = 0.0;
		String username = request.getParameter("username");
		System.out.println("Username: " + username);
		Configuration hibernateConfigs = new Configuration();
		hibernateConfigs.configure("hibernate.cfg.xml");
		try {
			sessionFactory = hibernateConfigs.buildSessionFactory();
			List<Product> products = listProducts(username); 
			for(Product prod: products) {
				total = total + (prod.getPrice() * prod.getQuantity());
			}
			response.getOutputStream().println("<h1> Your products were </h1> <br><br> <h2>" + products + "</h2><br><br>" 
			+ "<h1> Total cart value was " + total + " </h1>");
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			sessionFactory.close();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String prodName = request.getParameter("prodname");
		String username = request.getParameter("username");
		Double price = Double.parseDouble(request.getParameter("price"));
		Double quantity = Double.parseDouble(request.getParameter("quantity"));
		Configuration hibernateConfigs = new Configuration();
		hibernateConfigs.configure("hibernate.cfg.xml");
		try {
			sessionFactory = hibernateConfigs.buildSessionFactory();
			Product prod = new Product(id, username, prodName, price, quantity);
			addProduct(prod);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			sessionFactory.close();
		}
		request.getSession().setAttribute("products", listProducts(username).toString());
		response.sendRedirect("cart.jsp");
	}

}
 