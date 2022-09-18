<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기</title>
<style type="text/css">
	.textarea-box {
		width: 605px;
		height: 300px;
		resize: none;
	}
</style>
</head>
<body>
<form action="${contextPath }/writing?id=${loginMember.id}" method="post">
	<table>
		<tr>
			<td>작성자 : ${loginMember.id }</td>
		</tr>
		<tr>
			<td>제목 : </td>
			<td>
				<input type="text" id="post_title" name="post_title" placeholder="제목을 입력해주세요">
			</td>
		</tr>
		<tr>
			<td>내용 : </td>
			<td>
				<textarea class="textarea-box" id="post_content" name="post_content" placeholder="내용을 입력해주세요"></textarea>
			</td>
		</tr>
		<tr>
			<td>
				<input type="submit" value="작성">
			</td>
		</tr>
	</table>
</form>
</body>
</html>