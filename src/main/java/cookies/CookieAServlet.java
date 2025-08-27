package cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookieA")
public class CookieAServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter pw=resp.getWriter();
		resp.setContentType("text/html");
		
		String id=req.getParameter("id");
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		
		Cookie c_id=new Cookie("id", id);
		Cookie c_name=new Cookie("name", name);
		Cookie c_email=new Cookie("email", email);
		
		resp.addCookie(c_id);
		resp.addCookie(c_name);
		resp.addCookie(c_email);
		
		pw.println("<h1>  <a  href='view_cookie'>  View Data    </a>    </h1>");
		pw.println("<h1>  <a   href='logout_cookie'> Logout      </a>   </h1>");
		
		
	}
}
