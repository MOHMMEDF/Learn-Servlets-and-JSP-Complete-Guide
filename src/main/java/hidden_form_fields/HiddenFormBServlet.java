package hidden_form_fields;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hiddenB")
public class HiddenFormBServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		String dob = req.getParameter("dob");
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		
		PrintWriter pw = resp.getWriter();
		resp.setContentType("text/html");
		
		pw.println("<h1>User details</h1>");
		pw.println("<h2>User Name : "+name+ " </h2>");
		pw.println("<h2>User dob : "+dob+ " </h2>");
		pw.println("<h2>User email : "+email+ " </h2>");
		pw.println("<h2>User phone : "+phone+ " </h2>");
		
		

		
		
		
	}
	
}
