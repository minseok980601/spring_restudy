<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 수정</title>
<style type="text/css">
	.textarea-box {
		width: 605px;
		height: 300px;
		resize: none;
	}
</style>
</head>
<body>
<form action="${contextPath}/callingBoard?post_num=${list.post_num}" method="post">
	<table>
			<tr>
				<td>작성자 : ${list.id }</td>
			</tr>
			<tr>
				<td>제목 : </td>
				<td>
					<input type="text" id="post_title" name="post_title" value="${list.post_title }">
				</td>
			</tr>
			<tr>
				<td>내용 : </td>
				<td>
					<textarea class="textarea-box" id="post_content" name="post_content">${list.post_content }</textarea>
				</td>
			</tr>
	</table>
	<input type="submit" value="수정하기">
</form>
</body>
</html>