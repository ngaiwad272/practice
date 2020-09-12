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
</head>
<body>
<table border="1"  width="100%" align="center" style="background-color: gray;">
	<tr>
		<td height="80px">
			Header### HI:<%=uname %>
		</td>
	</tr>
	<tr>
		<td height="480px" valign="top">
			<table width="100%" align="center">
			<tr>
				<td>
				<f:form action="" method="" enctype="">
					<table width="100%" align="center">
						<tr>
							<td width="20%" style="background-color: orange;">
								<jsp:include page="menu.jsp"></jsp:include>
							</td>
							<td width="60%" style="background-color: yellow;">
								<table>
									<tr>
										<td>
											<input type="hidden" id="userId" name="userId" value=${seller.userId} />
											<label>Name</label>
										</td>
										<td>
											<input type="text" id="sname" name="sname" value=${seller.sellerName} >
										</td>
									</tr>
									<tr>	
										<td>
											<label>Phone</label>
										</td>
										<td>
											<input type="text" id="phone" name="phone" value=${seller.phone} >
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
											<label>City</label>
										</td>
										<td>
											<input type="text" id="city" name="city">
										</td>
									</tr>	
									
									<tr>
										<td>
											
										</td>
										<td>
											<input type="button" value="Approved" id="approved" name="approved" />
											<input type="button" value="Reject ">
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
$(document).ready(function(){
	$("#approved").click(function(){
		$.ajax({
			url : 'set_active_seller',
			data : {userId:$("#userId").val()},
			/* success : function(data){
				$("#id_res_div").html(data); */
			}
		});
	});
});
	
</script>
</body>
</html>