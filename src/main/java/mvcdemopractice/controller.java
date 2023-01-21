package mvcdemopractice;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class controller
 */
public class controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String param=request.getParameter("page");
		if(param.equals("Login"))
		{
			getServletContext().getRequestDispatcher("/Login.jsp").forward(request,response);
		}
		else if(param.equals("SignUp"))
		{
			getServletContext().getRequestDispatcher("/SignUp.jsp").forward(request,response);
		}
		else if(param.equals("about"))
		{
			getServletContext().getRequestDispatcher("/about.jsp").forward(request,response);
		}
		else
		{
			getServletContext().getRequestDispatcher("/notfound.jsp").forward(request,response);
		}

	}

}
