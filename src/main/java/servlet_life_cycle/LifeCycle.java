package servlet_life_cycle;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/life_cycle")
public class LifeCycle extends GenericServlet{

	
	static String static_var = "This is static variable";
	
	public static void staticMessage() {
		System.out.println("static method is called ..");
	}
	
	
	static {
		
		System.out.println("static initilizer is executed");
		System.out.println(static_var);
		staticMessage();
		
		
	}//eof static initilizer
	
	
	String non_static_var = "this is non-static variable";
	
	public void nonStaticMessage() {
		System.out.println("Non static method is called");
	}
	
	
	{
		
		System.out.println("Non static initilizer is executed");
		System.out.println(non_static_var);
		nonStaticMessage();
		
		
	}//eof non static initilizer
	
	public LifeCycle() {
		System.out.println("LifeCycle class constructor is exeuted");
	}
	
	
	@Override
	public void init() throws ServletException {
		System.out.println("init method is executed ...");
	}
	
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("service method is executed ....");
		
	}

}
