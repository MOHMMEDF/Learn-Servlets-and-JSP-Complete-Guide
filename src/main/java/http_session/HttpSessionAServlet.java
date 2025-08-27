package http_session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/http_sessionA")
public class HttpSessionAServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		double percentage=Double.parseDouble(req.getParameter("percentage"));
		
		//now creating httpSession obj by using interface called httpSession
		
		HttpSession session=req.getSession();//here as it check is there any session is created for this client,if created it uses existing one Else create new session object
		
		//now
		
		Student s=new Student(id, name, percentage);
		
		//now adding student object s to this session
		
		session.setAttribute("student", s);
		
		PrintWriter pw=resp.getWriter();
		
		resp.setContentType("text/html");
		
		pw.println("<h1>   <a  href='http_sessionB'>  View Student data     </a>   </h1>");
		pw.println("<h1> <a   href='http_session_logout'>   logout </a>      </h1>");
		
	}
}
