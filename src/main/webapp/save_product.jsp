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
		String message=(String)request.getAttribute("message");
	if(  message !=null ){
		%>
		
		<h3>  <marks> <%= message %>  </marks> </h3>
	<% }%>
	
	

		<form action="save_product" method="post">
		
	Enter the product name:<input type="text" name="name"><br>
		
	Choose the product type:<input type="radio" name="type" value="electronics">electronics<br>
	Choose the product type:<input type="radio" name="type" value="sports">sports<br>
	Choose the product type:<input type="radio" name="type" value="clothing">clothing<br>
	
	Enter the price:<input type="text" name="price"><br>
	
	<input type="submit" value="save">
	
		
		
		</form>
</body>
</html>