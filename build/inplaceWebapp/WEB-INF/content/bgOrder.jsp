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
	<table class="table table-striped" >
		<tr bgcolor="lightblue">
			<td>订单编号</td>
			<td>商品名称</td>
			<td>订单状态</td>
			<td>库存</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${requestScope.order_list}" var="order">
		<tr>
			<td>${order.id}</td>
			<td>${order.goods.name}</td>
			<td>${order.status}</td>
			<td>${order.goods.inventory}</td>
			<td>
				<form action="updateOrder" method="get">
					<input type="hidden" name="id" value="${order.id}">
					<input type="hidden" name="status" value="已发货">
					<input type="submit" class="btn btn-small btn-default" value="发货">
				</form>
			</td>
		</tr>	
		</c:forEach>
	</table>
</body>
</html>
	