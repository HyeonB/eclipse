<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<style type="text/css">
	table, tr, td {
		margin: 0 auto;
		border: 1px solid black;
		border-collapse: collapse;
		padding: 10px;
	}
	
	table {
		width: 90%;
	}
	td {
		width: 20%;
		text-align: center;
	}
	td:hover {
		background-color: gray;
		cursor: pointer;
	}
	
	.message {
		font-size: 14px; color: red;
	}
	
	a {text-decoration: none;}

</style>
<div class="container">
		<table>
		<c:if test="${empty emp }">     <!-- 로그인 안된 경우 -->
		<tr>
			<td><a href="main.jsp"><span>홈</span></a></td>
			<td><a href="login.do"><span>로그인</span></a></td>
			<td><a href="boardList.do"><span>게시판</span></a></td>
			<td><a href="newuser.do"><span>계정등록</span></a></td>
			<td>
				<span>MyPage</span> <br />
				<span class="message">로그인 후 사용 가능</span>
			</td>
		</tr>		
		</c:if>
	
		<c:if test="${!empty emp }">
			<tr>
				<td><a href="main.jsp"><span>홈</span></a></td>
				<td>${emp.name } 님</td>
				<td><a href="logout.do"><span>로그아웃</span></a></td>
				
				<td><a href="boardList.do"><span>게시판</span></a></td>
				<td><a href="boardWrite.do"><span>글쓰기</span></a></td>
				
				<td><a href="mypage.do"><span>MyPage</span></a></td>
			</tr>		
		</c:if>
		
	</table>
	
</div>






