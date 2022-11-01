<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>

	<%@include file = "../header.jsp" %>
	<% // 자바를 작성할수 있는 태그[서블릿] 
		// 1. 경로에 있는 pno request 요청
		// int pno = Integer.parseInt( request.getParameter("pno") );
	%>
	
	<div class="container">	<!-- b : container -->
	
		<div class="row">	<!-- b : row  -->
			<!-- 대표 이미지 -->
			<div class="col-md-6">  <!-- b : col-md-6  -->
				<img alt="" src="/jspweb/img/p3.gif">
			</div>
			
			<!-- 상품 정보 -->
			<div class="col-md-6">  <!-- b : col-md-6  -->
				<div class="infobox">
					
					<!-- 제품명 -->
					<h4>미라클 라이트 경량 퀄팅 점퍼</h4>
					
					<!-- 제품설명 -->
					<div>솔직히 말씀드려 디자인대비 소매랑 넥라인 끝부분 마감 디테일이 아쉬운 상품입니다. </div>
					
					<!-- 가격 -->
					<div class="pricebox">	<!-- 할인율이 있을경우 -->
						<span> 30% </span>	<!-- 할인율 -->
						<span> 20,000원 </span>	<!-- 원가 -->
						<span> 16,000원 </span>	<!-- 할인이 적용된 가격 -->
					</div>
					<div class="pricebox">	<!-- 할인율이 없을경우 -->
						<span> 30,000원 </span>	<!-- 원가 -->
					</div>
					
					<!-- 사이즈 종류 -->
					<div class="sizebox">
						<span> [ FREE , XL , L , M , S ] </span>
					</div>
					
					<!-- 제품 옵션 -->
					<table class="table">	<!--  b: table -->
						<tr> <td>배송구분</td> <td>2,500원 ( 70,000원 이상 구매시 무료) </td> </tr>
						<tr> <td>카드혜택</td> <td> 무이자할부 </td> </tr>
						<tr> <td>적립혜택</td> <td> 3000(1%) </td> </tr>
						
						<!-- 색상 선택 행 -->
						<tr> <td>색상</td> 	
							<td>
								<select>
									<option>-[필수] 색상 선택</option>
									<option> 블랙 </option>
									<option> 화이트 </option>
									<option> 카키 </option>
								</select>
							 </td> 
						</tr>
						
						<!-- 사이즈 선택 행 -->
						<tr> <td>사이즈</td> 	
							<td>
								<select>
									<option>-[필수] 사이즈 선택</option>
									<option> FREE </option>
									<option> XL </option>
									<option> L </option>
								</select>
							 </td> 
						</tr>
						
					</table>
				</div>
			</div>
		</div>
		
	</div>
	
</body>
</html>




















