<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<table border="1"  width="100%" align="center" style="background-color: gray;">
	<tr>
		<td height="80px" width="100%">
			<jsp:include page="header.jsp"></jsp:include>
		</td>
	</tr>
	<tr>
		<td height="480px" valign="top">
			<table width="100%" align="center">
			<tr>
				<td>
					<table width="100%" align="center">
						<tr>
							<td width="20%" style="background-color: orange;">
								<jsp:include page="menu.jsp"></jsp:include>
							</td>
							<td width="60%" style="background-color: yellow;">
								Main
							</td>
							<td width="20%">
								Notification
							</td>
						</tr>
					</table>
				</td>
			</tr>		
			</table>
		</td>
	</tr>
	<tr>
		<td>
			Footer
		</td>
	</tr>
</table>
</body>
</html>