<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Insert title here</title>
	</head>
	<body>
		<form action="/springmvc/user/login" method="post">
			<table>
				<tr>
					<td align="center"><label for="userName">userName:</label></td>
					<td align="center"><input type="text" id="userName" name="userName" /></td>
				</tr>
				<tr>
					<td align="center"><label for="password">password:</label></td>
					<td align="center"><input type="password" id="password" name="password" /></td>
				</tr>
				<tr>
					<td align="center"><input type="reset" value="reset" /></td>
					<td align="center"><input type="submit" value="login" /></td>
				</tr>
			</table>
		</form>
	</body>
</html>