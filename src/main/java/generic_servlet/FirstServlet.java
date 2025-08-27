package generic_servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter pw=res.getWriter();
		
		pw.print("<h1>  THIS IS AN DYNAMIC RESPONSE FROM FIRST SERVLET CLASS !......</h1>");
		
	}
}
