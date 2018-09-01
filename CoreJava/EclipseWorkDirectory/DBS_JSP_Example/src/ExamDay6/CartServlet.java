package ExamDay6;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CartServlet
 */
@WebServlet("/CartServlet")
public class CartServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    private static List<Product> products = new ArrayList<>();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Double total = 0.0;
		for(Product prod: products) {
			total = total + (prod.getPrice() * prod.getQuantity());
		}
		response.getOutputStream().println("<h1> Your products were </h1> <br><br> <h2>" + products + "</h2><br><br>" 
		+ "<h1> Total cart value was " + total + " </h1>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String prodName = request.getParameter("prodName");
		Double price = Double.parseDouble(request.getParameter("price"));
		Double quantity = Double.parseDouble(request.getParameter("quantity"));
		products.add(new Product(id, prodName, price, quantity));
		request.setAttribute("products", products.toString());
		response.sendRedirect("addProducts.jsp"); 
	}

}
