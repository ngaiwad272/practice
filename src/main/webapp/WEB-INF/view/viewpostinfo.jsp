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
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
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
					<table width="100%" align="center">
						<tr>
							<td width="20%" style="background-color: orange;">
								<jsp:include page="menu.jsp"></jsp:include>
							</td>
							<td width="60%" style="background-color: yellow;">
								<table>
									<tr>
										<td>
											<input type="hidden" id="sellerId" name="sellerId" value=<%= request.getParameter("sellerId") %> />
											<label>User Id</label>
										</td>
										<td>
										<img alt="img" id="image"/>
											<input type="text" id="sname" name="sname" value=${sellerView.userId} >
										</td>
									</tr>
									<tr>	
										<td>
											<label>Phone</label>
										</td>
										<td>
											<input type="text" id="phone" name="phone" value=${sellerView.phone} >
										</td>
									</tr>
									<tr>
										<td>
											<label>Sell Type</label>
										</td>
										<td>
											<input type="text" id="sellType" name="sellType" value=${sellerView.sellType}>
										</td>
									</tr>
									<tr>
										<td>
											<label>Sell Sub Type</label>
										</td>
										<td>
											<input type="text" id="sellSubType" name="sellSubType" value=${sellerView.sellSubType}>
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

$(document).ready(function(){debugger;

	$.ajax({
			url : 'sellInfo/' + $("#sellerId").val(),
			success : function(data) {
				// populate other vars val
				$("#image").attr('src','data:image/png;base64,'+data.imageBytes);
			}
		});

		$("#approved").click(function() {
			$.ajax({
				url : 'getpost?sellerId=' + $("#sellerId").val(),
				// data : {userId:$("#userId").val()},
				success : function(data) {
					alert("hi");
					window.location.href = "/adm_sells";
				}
			});
		});
	});
</script>
</body>
</html>