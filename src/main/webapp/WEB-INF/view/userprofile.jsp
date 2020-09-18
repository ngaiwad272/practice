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
		<td height="480px" valign="top" style="background-color: gray; color: white;">
			<f:form action="submit_profile" modelAttribute="command">
					<table width="100%" align="center">
						<tr>
							<td align="left" width="50%">
								<table>
									<tr>
										<td>
										<td>
										<div style="width: 60px; height: 60px; border: 2px solid white;">
											<img alt="img" id="image" />
										</div>	
										</td>
									</tr>
									<tr>
										<td>
										<input type="hidden" id="userId" name="userId" value=${user.userId}>
											<label>Seller/User</label>
										</td>
										<td>
											<select id="rolFlag" name="rolFlag" value=${user.rolFlag}>
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
											<input type="text" id="name" name="name" value=${user.name}>
										</td>
									</tr>
									<tr>	
										<td>
											<label>Email</label>
										</td>
										<td>
											<input type="text" id="email" name="email" value=${user.email}>
										</td>
									</tr>
									<tr>
										<td>
											<label>Phone</label>
										</td>
										<td>
											<input type="text" id="phone" name="phone" value=${user.phone}>
										</td>
									</tr>
									<tr>
										<td>
											<label>User Name</label>
										</td>
										<td>
											<input type="text" id="uname" name="uname" value=${user.uname} >
										</td>
									</tr>
									<tr>
										<td>
											<label>Aadhar No</label>
										</td>
										<td>
											<input type="text" id="aadhar" name="aadhar" value=${user.aadhar} >
										</td>
									</tr>
									 
								</table>
							</td>
							<td align="left" width="50%">
								<table>
									<tr>
										<td>
											<label>Address</label>
										</td>
										<td>
											<textarea id="address" name="address" rows="4" cols="25" >
												${user.address}
											</textarea>
										</td>
									</tr>
									 <tr>
										<td>
											<label>Country</label>
										</td>
										<td>
										<input type="text" id="country" name="country" value=${user.country} >
										</td>
									</tr>
									 <tr>
										<td>
											<label>State</label>
										</td>
										<td>
											<input type="text" id="state" name="state" value=${user.state} >
										</td>
									</tr>
									 <tr>
										<td>
											<label>District</label>
										</td>
										<td>
											<input type="text" id="district" name="district" value=${user.district} >
										</td>
									</tr>
									 <tr>
										<td>
											<label>Taluka</label>
										</td>
										<td>
										<input type="text" id="taluka" name="taluka" value=${user.taluka} >
										</td>
									</tr>
									 <tr>
										<td>
											<label>Village/City</label>
										</td>
										<td>
											<input type="text" id="city" name="city" value=${user.city} >
										</td>
									</tr>
									 <tr>
										<td>
											<label>Pin Code</label>
										</td>
										<td>
											<input type="text" id="pincode" name="pincode" value=${user.pincode} >
										</td>
									</tr>
								</table>
							</td>
						</tr>
						<tr></tr>
						<tr></tr>
						<tr></tr>
						<tr align="center">
							<td align="center">
								<input type="submit" value="Update">
								<input type="button" id="btClose" name= "btClose" value="Close" onclick="fnClose()">
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
		location.href = "/login"
	}
</script>
</body>
</html>