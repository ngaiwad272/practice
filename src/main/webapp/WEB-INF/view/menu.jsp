<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s" %>
<s:url var="url_logout" value="/logout"></s:url>
    <%
	Integer userId = (Integer)session.getAttribute("userId");
	Integer role = (Integer)session.getAttribute("role");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
	<style type="text/css">
		#menutab td{
			border-bottom: 5px solid black;
		}
	</style>
</head>
<body onload="fnCheckLoginStatus()">
	<table id="menutab" width="100%">
		<tr>
			<td>
			<% if(userId==null){
				response.sendRedirect("/login");
			} else if(userId!=null && role==1){%>
			<table>
				<tr>
					<td>
						<a href="adm_seller"><b>>>Pending Sellers</b></a></br>
					</td>
				</tr>
				<tr>
					<td>
						<a href="adm_sells"><b>>>Pending Sells</b></a></br>
					</td>
				</tr>
				<tr>
					<td>
						<a href=""><b>>>what you have</b></a></br>
					</td>
				</tr>
				<tr>
					<td>
						<a href="sell_form">NAUKRI</a>
					</td>
				</tr>
				<tr>
					<td>
						<a href="">VEHICAL</a>
					</td>
				</tr>
				<tr>
					<td>
						<a href="">FARMING</a>
					</td>
				</tr>
				<tr>
					<td>
						<a href="">SHOP</a>
					</td>
				</tr>
				<tr>
					<td>
						<a href="">OTHER</a>
					</td>
				</tr>
				<tr>
					<td>
						<a href="disp_seller"><b>>>What you want</b></a>
					</td>
				</tr>
				<tr>
					<td>
						<a href="disp_seller?act=n">NAUKRI</a>
					</td>
				</tr>
				<tr>
					<td>
						<a href="disp_seller?v">VEHICAL</a>
					</td>
				</tr>
				<tr>
					<td>
						<a href="disp_seller?f">FARMING</a>
					</td>
				</tr>
				<tr>
					<td>
						<a href="disp_seller?s">SHOP</a>
					</td>
				</tr>
				<tr>
					<td>
						<a href="disp_seller?o">OTHER</a>
					</td>
				</tr>
				<tr>
					<td>
						<a href="getmedicalhelp"><b>>>Medical Emergency</b></a>
					</td>
				</tr>
				<tr>
					<td>
						<a href=""><b>>>Heighway problem</b></a>
					</td>
				</tr>
				</table>
				<%}else if(userId!=null && role==2){ %>
					<table>
				<tr>
					<td>
						<a href=""><b>>>what you have</b></a></br>
					</td>
				</tr>
				<tr>
					<td>
						<a href="sell_form">NAUKRI</a>
					</td>
				</tr>
				<tr>
					<td>
						<a href="">VEHICAL</a>
					</td>
				</tr>
				<tr>
					<td>
						<a href="">FARMING</a>
					</td>
				</tr>
				<tr>
					<td>
						<a href="">SHOP</a>
					</td>
				</tr>
				<tr>
					<td>
						<a href="">OTHER</a>
					</td>
				</tr>
				</table>
				<%}else if(userId!=null && role==3){ %>
				<table>	
				<tr>
					<td>
						<a href="disp_seller"><b>>>What you want</b></a>
					</td>
				</tr>
				<tr>
					<td>
						<a href="disp_seller?act=n">NAUKRI</a>
					</td>
				</tr>
				<tr>
					<td>
						<a href="disp_seller?v">VEHICAL</a>
					</td>
				</tr>
				<tr>
					<td>
						<a href="disp_seller?f">FARMING</a>
					</td>
				</tr>
				<tr>
					<td>
						<a href="disp_seller?s">SHOP</a>
					</td>
				</tr>
				<tr>
					<td>
						<a href="disp_seller?o">OTHER</a>
					</td>
				</tr>
				<tr>
					<td>
						<a href=""><b>>>Medical Emergency</b></a>
					</td>
				</tr>
				<tr>
					<td>
						<a href=""><b>>>Heighway problem</b></a>
					</td>
				</tr>
				</table>
				<%} %>
			</td>
		</tr>
	</table>
</body>
<script type="text/javascript">
	function fnCheckLoginStatus() {
		if(<%=userId%>==null){
			location.href = "/login";
		}
		
	}
</script>
</html>