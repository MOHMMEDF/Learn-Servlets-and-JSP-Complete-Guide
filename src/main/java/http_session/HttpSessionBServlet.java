package http_session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/http_sessionB")
public class HttpSessionBServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//now here first check if in httpSession object data is present or not
		//create httpSession obj 
		
		HttpSession session=req.getSession();//here also it check if same client already session is created or not ,created so it uses existing one
		
		Student s=(Student)session.getAttribute("student");//here key we r passing which is setted 
		
		PrintWriter pw=resp.getWriter();
		resp.setContentType("text/html");
		
		if(s !=null) {
			pw.println("<h1> Student Id :" +s.getId() + "  </h1>");
			pw.println("<h1> Student name :" +s.getName() + "  </h1>");
			pw.println("<h1> Student percentage :" +s.getPercentage() + "  </h1>");


		}
		else {
			pw.println("<h1> You have been logged out  </h1>");
		}
		
		
	}
}
