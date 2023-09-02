<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import ="java.util.*" %>
<%@ page import ="com.bean.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<b>

<%
	HashSet<Student> hs = new HashSet<Student>();
	hs = (HashSet)session.getAttribute("student6");
	Iterator its = hs.iterator();
	Student s = new Student();
	while(its.hasNext())
	{
		s= (Student)its.next();
	}
	
	%>
	<div>
	<%=s.getName() %>
	<%=s.getRNo() %>
	<%=s.getcourse() %>
	<%=s.getAddress() %>
	</div>



<hr>
</b>
</body>
</html>