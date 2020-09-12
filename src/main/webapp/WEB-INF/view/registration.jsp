<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<table border="1"  width="100%" align="center">
	<tr>
		<td height="80px">
			Header
		</td>
	</tr>
	<tr>
		<td height="480px" valign="top" style="background-color: gray;">
			<f:form action="register" modelAttribute="command">
					<table width="100%" align="center">
						<tr>
							<td align="center">
								<table>
									<tr>
										<td>
											<label>Seller/User</label>
										</td>
										<td>
											<select id="rolFlag" name="rolFlag">
												<option>--Select--</option>
												<option value="seller">Seller</option>
												<option value="user">User</option>
											</select>
										</td>
									</tr>
									<tr>
										<td>
											<label>Name</label>
										</td>
										<td>
											<input type="text" id="name" name="name">
										</td>
									</tr>
									<tr>	
										<td>
											<label>Email</label>
										</td>
										<td>
											<input type="text" id="email" name="email">
										</td>
									</tr>
									<tr>
										<td>
											<label>Phone</label>
										</td>
										<td>
											<input type="text" id="phone" name="phone">
										</td>
									</tr>
									<tr>
										<td>
											<label>USerName</label>
										</td>
										<td>
											<input type="text" id="uname" name="uname">
										</td>
									</tr>
									<tr>
										<td>
											<label>Password</label>
										</td>
										<td>
											<input type="text" id="password" name="password">
										</td>
									</tr>	
									<tr>
										<td>
											<label>Confirm Password</label>
										</td>
										<td>
											<input type="text" id="cpassword" name="cpassword">
										</td>
									</tr>
									<tr>
										<td>
											
										</td>
										<td>
											<input type="submit" value="Post">
											<input type="button" id="btClose" name= "btClose" value="Close" onclick="fnClose()">
										</td>
									</tr>
								</table>
							</td>
						</tr>
					</table>
					</f:form>
		</td>
	</tr>
	<tr>
		<td>
			Footer
		</td>
	</tr>
</table>
<script type="text/javascript">
	function fnClose() {
		location.href = "/Blank/login"
	}
</script>
</body>
</html>