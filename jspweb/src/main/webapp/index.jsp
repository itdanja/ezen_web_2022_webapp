<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

	<link href="/jspweb/css/main.css" rel="stylesheet">

</head>
<body>

	<%@ include file="header.jsp" %>
	
	<!-- 대문 [ 이미지 슬라이드 - 캐러셀 ] -->
	<div id="maincarousel" class="carousel slide carousel-fade" data-bs-ride="carousel" data-bs-interval="1000" >
												<!-- carousel-fade : 덮여씌우기	/ data-bs-interval = "밀리초"	  -->
	  <div class="carousel-inner">	<!-- 이미지 삽입되는 구역 -->
	    <div class="carousel-item active">	<!-- 이미지	 active : 현재 보이는 이미지 -->
	      <img src="/jspweb/img/mainimg1.jpg" class="d-block w-100" alt="...">
	    </div>
	    <div class="carousel-item ">
	      <img src="/jspweb/img/mainimg2.jpg" class="d-block w-100" alt="...">
	    </div>
	    <div class="carousel-item ">
	      <img src="/jspweb/img/mainimg3.jpg" class="d-block w-100" alt="...">
	    </div>
	    <div class="carousel-item ">
	      <img src="/jspweb/img/mainimg3.jpg" class="d-block w-100" alt="...">
	    </div>
	  </div>
	  <!-- 왼쪽버튼 -->
	  <button class="carousel-control-prev" type="button" data-bs-target="#maincarousel" data-bs-slide="prev">
	    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
	    <span class="visually-hidden">Previous</span>
	  </button>
	  <!-- 오른쪽버튼 -->
	  <button class="carousel-control-next" type="button" data-bs-target="#maincarousel" data-bs-slide="next">
	    <span class="carousel-control-next-icon" aria-hidden="true"></span>
	    <span class="visually-hidden">Next</span>
	  </button>
	  
	</div>
	
	<!-- 광고/이벤트 -->
	
	
	<!-- 제품 출력 -->
	<div class="container"> <!-- 전체 박스권 -->
		
		<div>	<!-- 일정 구역 -->
		
		
			<div>	<!-- 1개의 제품[아이템] -->
				<a href="#">  	<!-- 대표 이미지 -->
					<img src="/jspweb/img/p1.gif">
				</a>
				<div> <!-- 제품 정보 -->
					<div>트렌디한 크롭 기장의 덤블안감 카라넥 스웨이드 무스탕</div>	<!-- 제품명 -->
					
					<div> [FREE] </div>
					
					<div> 200,000 원 </div> <!-- 원가 -->
					<div> <!-- 할인된 가격 , 할인율 -->
						<span> 20,000원 </span>
						<span> 90% </span>
					</div>	
					<div>리뷰수 412</div> <!-- 리뷰  -->
				</div>
				<div>	<!-- 배지 구역 -->
					<span> 주문폭주 </span>
					<span> 1+1 </span>
				</div>
			</div>
			
			
		</div>
		
	</div>
	
	
	

</body>
</html>


























