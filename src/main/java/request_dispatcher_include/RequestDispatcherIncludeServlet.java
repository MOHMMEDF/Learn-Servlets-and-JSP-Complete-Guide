package request_dispatcher_include;

import java.io.IOException;
import java.io.PrintWriter;

import javax.management.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/rd_include")
public class RequestDispatcherIncludeServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email=req.getParameter("email");
		String password=req.getParameter("pwd");
		
		
		PrintWriter pw=resp.getWriter();
		resp.setContentType("text/html");
		
		
		RequestDispatcher rd=req.getRequestDispatcher("rd_include.html");
		if(email.equals("admin@gmail.com")&password.equals("user1234")) {
			pw.print("<h1>LOGIN SUCCESS</h1>");
			
		}
		else {
			
			rd.include(req, resp);
			pw.print("<h1>Login failed Incorrect email or password</h1>");
		}
	}
}
