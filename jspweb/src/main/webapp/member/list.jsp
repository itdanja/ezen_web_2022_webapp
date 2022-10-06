<%@page import="model.dao.MemberDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.dto.MemberDto"%>
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
		<table id="mtable" border="1">
			<tr>
				<th> 번호 </th>
				<th> 아이디 </th>
				<th> 회원명 </th>
				<th> 전화번호 </th>
				<th> 이메일 </th>
				<th> 주소 </th>
				<th> 가입일 </th>
				<th> 포인트 </th>
			</tr>
			
		</table>
	</div>
	
	<script type="text/javascript" src="../js/member/list.js"></script>

</body>
</html>