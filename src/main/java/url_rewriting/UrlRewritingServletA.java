package url_rewriting;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/url_rewritingA")
public class UrlRewritingServletA extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String email=req.getParameter("email");
		String password=req.getParameter("pwd");
		
		PrintWriter pw=resp.getWriter();
		
		resp.setContentType("text/html");

		if(email.equals("pinku@gmail.com")&& password.equals("pinku1234")) {
			pw.print("<h1>LOGIN SUCCESS!>>>>>>>>>>>></h1>");
			
			pw.print("<h2> <a href='url_rewritingB?email="+email+"&password="+password+"'>   View Login Details    </a>   </h2>");
			
		}
		
	}
	
}
