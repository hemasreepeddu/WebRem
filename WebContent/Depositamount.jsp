<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="AccountControllerServlet" method="post">
<h4>Deposit amount</h4>
Enter account no<input type="text" name="accountno">
Deposit amount<input type="text" name="deposit">
<input type="submit" name="submit" value="submit">
<input type="hidden" name="action" value="deposit">
</form>
</body>
</html>