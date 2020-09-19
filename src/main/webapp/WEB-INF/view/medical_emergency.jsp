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
<title>Medical Emergency</title>
</head>
<body>
<table border="1"  width="100%" align="center" style="background-color: gray;">
	<tr>
		<td height="80px">
		
		</td>
	</tr>
	<tr>
		<td height="480px" valign="top">
			<table width="100%" align="center">
			<tr>
				<td>
				<f:form action="submithelp" method="POST">
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
											<label>Patient Name</label>
										</td>
										<td>
											<input type="text" id="pname" name="pname">
										</td>
									</tr>
									<tr>
										<td>
											<input type="hidden" id="userId" name="userId" value="<%=userId %>" />
											<label>Relative Name</label>
										</td>
										<td>
											<input type="text" id="rname" name="rname">
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
											<label>Requirement</label>
										</td>
										<td>
											<input type="text" id="requirement" name="requirement">
										</td>
									</tr>
									<tr>
										<td>
											<label>Describ Requirement</label>
										</td>
										<td>
											<textarea rows="5" cols="25" id="descreq" name="descreq"></textarea>
										</td>
									</tr>
									<tr>
										<td>
											<label>Address</label>
										</td>
										<td>
											<textarea rows="5" cols="25" id="address" name="address"></textarea>
										</td>
									</tr>	
									<tr>
										<td>
											<label>State</label>
										</td>
										<td>
											<input type="text" id="state" name="state">
										</td>
									</tr>
									<tr>
										<td>
											<label>District</label>
										</td>
										<td>
											<input type="test" id="district" name="district">
										</td>
									</tr>
									<tr>
										<td>
											<label>Taluka</label>
										</td>
										<td>
											<input type="test" id="taluka" name="taluka">
										</td>
									</tr>
									<tr>
										<td>
											<label>City/Village</label>
										</td>
										<td>
											<input type="test" id="city" name="city">
										</td>
									</tr>
									<tr>
										<td>
											<label>Pincode</label>
										</td>
										<td>
											<input type="test" id="pincode" name="pincode">
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