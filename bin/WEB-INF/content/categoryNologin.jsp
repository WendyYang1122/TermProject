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
	
    <title>分类商品</title>

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
				<div id="logo"><img alt="袋子商城"/></div>
			</div>
			<div class="col-md-4"> </div>
			<div class="col-md-4">
				<div id="cart"><a class="btn btn-1" href="login"><span class="glyphicon glyphicon-shopping-cart"></span>CART</a></div>
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
					<li><a href="showIndex">主页</a></li>
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
					<li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown">手机</a>
						<div class="dropdown-menu">
							<div class="dropdown-inner">
								<ul class="list-unstyled">
									<li><a href="showType?type=手机">手机</a></li>
									<li><a href="showType?type=手机配件">手机配件</a></li>
								</ul>
							</div> 
						</div>
					</li>
					<li class="dropdown"><a  class="dropdown-toggle" data-toggle="dropdown">电脑</a>
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
									<li><a href="login">我的订单</a></li>
									<li><a href="login">购物车</a></li>
									<li><a href="login">收藏夹</a></li>
									<li><a href="login">我的信息</a></li>
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
	<div id="page-content" class="single-page"><c:forEach items="${requestScope.goods_list}" var="goods">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<ul class="breadcrumb">
						<li>主页</li>
						<li>商品类别: ${goods.type }</li>
					</ul>
				</div>
			</div>
			<div class="row">
				<div id="main-content" class="col-md-12">
					<div class="row">
						<div class="col-md-12">
							<div class="products">
								<div class="col-lg-4 col-md-4 col-xs-12">
									<div class="product">
										<div class="image"><img src="images/${goods.image }" /></div>
										<div class="buttons">
											<a>销量：${goods.sales}</a>
											<a class="btn cart" href="login"><span class="glyphicon glyphicon-shopping-cart"></span></a>
											<a class="btn wishlist" href="login"><span class="glyphicon glyphicon-heart"></span></a>
										</div>
										<div class="caption">
											<div class="name"><h3>${goods.name}</h3></div>
											<div class="price">${goods.price}</div>
											<div class="rating"><span class="glyphicon glyphicon-star"></span><span class="glyphicon glyphicon-star"></span><span class="glyphicon glyphicon-star"></span><span class="glyphicon glyphicon-star"></span><span class="glyphicon glyphicon-star-empty"></span></div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</c:forEach></div>
				</div>
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
