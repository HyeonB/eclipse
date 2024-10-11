<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login.jsp</title>
<style type="text/css">
	table, tr, th, td {
		margin: 0 auto;
		border: 1px solid black;
		border-collapse: collapse;
		padding: 10px;
	}
		
	table {width: 600px;}
	th, td { text-align: center; }
	.msg {
		text-align: center;
		font-weight: bold;
		color: red;
	}
</style>
</head>
<body>
	<jsp:include page="header.jsp" />
	<br />
	
	<div class="container">
		<form action="login.do" method="post">
			<div class="wrapper">
				<table>
					<tr>
						<th colspan="2">로그인</th>
					</tr>
					<tr>
						<th>아이디</th>
						<td><input type="text" name="id" id="" /></td>
					</tr>
					<tr>
						<th>비밀번호</th>
						<td><input type="text" name="pass" id="" /></td>
					</tr>

					<tr>
						<td colspan="2">
							<input type="submit" value="로그인" />
							<input type="reset" value="취소" />							
						</td>
					</tr>
				</table>			
			</div>		
		</form>	
		<div class="msg">${msg }</div>
	</div>

</body>
</html>









