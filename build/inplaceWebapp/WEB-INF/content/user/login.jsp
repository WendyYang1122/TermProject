<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
	<title>登陆页面</title>
	<c:set value="${pageContext.request.contextPath}" var="path" scope="page"/>
	<link href="${path}/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
  <div class="container">
	  <div class="row">
		  <div class="col-md-4 col-md-offset-4">
		  
			<form class="form-signin" action="login" methor="post">
			  <h2>登陆页面</h2>
			  <div class="form-group">
			    <label for="email">邮箱</label>
			    <input class="form-control" type="email" class="form-control" id="email" name="email" placeholder="Email">
			  </div>
			  <div class="form-group">
			    <label for="password">密码</label>
			    <input class="form-control" type="password" class="form-control" id="password" placeholder="Password">
			  </div>
			  <button class="btn btn-lg btn-primary btn-block" type="submit" class="btn btn-default">登陆</button>
			</form>
			<form action="register" methor="post" ><button class="btn btn-lg btn-primary btn-block" type="submit" class="btn btn-default">免费注册>></button></form>
		  </div>
	  </div>
  </div>
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <script src="${path}/js/bootstrap.min.js"></script>
</body>
</html>