<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<!-- 헤더 페이지 호출  -->
	<%@include file = "../header.jsp" %>
	<!-- 세션을 이용한 페이지 제어  -->
	<%
		// header.jsp 파일의 변수 호출 
		if( loginid == null ){  
			response.sendRedirect("login.jsp"); 
		}
	%>
	<!-- 본문 -->
	<div class="webbox">
		<h3> 회원 정보 </h3>
		<table>
			<tr>
				<td>아이디</td> <td id="mid"> </td>
			</tr>
		</table>
	</div>

	<!-- JS -->
	<script type="text/javascript" src="../js/member/info.js"></script>

</body>
</html>