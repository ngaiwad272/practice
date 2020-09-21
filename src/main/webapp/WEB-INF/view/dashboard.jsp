<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
    
<%@taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dashboard</title>
</head>
<body onload="abc()">
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
					<td width="20%" style="background-color: orange;">
						<jsp:include page="menu.jsp"></jsp:include>
					</td>
					<td width="60%" style="background-color: yellow;">
						Main
					</td>
					<td width="20%">
						<table>
							<tr>
								<td style="background-color:gray;" valign="top">
									<table>
										<tr>
											<th>HelpId</th>
											<th>Requirment</th>
											<th>City</th>
										</tr>
										<c:forEach var="n" items="${notifications}">
											<tr>
												<td>${n.helpId}</td>
												<td>${n.requirement}</td>
												<td>${n.city}</td>
											</tr>
										</c:forEach>
									</table>
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
<script type="text/javascript">
function abc(){
	debugger;
}
</script>
</html>