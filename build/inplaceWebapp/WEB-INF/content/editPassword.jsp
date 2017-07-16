<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
	<title>修改密码页面</title>
	<link href="css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<div>
		<!-- /置顶导航条 -->
		<div class="container-fluid">
			<nav class="navbar navbar-default">
			  <div class="container-fluid">
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
			      <ul class="nav navbar-nav">
			      	<li><img src="" alt="袋子商城" class="img-thumbnail"></li>
			        <li><a href="showMe?username=${user.username}">${user.username}，袋子欢迎你</a></li>
			        <li><a href="showOrder?username=${user.username}">我的订单</a></li>
			        <li><a href="showFavorite?username=${user.username}">收藏夹</a></li>
			        <li><a href="showCart?username=${user.username}">购物车</a></li>
			        <li><a href="editPassword">修改密码</a></li>
			        <li><a href="login">退出</a></li>
			      </ul>
			     </div>
			  </div>
			</nav>
		</div>
		<div class="container-fluid">&nbsp</div>
	</div>
	<!-- /置顶导航条end -->
	
  <div class="container">
	  <div class="row">
		  <div class="col-md-4 col-md-offset-4">
		  
			<form class="form-signin" action="updateUser" method="post">
			  <h2>修改密码</h2>
			  <div class="form-group">
			    <label for="email">邮箱:</label>
			    <input class="form-control" type="email"  id="email" name="email" value="${sessionScope.user.email}" readonly="true">
			  </div>
			  <div class="form-group">
			    <label for="password">新密码</label>
			    <input class="form-control" type="text" id="password" name="password">
			  </div>
			  <div class="form-group">
			  	<input type="hidden" name="id" value="${sessionScope.user.id}">
			  	<button  type="submit" class="btn btn-block btn-success">提交</button>
			  </div>
			</form>	
		  </div>
	  </div>
  </div>
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</body>
</html>