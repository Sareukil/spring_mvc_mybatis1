<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>index</title>
	</head>
	<body>
		<h3>Mybatis 사용</h3>
		<br>
		<a href="<c:url value='/product/productListAll'/>">listALL 이동</a>
		<a href="<c:url value='/product/productNewForm'/>">데이터 입력</a>
		<br>
		<img src="/mybatis/resources/images/apple.png"/><br>
		<img src="image/apple.png"><br>
		
		<a href="<c:url value='/loginForm'/>">로그인</a><br>
		<a href="<c:url value='/loginForm2'/>">로그인2</a><br>
		<a href="<c:url value='/product/productSearchForm1'/>">상품검색1</a><br>
		<a href="<c:url value='/product/productSearchForm2'/>">상품검색2</a><br>
		<a href="<c:url value='/product/productSearchForm3'/>">상품검색2</a><br>
	</body>
</html>