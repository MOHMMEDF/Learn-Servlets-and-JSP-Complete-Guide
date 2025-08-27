package generic_servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class EmployeeServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int id=Integer.parseInt(req.getParameter("e_id"));
		
		String name=req.getParameter("e_name");//this methods will return in String format,so will not convert in any other format
		long phone=Long.parseLong(req.getParameter("e_phone"));
		String email=req.getParameter("e_email");
		String dob=req.getParameter("e_dob");//this method will return in String format
		
		String [] skills=req.getParameterValues("skills");
		
		//now to print on the browser
		
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		pw.print("<h1>Employee data:</h1>");
		pw.print("<h1>Employee Id:"+id+"<h1>");
		pw.print("<h1>Employee name:"+name+"<h1>");
		pw.print("<h1>Employee phone:"+phone+"<h1>");
		pw.print("<h1>Employee email:"+email+"<h1>");
		pw.print("<h1>Employee dob:"+dob+"<h1>");
		pw.print("<h1>Employee skills:"+skills+"<h1>");
		
		//because skills has many values
		for(String s:skills) {
			pw.print("<h2>"+s+"</h2>");
		}





		
		
	}
}
