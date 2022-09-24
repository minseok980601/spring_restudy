<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 보기</title>
</head>
<body>
	<table>
		<c:forEach var="read" items="${list}" begin="0" end="1">
			<tr>
				<td>작성자 : ${read.id }</td>
			</tr>
			<tr>
				<td>제목 : </td>
				<td>
					${read.post_title }
				</td>
			</tr>
			<tr>
				<td>내용 : </td>
				<td>
					${read.post_content }
				</td>
			</tr>
			<tr>
				<td>로그인 아이디: ${loginMember.id }</td>
			</tr>
			<c:if test="${loginMember.id == read.id}">
				<tr>
					<td>
						<button type="button" onclick="location.href='${contextPath}/callingBoard?post_num=${read.post_num}'">수정하기</button>
					</td>
				</tr>
			</c:if>
		</c:forEach>
	</table>

</body>
</html>