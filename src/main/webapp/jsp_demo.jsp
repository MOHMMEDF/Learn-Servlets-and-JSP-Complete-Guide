<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- DECLARATION TAG -->
		<%!
		static String  static_var="This is a static variable";
		
		public static String staticMethod(){
			return "This is an satatic method";
		}
		
		static{
			System.out.println("THIS IS AN STATIC INITIALIZER");
		}
		
		
		
		//now non-satatic member declare
		
		
		String non_static_var="This is an Non-static variable";
		
		public String nonStaticMethod(){
			return "This is an Non-satatic method";
		}
		
		{
			System.out.println("THIS IS AN NON-STATIC INITIALIZER");
		}
		%>
		
		<hr>
		<hr>
	<!-- SCRIPPLET TAG  we can just declare local variable ,we can send multiple resp to client using out.println implicit obj-->
	
			<%
	
			String localVariable="This is an local variable from Scripplet";
	
				out.println(static_var+"<br>");
				out.println(staticMethod()+"<br>");
				out.println(non_static_var+"<br>");
				out.println((nonStaticMethod())+"<br>");
				out.println(localVariable);
	
				
			%>
		<hr>
		<hr>
		
	<!-- Expression tag we cannot declare anything in..it is used for just sending resp to client,as 1 expression tag 1 resp we can send -->
	
			
			
			
	<h1>    <%=  static_var  %>   </h1>
	<h1>    <%=  staticMethod()  %>   </h1>
	<h1>    <%=  non_static_var  %>   </h1>
	<h1>    <%=  nonStaticMethod()  %>   </h1>
	<h1>    <%=  localVariable  %>   </h1>
	
	

</body>
</html>