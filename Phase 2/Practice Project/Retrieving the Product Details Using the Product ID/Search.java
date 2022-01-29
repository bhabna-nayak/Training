

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Servlet implementation class Search
 */
public class Search extends HttpServlet {
	 
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		
        response.setContentType("text/html");
        @SuppressWarnings("unused")
		PrintWriter out = response.getWriter();
        
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/test";
        String driver = "com.mysql.cj.jdbc.Driver";
        String userName = "root";
        String password = "";
 
        Statement st;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, userName, password);
            System.out.println("Connected!");
            String id = request.getParameter("id");
 
            ArrayList<String> al = null;
            ArrayList<ArrayList<String>> idlist = new ArrayList<ArrayList<String>>();
            String query = "select * from member where id='" + id + "' ";
 
            System.out.println("query " + query);
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
 
            while (rs.next()) {
                al = new ArrayList<String>();
 
                al.add(rs.getString(1));
                al.add(rs.getString(2));
                al.add(rs.getString(3));
                al.add(rs.getString(4));
 
                System.out.println("al :: " + al);
                idlist.add(al);
            }
 
            request.setAttribute("piList", idlist);
            RequestDispatcher view = request.getRequestDispatcher("/result.jsp");
            view.forward(request, response);
            conn.close();
            System.out.println("Disconnected!");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}