package uqu.jeeLab.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public FirstServlet() {
        super();
     
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//response.getWriter().append("<h1> hello brother <h1>");
		this.getServletContext().getRequestDispatcher("/WEB-INF/Form.jsp")
		.forward(request, response);

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String MSg="Hello";
		request.setAttribute("Messge", MSg);
		this.getServletContext().getRequestDispatcher("/WEB-INF/JRegistration.jsp")
		.forward(request, response);
	}

}
