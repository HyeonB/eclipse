<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>userJoin.jsp</title>
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
		<form action="boardWrite.do" method="post">
			<table>
				<tr>
					<th colspan="2">글쓰기</th>
				</tr>
				<tr>
					<th>제목</th>
					<td><input type="text" name="title" id="" /></td>
				</tr>
				<tr>
					<th>내용</th>
					<td><input type="text" name="detail" id="" /></td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="등록" />
						<input type="reset" value="취소" />					
					</td>
				</tr>		
				
			</table>
		
		</form>
	
	
	</div>

</body>
</html>






