<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <meta name="description" content="">
    <meta name="author" content="">
	
    <title>订单页面</title>

    <link rel="stylesheet" href="css/bootstrap.min.css"  type="text/css">
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="font-awesome/css/font-awesome.min.css"  type="text/css">
    <link rel="stylesheet" href="fonts/font-slider.css" type="text/css">
	<script src="js/jquery-2.1.1.js"></script>	 
    <script src="js/bootstrap.min.js"></script>
</head>
<body>
	<!--Header-->
	<header class="container">
		<div class="row">
			<div class="col-md-4">
				<div id="logo"><img  alt="袋子商城"/></div>
			</div>
			<div class="col-md-4"></div>
			<div class="col-md-4">
				<div id="cart"><a class="btn btn-1" href="showCart?username=${user.username}"><span class="glyphicon glyphicon-shopping-cart"></span>CART</a></div>
			</div>
		</div>
	</header>
	<!--Navigation-->
    <nav id="menu" class="navbar">
		<div class="container">
			<div class="navbar-header"><span id="heading" class="visible-xs">商品类别：</span>
			  <button type="button" class="btn btn-navbar navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse"><i class="fa fa-bars"></i></button>
			</div>
			<div class="collapse navbar-collapse navbar-ex1-collapse">
				<ul class="nav navbar-nav">
					<li><a href="showMain">主页</a></li>
					<li class="dropdown"><a  class="dropdown-toggle" data-toggle="dropdown">家用电器</a>
						<div class="dropdown-menu">
							<div class="dropdown-inner">
								<ul class="list-unstyled">
									<li><a href="showType?type=空调">空调</a></li>
									<li><a href="showType?type=洗衣机">洗衣机</a></li>
									<li><a href="showType?type=冰箱">冰箱</a></li>
								</ul>
							</div>
						</div>
					</li>
					<li class="dropdown"><a  class="dropdown-toggle" data-toggle="dropdown">手机</a>
						<div class="dropdown-menu">
							<div class="dropdown-inner">
								<ul class="list-unstyled">
									<li><a href="showType?type=手机">手机</a></li>
									<li><a href="showType?type=手机配件">手机配件</a></li>
								</ul>
							</div> 
						</div>
					</li>
					<li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown">电脑</a>
						<div class="dropdown-menu" >
							<div class="dropdown-inner">
								<ul class="list-unstyled">
									<li><a href="showType?type=电脑整机">电脑整机</a></li>
									<li><a href="showType?type=电脑配件">电脑配件</a></li>
									<li><a href="showType?type=外设产品">外设产品</a></li>
								</ul>
							</div>
						</div>
					</li>
					<li class="dropdown"><a  class="dropdown-toggle" data-toggle="dropdown">我的中心</a>
						<div class="dropdown-menu" >
							<div class="dropdown-inner">
								<ul class="list-unstyled">
									<li><a href="showOrder?username=${user.username}">我的订单</a></li>
									<li><a href="showCart?username=${user.username}">购物车</a></li>
									<li><a href="showFavorite?username=${user.username}">收藏夹</a></li>
									<li><a href="editPassword">修改密码</a></li>
									<li><a href="login">退出</a></li>
								</ul>
							</div>
						</div>
					</li>
				</ul>
			</div>
		</div>
	</nav>
		<!--//////////////////////////////////////////////////-->
	<!--///////////////////Cart Page//////////////////////-->
	<!--//////////////////////////////////////////////////-->
	<div id="page-content" class="single-page">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<ul class="breadcrumb">
						<li><a href="showMain">主页</a></li>
						<li>我的订单</li>
					</ul>
				</div>
			</div>
			<div class="container">
		        <div class="row">
		        	<div class="span4">
						<div class="alert alert-success">
					        <a class="close" data-dismiss="alert">×</a>
					        	${requestScope.messageR}
					    </div>
					</div>
				</div>
			</div>
			<div class="row"><c:forEach items="${requestScope.order_list}" var="order">
				<div class="product well">
					<div class="col-md-3">
						<div class="image">
							<img src="images/${order.goods.image}" />
						</div>
					</div>
					<div class="col-md-9">
						<div class="caption">
							<div class="name"><h3> ${order.goods.name}</h3></div>
							<div class="price"> ￥${order.goods.price}</div>
							<div class="price">订单状态：${order.status}</div>
							<div>
								<!-- 商品评价按钮 -->
								<!-- Button trigger modal -->
								<button type="button" class="btn btn-mini btn-primary" data-toggle="modal" data-target="#myModal">评价</button>
								<!-- Modal -->
								<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
								  <div class="modal-dialog" role="document">
								    <div class="modal-content">
								      <div class="modal-header">
								        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
								        <h4 class="modal-title" id="myModalLabel">商品评价</h4>
								      </div>
								      <div class="modal-body">
								      <form class="form-horizontal" action="addReviews" method="get">
										  <input type="hidden" name="order_id" value="${order.id}">
										  <input type="hidden" name="username" value="${order.user.username}">
										  <div class="control-group">
										    <label class="control-label" for="inputImage">评价：</label>
										    <div class="controls">
										      <input type="text" id="inputImage" name="content">
										    </div>
										  </div>
										  <div class="control-group">
										    <label class="control-label" for="inputName">物流评分：</label>
										    <div class="controls">
										      <select name="logistics" id="inputName">
												  <option value ="1">1</option>
												  <option value ="2">2</option>
												  <option value ="3">3</option>
												  <option value ="4">4</option>
												  <option value ="5">5</option>
											  </select>
										    </div>
										  </div>
										  <div class="control-group">
										    <label class="control-label" for="inputPrice">质量评分：</label>
										    <div class="controls">
										      <select name="quality" id="inputPrice">
												  <option value ="1">1</option>
												  <option value ="2">2</option>
												  <option value ="3">3</option>
												  <option value ="4">4</option>
												  <option value ="5">5</option>
											  </select>
										    </div>
										  </div>
										  <div class="control-group">
										    <label class="control-label"  for="inputType">商品类型</label>
										    <div class="controls">
											    <select name="service" id="inputType">
												  <option value ="1">1</option>
												  <option value ="2">2</option>
												  <option value ="3">3</option>
												  <option value ="4">4</option>
												  <option value ="5">5</option>
												</select>
										    </div>
										  </div>
										  <div class="control-group">
										    <div class="controls">
										      <button type="submit" class="btn">提交评价</button>
										    </div>
										  </div>
										</form>
									  </div>
								      <div class="modal-footer">
								        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
								      </div>
								    </div>
								  </div>
								</div>							
							</div>

						</div>
					</div>
					<div class="clear"></div>
				</div>	
			</c:forEach></div>
			<div class="row">
				<div class="col-md-6 "> </div>
				<div class="col-md-3 ">
					<center><a href="showMain?username=${user.username}" class="btn btn-1">继续购物</a></center>
				</div>
			</div>
		</div>
	</div>	
	<footer>
		<div class="copyright">
			<div class="container">
				<div class="row">
					<div class="col-md-6">
						Copyright &copy; 2017.Company name All rights reserved.
					</div>
					<div class="col-md-6">
					</div>
				</div>
			</div>
		</div>
	</footer>
</body>
</html>
	