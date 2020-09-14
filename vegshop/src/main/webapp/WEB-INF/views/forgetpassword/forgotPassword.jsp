<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:url var="resetlink" value="/resetPassword"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>ForgotPassword</title>
</head>
<body>
Enter your registered email address:
	<form action="<c:url value='/resetPassword'/>" method="post">
		<table>
			<tr>

				<td colspan="2"><input type="text" name="email"> </td>
			</tr>
			
			<tr>
				<td><input type="Submit" value="Reset Password">  </td>
				<td><input type="reset" value="Cancel">  </td>
			</tr>
			
		</table>
	</form>
</body>
</html>