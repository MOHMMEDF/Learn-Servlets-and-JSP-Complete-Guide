package servlet_context;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/contextB")
public class ServletContextB extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ServletContext context=req.getServletContext();
		
		String name=(String)context.getAttribute("message");
		
		PrintWriter pw=resp.getWriter();
		resp.setContentType("text/html");
		
		pw.print("<h1>"+name+"</h1>");
		
	}
}
