<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>productForm</title>
		
		<script src="<c:url value='/js/jquery-3.6.1.min.js'/>"></script>
		<script src="<c:url value='/js/prdNoCheck.js'/>"></script>
	</head>
	<body>
		<h3>상품 정보 등록</h3>
		<form method="post" action="/mybatis/product/insertProduct">
		<table>
			<tr><td>상품번호 <input type="text"id="prdNo"name="prdNo"></td><td><button id="NoCheck">중복확인</button></td></tr>
			<tr><td>상품명 <input type="text"name="prdName"></td></tr>
			<tr><td>가격 <input type="text"name="prdPrice"></td></tr>
			<tr><td>제조회사 <input type="text"name="prdCompany"></td></tr>
			<tr><td>재고 <input type="text"name="prdStock"></td></tr>
			<tr><td>제조일 <input type="text"name="prdDate"></td></tr>
			<tr><td colspan="2"><input type="submit" value="등록"> 
 				<input type="reset" value="취소"></td>
 			</tr>	
			<br>	
			 <a href="<c:url value='/'/>">메인 화면으로 이동</a>
		</table>
		</form>
	</body>
</html>
