package cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/logout_cookie")
public class LogoutServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Cookie[] cookies=req.getCookies();
		
		PrintWriter pw=resp.getWriter();
		resp.setContentType("text/html");
		
		if(cookies!=null) {
			
			for(Cookie c:cookies) {
				c.setMaxAge(10);
				resp.addCookie(c);
			}
			
		}
		
		pw.println("<h1  href='view_cookie'>  View Data </h1>");
		
		
	}
}
