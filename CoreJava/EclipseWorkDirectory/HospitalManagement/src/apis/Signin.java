package apis;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;

import models.UserToken;
import utilities.UserUtilities;

/**
 * Servlet implementation class Signin
 */
@WebServlet("/signin")
public class Signin extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private UserUtilities userUtil;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Signin() {
        super();
        userUtil = new UserUtilities();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("index.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			HttpSession session = request.getSession();
			UserToken userToken = userUtil.validateUser(email, password);
			if(userToken != null) {
				session.setAttribute("user", userToken.getUser());
				session.setAttribute("userToken", userToken.getToken());
				response.sendRedirect("adminDashboard.jsp");
			} else {
				session.setAttribute("user", null);
				session.setAttribute("userToken", null);
				response.sendRedirect("index.jsp");
			}
		} catch (Exception e) {
			System.out.println("Following exception raised at doPost method of class " + this.getClass().getName() + " : " + e);
			response.getOutputStream().print("Error occurred while registring admin /n" + e);
		}
	}

}
