<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${contextPath }/join" method="post">
		<input type="text" id="id" name="id" placeholder="아이디를 입력하세요">
		<input type="text" id="pwd" name="pwd" placeholder="비밀번호를 입력하세요">
		<input type="text" id="name" name="name" placeholder="이름을 입력하세요">
		<input type="email" id="email" name="email" placeholder="이메일을 입력하세요">
		<input type="submit" value="회원가입"> 
	</form> 
</body>
</html>