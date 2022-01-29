

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Register
 */
public class Register extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	public static final String regex = "^[1-9][0-9]*$";
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String name1 = request.getParameter("name1");
		String name2 = request.getParameter("name2");
		String password = request.getParameter("password");
		
		//Validate the inputs
		if(!validID(id)){
			response.setContentType("text/html");
			response.getWriter().println("<h4><span style='color:red'>That ID <q>" + id + "</q> does not match the numeric format or is too big.</h4>");
			response.getWriter().println("<br><form method=\"post\" action=\"form.html\"><button type=\"submit\">Try Again</button></form>");
		}
		else if(name1.equals("")){
			response.setContentType("text/html");
			response.getWriter().println("<h4><span style='color:red'>That Name <q>" + name1 + "</q> is invalid.</h4>");
			response.getWriter().println("<br><form method=\"post\" action=\"form.html\"><button type=\"submit\">Try Again</button></form>");
		}
		else if(name2.equals("")){
			response.setContentType("text/html");
			response.getWriter().println("<h4><span style='color:red'>That Name <q>" + name2 + "</q> is invalid.</h4>");
			response.getWriter().println("<br><form method=\"post\" action=\"form.html\"><button type=\"submit\">Try Again</button></form>");
		}
		else if(password.equals("")){
			response.setContentType("text/html");
			response.getWriter().println("<h4><span style='color:red'>That Description <q>" + password + "</q> is invalid.</h4>");
			response.getWriter().println("<br><form method=\"post\" action=\"form.html\"><button type=\"submit\">Try Again</button></form>");
		}
		else {
			jakarta.servlet.http.HttpSession ses = request.getSession();
			ses.setAttribute("id", request.getParameter("id"));
			ses.setAttribute("name1", request.getParameter("name1"));
			ses.setAttribute("name2", request.getParameter("name2"));
			ses.setAttribute("password", request.getParameter("password"));
			response.sendRedirect("user.jsp");
			
		}
	}
	
	//Makes sure the id is a valid one
	private static boolean validID(String idTest)
	{
		java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(regex);
		
		java.util.regex.Matcher matcher = pattern.matcher(idTest);
		
		if(idTest.length() > 8)
			return false;
		else if (matcher.matches())
			return true;
		else
			return false;
	}

}
