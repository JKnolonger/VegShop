<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
    <%@ include file="/common/taglib.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Home Page</title>
</head>
<body>
Enter New Password for ${emailid}
	<form action="<c:url value='/savePass'/>" method="post">
		<table>
			<tr>
				<td>Password</td>
				<td><input type="password" name="pass" id="txtPass"> </td>
			</tr>
			<tr>
				<td>Retype-Password</td>
				<td><input type="password" id="txtPass"> </td>
			</tr>
			<tr>
			
				<td colspan="2"><center><input type="submit" value="Save"> </center> </td>
			
			</tr>
			
		</table>
	</form>
</body>
</html>