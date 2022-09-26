<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 보기</title>
<script type="text/javascript">
	function delete(post_num) {
		alert("글 삭제가 완료되었습니다.");
		location.href='${contextPath}/deleteBoard?post_num='+post_num;

	}
</script>
</head>
<body>
	<table>
			<tr>
				<td>작성자 : ${list.id }</td>
			</tr>
			<tr>
				<td>제목 : </td>
				<td>
					${list.post_title }
				</td>
			</tr>
			<tr>
				<td>내용 : </td>
				<td>
					${list.post_content }
				</td>
			</tr>
			<tr>
				<td>로그인 아이디: ${loginMember.id }</td>
			</tr>
			<c:if test="${loginMember.id == list.id}">
				<tr>
					<td>
						<button type="button" onclick="location.href='${contextPath}/callingBoard?post_num=${list.post_num}'">수정하기</button>
						<input type="button" name="delete_Btn" onclick="delete(${list.post_num})" value="삭제하기">
					</td>
				</tr>
			</c:if>
	</table>

</body>
</html>