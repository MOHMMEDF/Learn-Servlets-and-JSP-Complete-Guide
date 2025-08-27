<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

		<%
		
		//we r fetching from implict object that is ' request '
		
		String name=request.getParameter("name");
		
		//now fetching the entire servlet which we r setted to ' percentage ' as key
		
		
		Double percentage=(Double)request.getAttribute("percentage");
		
		out.println("<h1> Student Name: " + name +  "</h1>" + "<br>");
		out.println("<h1> Student Percentage: " + percentage +  "</h1>" + "<br>");

		
		if(percentage>35){
			
		
		
		%>
			<h1 style="color: green; font-size: 20px f; font-style: italic;">Result :passed</h1>
			
			
			<%
					
		}					
			else{
				
				%>
			
			
						<h1 style="color: red; font-size: 20px f; font-style: italic;">Result :failed</h1>
			<% 			
			}	
				%>		
						
			
						
</body>
</html>