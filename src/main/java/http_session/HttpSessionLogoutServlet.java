package http_session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/http_session_logout")
public class HttpSessionLogoutServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//now here also 1st check in httpsession object data is present or not
		
		HttpSession session=req.getSession();//here it uses existing httpSession obj,by seeing that not created new
		
		session.invalidate();//here destroying the httpsession object
		
		PrintWriter pw=resp.getWriter();
		resp.setContentType("text/html");
		
		pw.println("<h1>    <a  href='http_seesionB>  View Student data     </a>  </h1>");
		
	}
}
