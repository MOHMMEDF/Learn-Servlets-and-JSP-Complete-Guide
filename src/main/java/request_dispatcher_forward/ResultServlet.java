package request_dispatcher_forward;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/stud_result")
public class ResultServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		
		double percentage = (Double)req.getAttribute("percentage");
		
		
		PrintWriter pw = resp.getWriter();
		
		resp.setContentType("text/html");
		
		pw.println("<h1>Student name " + name + "</h1>");
		pw.println("<h1>Student Percentage " + percentage + "</h1>");
		if(percentage > 35) {
			pw.println("<h2>Result : passed </h2>" );
		}
		else {
			pw.println("<h2>Result : Failed </h2>" );
		}
		
	
		
		
	}
	
	
}
