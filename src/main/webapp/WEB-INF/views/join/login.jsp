<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<script type="text/javascript">
	function login() {
		if(document.login_form.id.value == "") {
			alert("아이디를 입력해주세요.");
			document.login_form.id.focus();
			return false;
		} else if (document.login_form.pwd.value == "") {
			alert("비밀번호를 입력해주세요.");
			document.login_form.pwd.focus();
			return false;
		} else {
			document.login_form.action="${contextPath}/login";
			document.login_form.method="post";
			document.login_form.submit();
		}
	}
	
</script>
</head>
<body>
<form action="${contextPath}/login" method="post" name="login_form">
	<table>
		<tr>
			<td>아이디</td>
			<td>비밀번호</td>
		</tr>
		<tr>
			<td>
				<input type="text" id="id" name="id" placeholder="ID">
			</td>
			<td>
				<input type="text" id="pwd" name="pwd" placeholder="PWD">
			</td>
		</tr>
	</table>
	<input type="button" onclick="login()" value="로그인">
</form>
</body>
</html>