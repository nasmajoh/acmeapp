package demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AcmeServlet
 */
@WebServlet(description = "Acme Servlet - Java EE demo", urlPatterns = { "/AcmeServlet" })
public class AcmeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
    public AcmeServlet() {
        super();
    }
 */
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		pw.print("<body>");
		pw.print("<h2>Hello from Acme Servlet!</h2>");
		pw.print("</body>");
		
	}

}
