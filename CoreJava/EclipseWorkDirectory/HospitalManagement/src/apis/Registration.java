package apis;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import utilities.DefaultConfigurations;
import utilities.UserUtilities;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/registration")
public class Registration extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private UserUtilities userUtil;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registration() {
        super();
        userUtil = new UserUtilities();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("register.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String firstname = request.getParameter("firstname");
			String lastname = request.getParameter("lastname");
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			userUtil.addUser(firstname, lastname, email, password, DefaultConfigurations.ADMIN_ROLE_ID);
			response.sendRedirect("index.jsp");
		} catch (Exception e) {
			System.out.println("Following exception raised at doPost method of class " + this.getClass().getName() + " : " + e);
			response.getOutputStream().print("Error occurred while registring admin /n" + e);
		}
	}

}
