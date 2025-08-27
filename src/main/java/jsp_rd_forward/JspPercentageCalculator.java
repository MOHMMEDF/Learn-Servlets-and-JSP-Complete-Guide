package jsp_rd_forward;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/jsp_perc_calci")
public class JspPercentageCalculator extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		Double physics=Double.parseDouble(req.getParameter("physics"));
		Double chemistry=Double.parseDouble(req.getParameter("chemistry")) ;
		Double math=Double.parseDouble(req.getParameter("maths")) ;
		
		
		Double percentage =  ((physics+chemistry+math)/300)*100;
		
		//now to forward the request to another servlet page or jsp page
		
		req.setAttribute("percentage", percentage);
		
		RequestDispatcher rd=req.getRequestDispatcher("view_student_result.jsp");
		
		//now we r forwarding
		 rd.forward(req, resp);
		
	}
}
