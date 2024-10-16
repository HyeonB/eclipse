<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>mypage.jsp</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<br />
	<div class="container">
		<form action="mypage.do" method="post">
			<table>
				<tr>
					<th colspan="2">My Page</th>
				</tr>
				<tr>
					<td>아이디</td>
					<td>${emp.id }</td>
				</tr>
				<tr>
					<td>비밀번호</td>
					<td>
						<input type="text" name="pass" id="" />
					</td>
				</tr>
				<tr>
					<td>이름</td>
					<td>${emp.name }</td>
				</tr>
				<tr>
					<td>성별</td>
					<c:choose>
						<c:when test="${emp.gender == 2}">
							<td>여성</td>
						</c:when>
						<c:otherwise>
							<td>남성</td>
						</c:otherwise>					
					</c:choose>
				</tr>
				<tr>
					<td>전화번호</td>
					<td>
						<input type="text" name="phone" id="" value="${emp.phone }" />
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="수정" />
						<input type="reset" value="reset" />
					</td>
				</tr>	
			</table>
		</form>	
	</div>

</body>
</html>












