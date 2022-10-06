<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>

	<%@include file ="../header.jsp" %>
	
	<div class="webbox">
		<h3> 로그인 페이지 </h3>
		<form action="/jspweb/member/login" method="post">
			아이디 : <input type="text" name="mid">			<br>
			비밀번호 : <input type="text" name="mpassword">	<br>
			<input type="submit" value="로그인"> 			
		</form>
		
		<div>
			 <a href="/jspweb/member/findid.jsp">아이디찾기</a> 
			 <a href="/jspweb/member/findpassword.jsp">비밀번호찾기</a>
			 <a href="/jspweb/member/signup.jsp">회원가입</a> 
		</div>
		
	</div>
</body>
</html>