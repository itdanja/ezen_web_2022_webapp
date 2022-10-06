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
	
			<h3> 비밀번호 찾기 </h3>
			아이디 : <input type="text" id="mid">
			이메일주소 : <input type="text" id="memail">
		
		<span id="findpasswordbox"></span>
		<button type="button" onclick="findpassword()">비밀번호찾기</button>
		
	</div>

	<script type="text/javascript" src="../js/member/findid.js"></script>
	
</body>
</html>