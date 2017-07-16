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
	
    <title>商品详情</title>

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
								</ul>
							</div>
						</div>
					</li>
				</ul>
			</div>
		</div>
	</nav>
	
	<!--//////////////////////////////////////////////////-->
	<!--///////////////////Category Page//////////////////-->
	<!--//////////////////////////////////////////////////-->
	<div id="page-content" class="single-page">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<ul class="breadcrumb">
						<li>主页</li>
						<li>商品详情</li>
					</ul>
				</div>
			</div>
			<!-- 详情 -->
			
			<div class="row">
			<c:forEach items="${requestScope.goods_list}" var="goods">
				<div class="product">
					<div class="col-md-6">
						<div class="image">
							<img src="images/${goods.image }" />
							<div class="image-more">
								 <ul class="row">
								 	<li class="col-lg-3 col-sm-3 col-xs-4">
										<a ><img class="img-responsive" src="images/${goods.image}"></a>
									</li>
									 <li class="col-lg-3 col-sm-3 col-xs-4">
										<a><img class="img-responsive" src="images/${goods.image1 }"></a>
									</li>
									 <li class="col-lg-3 col-sm-3 col-xs-4">
										<a ><img class="img-responsive" src="images/${goods.image2 }"></a>
									</li>
								</ul>
							</div>
						</div>
					</div>
					<div class="col-md-6">
						<div class="caption">
							<div class="name"><h3>${goods.name}</h3></div>
							<div class="info">
								<ul>
									<li>商品编号: ${goods.id}</li>
								</ul>
							</div>
							<div class="price">￥${goods.price}</div>
							<div class="well"><label>数量: </label>
								<form action="addCart">
							   		<input class="form-inline quantity" type="text" name="number" value="1">
							   		<input type="hidden" name="goods.id" value="${goods.id}" >
							   		<input type="hidden" name="user.id" value="${user.id}" >
							   		<input type="hidden" name="username" value="${user.username}" >
							   		<input type="submit" class="btn btn-2" value="加入购物车">
							   		
							    </form>
							</div>
						</div>
					</div>
					<div class="clear"></div>
				</div>
			</c:forEach>
			</div>
		</div>
	</div>
	<footer>
		<div class="copyright">
			<div class="container">
				<div class="row">
					<div class="col-md-4">
					</div>
					<div class="col-md-4">
						Copyright &copy; 2017.Company name All rights reserved.
					</div>
					<div class="col-md-4">
					</div>
				</div>
			</div>
		</div>
	</footer>
</body>
</html>
