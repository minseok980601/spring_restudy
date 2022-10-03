<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마이페이지</title>
<script type="text/javascript">
	function change_pwd() {
		let pass = document.getElementById('password').value;
		let chkPass = document.getElementById('chkPassword').value;
		if(document.mypage_info.pwd.value == "") {
			alert("비밀번호를 입력해주세요");
			document.mypage_info.pass.focus();
			return false;
		}
	}
</script>
</head>
<body>
<form action="" name="mypage_info">
	<table>
		<tr>
			<td>아이디 : ${loginMember.id }</td>
		</tr>
		<tr>
			<td>이름 : ${loginMember.name }</td>
		</tr>
		<tr>
			<td>
				비밀번호 :
			</td>
			<td>
				<input type="text" id="password" name="pwd" placeholder="비밀번호를 입력하세요">
			</td>
		</tr>
		<tr>
			<td>
				비밀번호 확인 : 
			</td>
			<td>
				<input type="text" id="chkPassword" name="chkPwd" placeholder="비밀번호를 입력하세요">
				<input type="button" value="수정" onclick="change_pwd()">
			</td>
		</tr>
	</table>
</form>
</body>
</html>