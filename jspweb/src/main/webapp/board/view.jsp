<%@page import="model.dto.BoardDto"%>
<%@page import="model.dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@include file="../header.jsp" %>
	<%
		int bno = Integer.parseInt( request.getParameter("bno") );
		BoardDto dto = BoardDao.getInstance().getboard(bno);
	%>
	
	<div class="webbox">
		<h3> 글 조회 </h3>
		<table>
			<tr> <td> 번호 <td> <td> <%=dto.getBno() %> </td> </tr>
			<tr> <td> 제목 <td> <td> <%=dto.getBtitle() %> </td> </tr>
			<tr> <td> 내용 <td> <td> <%=dto.getBcontent() %> </td> </tr>
			<tr> <td> 작성자 <td> <td> <%=dto.getMno() %> </td> </tr>
		</table>
	</div>
	

</body>
</html>







