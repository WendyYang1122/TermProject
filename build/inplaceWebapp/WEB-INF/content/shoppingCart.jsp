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
	
    <title>购物车</title>

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
				<div id="logo"><img src="#"  alt="袋子商城"/></div>
			</div>
			<div class="col-md-4">
				<form class="form-search">  
					<input type="text" class="input-medium search-query">  
					<button type="submit" class="btn"><span class="glyphicon glyphicon-search"></span></button>  
				</form>
			</div>
			<div class="col-md-4">
				<div id="cart"><a class="btn btn-1" href="cart.html"><span class="glyphicon glyphicon-shopping-cart"></span>CART </a></div>
			</div>
		</div>
	</header>
	<!--Navigation-->
    <nav id="menu" class="navbar">
		<div class="container">
			<div class="navbar-header"><span id="heading" class="visible-xs">购物车</span>
			  <button type="button" class="btn btn-navbar navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse"><i class="fa fa-bars"></i></button>
			</div>
			<div class="collapse navbar-collapse navbar-ex1-collapse">
				<ul class="nav navbar-nav">
					<li><a href="index.html">主页</a></li>
					<li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown">家用电器</a>
						<div class="dropdown-menu">
							<div class="dropdown-inner">
								<ul class="list-unstyled">
									<li><a href="showType" ><type name="空调">空调</type></a></li>
									<li><a href="showType" name="洗衣机">洗衣机</a></li>
									<li><a href="showType" name="冰箱">冰箱</a></li>
								</ul>
							</div>
						</div>
					</li>
					<li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown">手机</a>
						<div class="dropdown-menu">
							<div class="dropdown-inner">
								<ul class="list-unstyled">
									<li><a href="category.html" name="智能手机">智能手机</a></li>
									<li><a href="category.html" name="手机配件">手机配件</a></li>
								</ul>
							</div> 
						</div>
					</li>
					<li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown">电脑</a>
						<div class="dropdown-menu" >
							<div class="dropdown-inner">
								<ul class="list-unstyled">
									<li><a href="category.html" name="">电脑整机</a></li>
									<li><a href="category.html">电脑配件</a></li>
									<li><a href="category.html">外设产品</a></li>
								</ul>
							</div>
						</div>
					</li>
					<li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown">我的中心</a>
						<div class="dropdown-menu" >
							<div class="dropdown-inner">
								<ul class="list-unstyled">
									<li><a href="3">我的订单</a></li>
									<li><a href="showCart">购物车</a></li>
									<li><a href="showFavorite">收藏夹</a></li>
									<li><a href="showMe">我的信息</a></li>
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
						<li><a href="index.html">主页</a></li>
						<li><a href="cart.html">购物车</a></li>
					</ul>
				</div>
			</div>
			<div class="row"><c:forEach items="${requestScope.cart_list }" var="cart">
				<div class="product well">
					<div class="col-md-3">
						<div class="image">
							<img src="images/galaxy-note.jpg" />
						</div>
					</div>
					<div class="col-md-9">
						<div class="caption">
							<div class="name"><h3><a href="product.html">Aliquam erat volutpat</a></h3></div>
							<div class="info">	
								<ul>
									<li>inventory</li>
									<li>ID: 0122222</li>
								</ul>
							</div>
							<div class="price">$122</div>
							<label>Qty: </label> <input class="form-inline quantity" type="text" value="1"><a href="#" class="btn btn-2 ">Update</a>
							<hr>
							<a href="#" class="btn btn-default pull-right">删除</a>
						</div>
					</div>
					<div class="clear"></div>
				</div>	
			</c:forEach></div>
			<div class="row">
				<div class="col-md-4 col-md-offset-8 ">
					<center><a href="#" class="btn btn-1">继续购物</a></center>
				</div>
			</div>
			<div class="row">
				<div class="pricedetails">
					<div class="col-md-4 col-md-offset-8">
						<table>
							<h6>结算</h6>
							<tr>
								<td>总计</td>
								<td>350.00</td>
							</tr>
							<tr>
								<td>折扣</td>
								<td>-----</td>
							</tr>
							<tr>
								<td>运费</td>
								<td>10.00</td>
							</tr>
							<tr style="border-top: 1px solid #333">
								<td><h5>实付款</h5></td>
								<td>400.00</td>
							</tr>
						</table>
						<center><a href="#" class="btn btn-1">提交订单</a></center>
					</div>
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
	