package servlet_context;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/contextA")
public class ServletContextA extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ServletContext context=req.getServletContext();
		
		String id=context.getInitParameter("stud_id");
		String name=context.getInitParameter("stud_name");
		String perc=context.getInitParameter("stud_perc");
		
		context.setAttribute("message", "Greeting from ServletA !........");
		
		PrintWriter pw=resp.getWriter();
		resp.setContentType("text/html");
		
		pw.print("<h1>Student Id :" +id+"</h1>");
		pw.print("<h1>Student Name :" +name+"</h1>");
		pw.print("<h1>Student Percentage :" +perc+"</h1>");
		
	}
	
}
