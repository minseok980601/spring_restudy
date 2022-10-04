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
		
		if(pass.length < 8) {
			alert('비밀번호는 8글자 이상, 16글자 이하만 사용 가능합니다.');
			document.mypage_info.pwd.focus();
			return false;
		} else if(pass.length > 16) {
			alert('비밀번호는 8글자 이상, 16글자 이하만 사용 가능합니다.');
			document.mypage_info.pwd.focus();
			return false;
		}
		
		if(document.mypage_info.pwd.value != document.mypage_info.chkPwd.value) {
			alert("비밀번호를 다시 확인해주세요");
			document.mypage_info.chkPwd.focus();
			return false;
		} else {
 			alert("비밀번호변경 완료!");
			document.mypage_info.action="${contextPath}/changePwd?id=${loginMember.id}";
			document.mypage_info.method="post";
			document.mypage_info.submit(); 
		}
	}
</script>
</head>
<body>
<form action="${contextPath}/mypage" method="get" name="mypage_info">
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