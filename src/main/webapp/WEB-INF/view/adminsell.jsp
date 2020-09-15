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
<title></title>
<style>

#listView {
  border-collapse: separate;
  border-spacing: 0px 7px;
  width:100%;
  height:100%;
}
#listView td{
	
	border-bottom: 3px solid black;
	background-color: #d1c4a3;
	color: #615944;
	height: 35px;
	text-align: center;
}
#listView th{
	border-bottom: 1px solid black;
	background-color: #f2da79;
	color: black;
	height: 35px;
}
#root{
	width: 100%;
	align="center";
	background-color: #ebb9e1;
}
</style>
</head>
<body>
<table id = "root" border="1">
	<tr>
		<td height="80px">
			Header### HI:<%=uname %>
		</td>
	</tr>
	<tr>
		<td height="480px" valign="top">
				<f:form action="" modelAttribute="command" method="POST">
					<table width="100%">
						<tr>
							<td width="20%" style="background-color: orange;" valign="top" height="480px">
								<jsp:include page="menu.jsp"></jsp:include>
							</td>
							<td width="60%" style="background-color:gray;" valign="top">
								<table id="listView">
									<tr>
										<th>Sell Type</th>
										<th>Sell Sub Type</th>
										<th>City</th>
										<th>Till Date</th>
										<th></th>
									</tr>
									<c:forEach var="u" items="${sellsList}" varStatus="st">
									<tr>
									<s:url var="view_post" value="view_sell">
										<s:param name="sellerId" value="${u.sellerId}"></s:param>
									</s:url>
										<td><a href="${view_post}">${u.sellType}</a></td>
										<td>${u.sellSubType}</td>
										<td>${u.address}</td>
										<td>${u.tillDate}</td>
									</tr>
									</c:forEach>
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
</script>
</body>
</html>