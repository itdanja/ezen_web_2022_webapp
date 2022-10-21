<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<!-- 사용자 정의 css -->
	<link href="/jspweb/css/chatting.css" rel="stylesheet">
	
</head>
<body>

	<%@include file="../header.jsp" %>
	<input type="hidden" class="mid" value="<%=loginid%>"> <!-- 채팅에 접속한 회원아이디 보관 -->
	<div class="container"> <!-- 부트스트랩 css는 미리 만들어진 class 사용 -->
		<div class="col-sm-6 offset-3"> <!--  채팅 구역  -->
			<div class="row"> 
				<div class="col-sm-4">	<!-- 접속회원목록 -->
				
				</div>
				<div class="col-sm-8">  <!--  채팅창 -->
					<div class="contentbox my-3">
						<div class="secontent my-3"> <!-- 보낼때 메시지  -->
							<span class="date"> 오전 10:07 </span>
							<span class="content"> 안녕하세요 </span>
						</div>
						<div class="alarm"> <!-- 알람 메시지 -->
							<span> 유재석 님이 입장 하셨습니다. </span>
						</div>
						<div class="row g-0 my-3">	<!-- 받을때 메시지 -->
							<div class="col-sm-1 mx-2">  <!-- 프로필 -->
								<img width="100%;" class="rounded-circle" alt="" src="/jspweb/img/프로필.jpg">
							</div>
							<div class="col-sm-9">  <!-- 내용 -->
								<div class="recontent"> 
									<div class="name">강호동</div>
									<span class="content">그래 안녕</span>
									<span class="date"> 오전 10:08</span>
								</div>
							</div>
						</div>
					</div> <!--  채팅창  -->
					<textarea rows="" cols="" class="msgbox" onkeyup="enterkey()"></textarea>
					<button type="button" onclick="send()">보내기</button>
				</div>
			</div>
		</div> <!-- 채팅 구역 end  -->
	</div> <!--  컨테이너 end  -->
	<script src="../js/board/chatting.js" type="text/javascript"></script>	
		

</body>
</html>