<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="attribute.PersonPojo" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% List<PersonPojo> list =(List<PersonPojo>)request.getAttribute("personList"); %>
<table style="width:300 px">
<% for(PersonPojo p:list) { %>
 <tr>
 
 	<td><%=p.getId() %></td>
 	<td><%=p.getName() %></td>
 	<td><%=p.getSurname() %></td>
 	<td><%=p.getAge() %></td>
 	<td><%=p.getPhoneNumber() %></td>
 	
  </tr>
    <%} %>
</table>



</body>
</html>