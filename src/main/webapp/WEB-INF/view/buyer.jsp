<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	String uname = (String)session.getAttribute("username");
	Integer userId = (Integer)session.getAttribute("userId");
%>   
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
			Header### HI:<%=uname %>
		</td>
	</tr>
	<tr>
		<td>
			<table width="100%" align="center">
			<tr>
				<td>
				<f:form action="submit_buy" modelAttribute="command">
					<table width="100%" align="center">
						<tr>
							<td width="20%" style="background-color: orange;">
								<jsp:include page="menu.jsp"></jsp:include>
							</td>
							<td width="60%" style="background-color: yellow;">
								<table>
									<tr>
										<td>
											<input type="hidden" id="userId" name="userId" value="<%=userId %>" />
											<label>Name</label>
										</td>
										<td>
											<input type="text" id="sname" name="sname" value=${buyerName}>
										</td>
									</tr>
									<tr>	
										<td>
											<label>Phone</label>
										</td>
										<td>
											<input type="text" id="phone" name="phone" value=${phone} }>
										</td>
									</tr>
									<tr>
										<td>
											<label>Buy Type</label>
										</td>
										<td>
											<input type="text" id="buyType" name="buyType">
										</td>
									</tr>
									<tr>
										<td>
											<label>Buy Sub Type</label>
										</td>
										<td>
											<input type="text" id="buySubType" name="buySubType">
										</td>
									</tr>
									<tr>
										<td>
											<label>Address</label>
										</td>
										<td>
											<input type="text" id="address" name="address">
										</td>
									</tr>	
									<tr>
										<td>
											<label>Till Date</label>
										</td>
										<td>
											<input type="text" id="tillDate" name="tillDate">
										</td>
									</tr>
									<tr>
										<td>
											
										</td>
										<td>
											<input type="submit" value="Post">
											<input type="button" value="Cancel">
										</td>
									</tr>
								</table>
							</td>
						</tr>
					</table>
					</f:form>
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
<script type="text/javascript">
	
</script>
</body>
</html>