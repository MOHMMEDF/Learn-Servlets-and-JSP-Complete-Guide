package hidden_form_fields;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hiddenA")
public class HiddenFormAServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("name");
		String dob = req.getParameter("dob");

		PrintWriter pw = resp.getWriter();

		resp.setContentType("text/html");

		pw.print("<html>");

								pw.print("<body>");
						
		pw.print("<form action='hiddenB' method='post'>");
						
		
						pw.print("Email:<input type='email' name='email'><br>");
						
						pw.print("Phone:<input type='tel' name='phone'><br>");
						
						pw.print("<input type='hidden' name='name' value='"+name+"'><br>");
						
						pw.print("<input type='hidden' name='dob' value='"+dob+"'><br>");
						
						pw.print("<input type='submit' name='submit'> <br>");
						
						
						
										pw.print("</form>");
		
															pw.print("</body>");

																pw.print("</html>");

	}
}
