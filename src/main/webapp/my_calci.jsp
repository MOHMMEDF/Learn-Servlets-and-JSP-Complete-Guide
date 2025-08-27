<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="my_calci.jsp" method="post">
	
	
	Num1:<input type="text" name="n1"><br>
	Num2:<input type="text" name="n2"><br>
	
	Make your choice:<br>
	<input type="checkbox" name="operation" value="add">add<br>
		<input type="checkbox" name="operation" value="subtract">subtract<br>
		<input type="checkbox" name="operation" value="multiply">multiply<br>
		<input type="checkbox" name="operation" value="division">division<br>
		
		<input type="submit" value="calculate">
	
	
	</form>
	
	
			<% 
				//scripplet tag
				
				//we r fetching the data from implicit object that is 'request' provided by 
				
				String num1=request.getParameter("n1");
				String num2=request.getParameter("n2");
			
				String[] choices=request.getParameterValues("operation");
				
				Double n1=null;
				Double n2=null;
				
				if(num1 !=null && num2 !=null){
					n1=Double.parseDouble(num1);
					n2=Double.parseDouble(num2);
				}
				
				//now if choices not equal to null
				
				if(choices !=null){
					for(String c:choices){
						
						if(c.equalsIgnoreCase("add")){
							out.println("The Addition of " +n1 + "+" +n2 + "=" + (n1+n2) + "<br>");
						}
						
						if(c.equalsIgnoreCase("subtract")){
							out.println("The subtraction of " +n1 + "-" +n2 + "=" + (n1-n2) + "<br>");
						}
						
						if(c.equalsIgnoreCase("multiply")){
							out.println("The Multiplication of " +n1 + "*" +n2 + "=" + (n1*n2) + "<br>");
						}
						
						if(c.equalsIgnoreCase("division")){
							out.println("The Division of " +n1 + "/" +n2 + "=" + (n1/n2) + "<br>");
						}
						
					}
				}
	
				%>

</body>
</html>