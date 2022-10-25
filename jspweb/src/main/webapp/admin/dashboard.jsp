<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<link href="/jspweb/css/dashboard.css" rel="stylesheet">
</head>
<body>
	<!-- 관리자 페이지 -->
	<!-- 만약에 세션이 없거나 관리자가 아니면 -->
	<% 
		String mid = (String)session.getAttribute("mid"); 
		if( mid == null || !mid.equals("admin")  ){ response.sendRedirect("../member/index.jsp"); }
	%>
	<!-- marquee : 텍스트 슬라이드(전광판) / 속성 : scrollamount : 슬라이드 속도 -->
	<marquee scrollamount="10"> 공지사항 표시되는 위치 </marquee>
	
	<!-- 사이드바 [ 펼치기/접기 ] -->
	<div class="sidebar">
		<h1> admin menu </h1>
		<ul class="side_menu">
			<li class="side_item"><a href="#">제품 등록</a></li>
			<li class="side_item"><a href="#">제품 목록</a></li>
			<li class="side_item"><a href="#">재고 관리</a></li>
			<li class="side_item"><a href="#">주문 관리</a></li>
			<li class="side_item"><a href="#">매출 관리</a></li>
			<li class="side_item"><a href="#">회원 목록</a></li>
			<li class="side_item"><a href="#">배송 관리</a></li>
 		</ul>
	</div>

	<script src="../js/admin/dashboard.js" type="text/javascript"></script>

</body>
</html>











