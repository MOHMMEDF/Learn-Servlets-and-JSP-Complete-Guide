package product_crud;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/save_product")
public class SaveProductServlet extends HttpServlet{

	ProductDao dao=new ProductDao();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("name");
		String type=req.getParameter("type");
		Double price=Double.parseDouble(req.getParameter("price"));
		
		Product p=new Product(name, price, type);
		
		RequestDispatcher rd=req.getRequestDispatcher("save_product.jsp");
				if(  dao.saveProduct(p) ) {
					req.setAttribute("message", "product saved successfully");
				}
				else {
					req.setAttribute("message", "failed to save product");
				}
		rd.forward(req, resp);
	}
}
