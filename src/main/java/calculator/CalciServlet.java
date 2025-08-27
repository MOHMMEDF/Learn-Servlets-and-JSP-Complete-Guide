package calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CalciServlet extends GenericServlet {

	CalculatorOperation co=new CalculatorOperation();
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Double n1=Double.parseDouble(req.getParameter("n1")) ;
		
		Double n2=Double.parseDouble(req.getParameter("n2")) ;
		
		String [] operation=req.getParameterValues("operation");
		
		//now set content type
		
		res.setContentType("text/html");
		
		PrintWriter pw=res.getWriter();
		pw.print("<h1>RESULT :</h1>");
		
		for(String o:operation) {
			
			if(o.equalsIgnoreCase("add")) {
				pw.print("<h2> Addition :"+co.add(n1, n2)+"</h2>");
			}
			
			if(o.equalsIgnoreCase("subtract")) {
				pw.print("<h2> Subtraction :"+co.sub(n1, n2)+"</h2>");

			}
			
			
			if(o.equalsIgnoreCase("multiply")) {
				pw.print("<h2> Multiplication :"+co.mult(n1, n2)+"</h2>");

			}
			
			if(o.equalsIgnoreCase("divide")) {
				pw.print("<h2> Division :"+co.div(n1, n2)+"</h2>");

			}
			
			
		}

		
		
		
		
	}
	
	
}
