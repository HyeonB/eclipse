<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>board.jsp</title>
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
				<th>글번호</th>
				<td>${dto.no }</td>
			</tr>
			<tr>
				<th>제목</th>
				<td>${dto.id }</td>
			</tr>

			<tr>
				<th>작성자</th>
				<td>${dto.id }</td>
			</tr>	
			<tr>
				<th>작성일자</th>
				<td>${dto.enter }</td>
			</tr>	
			<tr>
				<th>내용</th>
				<td>${dto.id }</td>
			</tr>
		</table>	
	</div>

</body>
</html>















