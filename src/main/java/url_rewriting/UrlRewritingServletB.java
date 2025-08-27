package url_rewriting;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/url_rewritingB")
public class UrlRewritingServletB extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//if we r fetching data from form so we use req.getPrarameter
		//also when we fetch data from url then also use to fetch req.getparameter
		
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		
		PrintWriter pw=resp.getWriter();
		
		resp.setContentType("text/html");
		
		pw.print("<h1>Login Details are:</h1>");
		pw.print("<h2> Email:"+email+"</h2>");
		pw.print("<h2> Password:"+password+"</h2>");
		
		
	}
	
}
