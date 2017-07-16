<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
	<title>找回密码页面</title>
	<link href="css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
  <div class="container">
	  <div class="row">
		  <div class="col-md-4 col-md-offset-4">
		  
			<form class="form-signin" action="FindPassword" method="post">
			  <h2>找回密码</h2>
			  <font color="red">${requestScope.message}</font>
			  <div class="form-group">
			    <label for="email">邮箱:</label>
			    <input class="form-control" type="email"  id="email" name="email">
			  </div>
			  <div class="form-group">
			    <label for="username">用户名:</label>
			    <input class="form-control" type="text" id="username" name="username">
			  </div>
			  <div class="form-group">
			  	<button  type="submit" class="btn btn-block btn-success">查找</button>
			  </div>
			  <a href="loginForm">&lt&lt返回登陆</a>
			</form>	
			
			<div class="alert alert-success">
		        <a class="close" data-dismiss="alert">×</a>
		        	${sessionScope.message1} ${user.password}		
			</div>	
			
		  </div>
	  </div>
  </div>
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</body>
</html>