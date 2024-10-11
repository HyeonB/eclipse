<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>newUser.jsp</title>
<style type="text/css">
	table, tr, th, td {
		margin: 0 auto;
		border: 1px solid black;
		border-collapse: collapse;
		padding: 10px;
	}
	
	table {width: 600px;}
	th, td { text-align: center; }
</style>
</head>
<body>
	<jsp:include page="header.jsp" />
	<br />
	
	<div class="container">
		<table>
			<tr>
				<th colspan="4">새로운 계정 등록 정보</th>
			</tr>
			<tr>
				<th>ID</th>
				<th>NAME</th>
				<th>GENDER</th>
				<th>PHONE</th>
			</tr>
			<tr>
				<td>${user.id }</td>
				<td>${user.name }</td>
				<c:if test="${user.gender == 1 }">
					<td>남성</td>
				</c:if>
				<c:if test="${user.gender == 2 }">
					<td>여성</td>				
				</c:if>				
				<td>${user.phone }</td>
			</tr>
		</table>
	
	</div>

</body>
</html>















