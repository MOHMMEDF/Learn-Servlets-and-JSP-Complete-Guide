package http_Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/http_serv")
public class MyHttpServletDemo extends HttpServlet {

	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		super.doPost(req, resp);
//		
		resp.setContentType("text/html");
		
		PrintWriter pw=resp.getWriter();
		pw.print("<h2> POST METHOD IS CLICKED </h2>");
	}
	
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		super.doGet(req, resp);
//		
		resp.setContentType("text/html");
		PrintWriter pw=resp.getWriter();
		pw.print("<h2> GET METHOD IS CLICKED </h2>");
		
	}
}
