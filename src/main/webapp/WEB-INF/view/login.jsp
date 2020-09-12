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
		<td>
			Header
		</td>
	</tr>
	<tr>
		<td>
			<c:if test="${err!=null}">
					<p class="error">${err}</p>
				</c:if>
				<c:if test="${param.act eq 'lo'}">
					<p class="success">Logout successfully! Thank You</p>
				</c:if>
				<c:if test="${param.act eq 'reg'}">
					<p class="success">User Register successfully! Please Login</p>
				</c:if>
				
				<%-- <s:url var="url_login" value="/hlogin" /> --%>
				<f:form action="hlogin" modelAttribute="command" method="post">
			<table align="center">
				<tr>
					<td>
						<label>Login</label>
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
						
					</td>
					<td>
						<input type="submit" id="login" name="login">
						<input type="button" id="reg" name="reg" value="Registration" onclick="fnNavRegister()">
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
</body>
<script type="text/javascript">
	function fnNavRegister() {
		location.href = "/Blank/reg_form";
	}
</script>
</html>