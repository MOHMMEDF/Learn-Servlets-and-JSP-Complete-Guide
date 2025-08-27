package send_redirect;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/send_redirect")
public class SendRedirectServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String choice = req.getParameter("choice");
		
		if(choice.equals("instagram")) {
			
			resp.sendRedirect("https://www.instagram.com/");			
			
		}
		
		else if (choice.equals("greet.html")) {
			resp.sendRedirect("greet.html");
		}
		else if(choice.equals("index.jsp")) {
			resp.sendRedirect("index.jsp");
		}
		else if(choice.equals("welcome")) {
			resp.sendRedirect("new_welcome");
		}
		
		
		
		
	}
	
	
}
