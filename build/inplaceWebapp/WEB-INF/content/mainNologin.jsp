<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
	<title>商城首页</title>
	<link href="css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
	<div class="row">
	  <div class="col-md-2"></div>
	  <div class="col-md-8">
		<!--header  -->
		<div>
			<!-- /置顶导航条 -->
			<div class="container-fluid">
				<nav class="navbar navbar-default">
				  <div class="container-fluid">
					<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
				      <ul class="nav navbar-nav">
				      	<li>
				      		<img src="" alt="袋子商城" class="img-thumbnail">
				      	</li>
				        <li><a href="login" >你好，欢迎到袋子</a></li>
				        <li><a href="login">登陆</a></li>
				        <li><a href="register">免费注册</a></li>
				        <li><a href="login">我的订单</a></li>
				        <li><a href="login">收藏夹</a></li>
				        <li><a href="login">购物车</a></li>
				      </ul>
				     </div>
				  </div>
				</nav>
			</div>
			<div class="container-fluid">&nbsp</div>
		</div>
		<!-- header end -->
		
		<!--banner+ 商品分类导航  -->	
		<div class="container-fluid">
		  <div class="row">
			<!-- 商品分类导航 -->
			<div class="col-md-2">
			<div class="navbar ">
				<div>
					<ul class="nav nav-pills nav-stacked">
						<li> </li>
						<li> </li>
						<li role="presentation"><b>商品分类</b></li>
						<li role="presentation" class="dropdown">
						    <a class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
						                   家用电器 <span class="caret"></span>
						    </a>
						    <ul class="dropdown-menu">
								<li><a href="showType?type=空调">空调</a></li>
								<li><a href="showType?type=洗衣机">洗衣机</a></li>
								<li><a href="showType?type=冰箱">冰箱</a></li>
						    </ul>
						</li>
						<li role="presentation" class="dropdown">
						    <a class="dropdown-toggle" data-toggle="dropdown"  role="button" aria-haspopup="true" aria-expanded="false">
						                  手机 <span class="caret"></span>
						    </a>
						    <ul class="dropdown-menu">
								<li><a href="showType?type=手机">手机</a></li>
								<li><a href="showType?type=手机配件">手机配件</a></li>
						    </ul>
						</li>
						<li role="presentation" class="dropdown">
						    <a class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
						                   电脑 <span class="caret"></span>
						    </a>
						    <ul class="dropdown-menu">
								<li><a href="showType?type=电脑整机">电脑整机</a></li>
								<li><a href="showType?type=电脑配件">电脑配件</a></li>
								<li><a href="showType?type=外设产品">外设产品</a></li>
						    </ul>
						</li>
					</ul>
				</div>
			</div>
			</div>
			<!-- banner -->	
			<div class="col-md-8">
				<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
				  <!-- Indicators -->
				  <ol class="carousel-indicators">
				    <li data-target="#carousel-example-generic" data-slide-to="0"></li>
				    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
				    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
				  </ol>
				
				  <!-- Wrapper for slides -->
				  <div class="carousel-inner" role="listbox">
				    <div class="item active">
				      <img src="images/banner1.jpg" alt="全民优惠最高优惠100">
				    </div>
				    <div class="item">
				      <img src="images/banner2.jpg" alt="荣耀下单立减">
				    </div>
				    <div class="item">
				      <img src="images/banner3.jpg" alt="企业采购专享低价">
				    </div>
				  </div>
				
				  <!-- Controls -->
				  <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
				    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
				    <span class="sr-only">上一页</span>
				  </a>
				  <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
				    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
				    <span class="sr-only">下一页</span>
				  </a>
				</div>
			  </div>
			  <!-- 小banner -->
			  <div class="col-md-2">
				<img src="images/xbanner1.jpg" alt="夏季家电12期免息" class="img-thumbnail">
				<img src="images/xbanner2.jpg" alt="智能夏季家电" class="img-thumbnail">
			  </div>
			</div>
		</div>
		<!-- banner +商品分类导航 end -->
		
		<!--content  -->
		<div>
			<div><h2>发现好货</h2></div>
			<div class="row"><c:forEach items="${requestScope.goods_list }" var="goods">
				<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
					<div class="product">
						<div ><img src="images/${goods.image }" height="60"></div>
						<div class="buttons">
							<a>销量：${goods.sales}</a>
							<a class="btn cart" href="login"><span class="glyphicon glyphicon-shopping-cart"></span></a>
							<a class="btn wishlist" href="login"><span class="glyphicon glyphicon-heart"></span></a>
						</div>
						<div class="caption">
							<div class="name"><h3>${goods.name}</h3></div>
							<div class="price">${goods.price}</div>
						</div>	
					</div>
				</div>
			</c:forEach></div>
		</div>
		<!-- content end -->
		<div >
		  
		   
		</div>
		<!--footer  -->
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
		<!-- footer end -->
		
	  </div>
	  <div class="col-md-2"></div>
	</div>
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</body>
</html>