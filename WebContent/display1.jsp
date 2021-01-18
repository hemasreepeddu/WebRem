<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.ilp.tcs.bean.Account" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%Account a=(Account)request.getAttribute("Account"); %>
<body>
Amount rs<%=request.getAttribute("deposited")%> succesfully

<table>
<th>accountno</th>
<th>accountholder</th>
<th>balance</th>
<tr>
<td><%=a.getAccountno() %></td>
<td><%=a.getAccounttype()%></td>
<td><%=a.getBalance() %></td>
</tr>
</table>

</body>
</html>