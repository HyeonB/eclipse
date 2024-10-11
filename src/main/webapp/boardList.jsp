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
				<th>게시글 번호</th>
				<th>제목</th>
				<th>글쓴이</th>
				<th>작성시간</th>
			</tr>
			
			<c:forEach var="dto" items="${list }">
			<tr>
				<td>${dto.no }</td>
				<td><a href="boardDetail.do">${dto.title }<span></span></a></td>
				<td>${dto.id }</td>
				<td>${dto.enter }</td>
			</tr>
			</c:forEach>			
		</table>	
	</div>

</body>
</html>















