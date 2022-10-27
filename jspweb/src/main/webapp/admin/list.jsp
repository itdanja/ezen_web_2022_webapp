<%@page import="model.dto.ProductDto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.dao.ProductDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div class="container">
	
		<table class="table">
			<tr>
				<th style="width:5%"> 이미지 </th> 
				<th style="width:10%"> 제품번호 </th>
				<th style="width:10%"> 카테고리 </th>
				<th style="width:10%"> 제품명 </th>
				<th style="width:10%"> 가격 </th>
				<th style="width:10%"> 할인율 </th>
				<th style="width:10%"> 판매가<br>[*할인율적용] </th>
				<th style="width:10%"> 판매상태 </th>
				<th style="width:15%"> 등록날짜 </th>
				<th style="width:10%"> 비고 </th>
			</tr>
		</table>
	</div>
	
	<script src="/jspweb/js/admin/list.js" type="text/javascript"></script>

</body>
</html>




