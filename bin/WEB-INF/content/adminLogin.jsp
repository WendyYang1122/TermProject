<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
	<title>后台登陆页面</title>
	<link href="css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
  <div class="container">
	  <div class="row">
		  <div class="col-md-4 col-md-offset-4">
		  
			<form class="form-signin" action="adLogin" method="post">
			  <h2>后台登陆页面</h2>
			  <font color="red">${requestScope.message}</font>
			  <div class="form-group">
			    <label for="name">账号:</label>
			    <input class="form-control" type="text"  id="name" name="name">
			  </div>
			  <div class="form-group">
			    <label for="password">密码:</label>
			    <input class="form-control" type="password" id="password" name="password">
			  </div>
			  <div class="row">
			  	<div class="col-md-4 col-md-offset-4"> </div>
			  	<div class="col-md-4 col-md-offset-4"> </div>
		  		<div class="col-md-4 col-md-offset-4">
			 	 <button  type="submit" class="btn btn-large btn-primary">登陆</button>
			 	</div>
			 </div>
			</form>	
					
		  </div>
	  </div>
  </div>
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</body>
</html>