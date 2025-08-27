package product_crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductDao {

	Connection con;//so that we can use every where
	PreparedStatement ps;
	
			//taking non-static initializer 1st
				{
					//step 1
					try {
						Class.forName("org.postgresql.Driver");
						
						
						//step2
						String url="jdbc:postgresql://localhost:5432/servlet_crud";
						String user="postgres";
						String password="root";
						con=DriverManager.getConnection(url,user,password);
						
						System.out.println("CONNECTION DONE!>>>>>>>");
						
						
						
						
						
						
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				
				
				public boolean saveProduct(Product product) {
					String query="insert into product(name,price,type)values(?,?,?)";
					
					try {
						ps=con.prepareStatement(query);
						
						ps.setString(1, product.getName());
						ps.setDouble(2, product.getPrice());
						ps.setString(3, product.getType());
						
						if(  ps.executeUpdate() >0 ) {
							return true;
						}
						
						
						
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					return false;
			
				}
				
				
}
