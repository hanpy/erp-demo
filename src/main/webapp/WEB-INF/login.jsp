<%@ page pageEncoding="UTF-8"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>登录</title>
<link rel="stylesheet"
	href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">
<style type="text/css">
body {
	padding-top: 40px;
	padding-bottom: 40px;
	background-color: #eee;
}

.form-signin {
	max-width: 330px;
	padding: 15px;
	margin: 0 auto;
}

.form-signin .form-signin-heading, .form-signin .checkbox {
	margin-bottom: 10px;
}

.form-signin .checkbox {
	font-weight: normal;
}

.form-signin .form-control {
	position: relative;
	height: auto;
	-webkit-box-sizing: border-box;
	-moz-box-sizing: border-box;
	box-sizing: border-box;
	padding: 10px;
	font-size: 16px;
}

.form-signin .form-control:focus {
	z-index: 2;
}

.form-signin input[type="corpcode"] {
	margin-bottom: -1px;
	border-top-left-radius: 0;
	border-top-right-radius: 0;
}

.form-signin input[type="username"] {
	margin-bottom: -1px;
	border-bottom-right-radius: 0;
	border-bottom-left-radius: 0;
}

.form-signin input[type="password"] {
	margin-bottom: 10px;
	border-top-left-radius: 0;
	border-top-right-radius: 0;
}

.alert-warning {
	max-width: 330px;
	margin: 0 auto;
}
</style>
</head>
<body>
	<div class="container">
		<c:if test="${not empty requestScope.msg}">
			<div class="alert alert-warning alert-dismissible" role="alert">
				<button type="button" class="close" data-dismiss="alert"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
				${requestScope.msg }
			</div>
		</c:if>
		<form class="form-signin" method="post" action="/erp/doLogin">
			<h2 class="form-signin-heading">请登录</h2>
			<label for="userName" class="sr-only">公司代码</label> <input
				type="corpcode" id="inputCorpcode" name="corpcode"
				class="form-control" placeholder="公司代码" required autofocus>
			<label for="userName" class="sr-only">用户名</label> <input
				type="username" id="inputUsername" name="username"
				class="form-control" placeholder="用户名" required> <label
				for="inputPassword" class="sr-only">密码</label> <input
				type="password" name="password" id="inputPassword"
				class="form-control" placeholder="密码" required>
			<div class="checkbox">
				<label> <input type="checkbox" value="记住登陆状态">
					记住登录状态
				</label>
			</div>
			<button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
		</form>
	</div>
</body>
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</html>