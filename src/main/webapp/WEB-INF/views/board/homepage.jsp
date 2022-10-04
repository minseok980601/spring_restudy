<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 성공</title>
</head>
<body>
	<table>
		<tr>
			<td>아이디 : ${loginMember.id }</td>
			<td>이름 : ${loginMember.name }</td>
			<c:if test="${loginMember.id != null}">
				<td>
					<input type="button" value="마이페이지" onclick="location.href='${contextPath}/mypage?id=${loginMember.id }'">
				</td>
			</c:if>
		</tr>
	</table>
	<a href="${contextPath }/writing?id=${loginMember.id}">글 쓰기</a>
	<table>
		<tr>
			<td>번호</td>
			<td>아이디</td>
			<td>제목</td>
			<td>작성일</td>
			<td>조회수</td>
		</tr>
		<c:forEach var="row" items="${list }" >
			<tr>
				<td>${row.post_num }</td>
				<td>${row.id }</td>
				<td><a href="${contextPath }/readBoard?post_num=${row.post_num}">${row.post_title }</a></td>
				<td>${row.post_date }</td>
				<td>${row.visitcount }</td>
			</tr>
		</c:forEach>
	</table>
	<div>
		<c:if test="${paging.startPage != 1 }">
			<a href="${contextPath}/homepage?nowPage=${paging.startPage - 1 }&cntPerPage=${paging.cntPerPage}">&lt;</a>
		</c:if>
		<c:forEach begin="${paging.startPage }" end="${paging.endPage }" var="p">
			<c:choose>
				<c:when test="${p == paging.nowPage }">
					<b>${p }</b>
				</c:when>
				<c:when test="${p != paging.nowPage }">
					<a href="${contextPath}/homepage?nowPage=${p }&cntPerPage=${paging.cntPerPage}">${p }</a>
				</c:when>
			</c:choose>
		</c:forEach>
		<c:if test="${paging.endPage != paging.lastPage}">
			<a href="${contextPath}/homepage?nowPage=${paging.endPage+1 }&cntPerPage=${paging.cntPerPage}">&gt;</a>
		</c:if>
	</div>
</body>
</html>