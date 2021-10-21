

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletTraitement
 */
@WebServlet("/ServletTraitement")
public class ServletTraitement extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletTraitement() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String name = request.getParameter("nom");
		String firstName = request.getParameter("prenom");
		String sexe =request.getParameter("sexe");
		String fonction = request.getParameter("fonction");
		
		String[] loisirs = request.getParameterValues("losirs[]");
		out.println("<html>");
		out.println("Bonjour " + (sexe.equals("H")?"Monsieur ":"Madame ") +  firstName + " " + name +" de fonction :"+fonction);
		if(loisirs.length > 0) {
			out.println("<br>ses loisirs sont: <ul>");
			for(String loisir : loisirs) {
				out.println("<li>" + loisir + "</li>");
			}
			out.println("</ul>");
		}
		out.println("</html>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
