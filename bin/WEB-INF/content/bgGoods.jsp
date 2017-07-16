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
	
    <title>后台商品管理页面</title>

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
			<td>商品编号</td>
			<td>商品图片</td>
			<td>商品名称</td>
			<td>价格</td>
			<td>商品类型</td>
			<td>库存</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${requestScope.goods_list}" var="goods">
		<tr>
			<td>${goods.id}</td>
			<td><img src="images/${goods.image}"></td>
			<td>${goods.name}</td>
			<td>￥ ${goods.price}</td>
			<td>${goods.type}</td>
			<td>${goods.inventory}</td>
			<td>
			<!-- 操作按钮 -->
			
			<!-- 修改商品按钮 -->
			<!-- Button trigger modal -->
			<button type="button" class="btn btn-mini btn-primary" data-toggle="modal" data-target="#myModal">修改</button>
			<!-- Modal -->
			<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
			  <div class="modal-dialog" role="document">
			    <div class="modal-content">
			      <div class="modal-header">
			        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
			        <h4 class="modal-title" id="myModalLabel">修改商品信息</h4>
			      </div>
			      <div class="modal-body">
			      <form class="form-horizontal" action="updateGoods" method="get">
					  <div class="control-group">
					    <label class="control-label" for="inputId">商品编号</label>
					    <div class="controls">
					      <input type="hidden" id="inputId" name="id" value="${goods.id}">${goods.id}
					    </div>
					  </div>
					  <div class="control-group">
					    <label class="control-label" for="inputImage">商品图片</label>
					    <div class="controls">
					      <input type="text" id="inputImage" name="image" value="${goods.image}">
					    </div>
					  </div>
					  <div class="control-group">
					    <label class="control-label" for="inputName">商品名称</label>
					    <div class="controls">
					      <input type="text" id="inputName" name="name" value="${goods.name}">
					    </div>
					  </div>
					  <div class="control-group">
					    <label class="control-label" for="inputPrice">价格</label>
					    <div class="controls">
					      <input type="number" id="inputPrice" name="price" min="1" value="${goods.price}">
					    </div>
					  </div>
					  <div class="control-group">
					    <label class="control-label"  for="inputType">商品类型</label>
					    <div class="controls">
					      <input type="text" id="inputType" name="type" value="${goods.type}">
					    </div>
					  </div>
					  <div class="control-group">
					    <label class="control-label" for="inputInventory">库存</label>
					    <div class="controls">
					      <input type="number" id="inputInventory" name="inventory" min="1" value="${goods.inventory}">
					    </div>
					  </div>
					  <div class="control-group">
					    <div class="controls">
					      <button type="submit" class="btn">提交修改</button>
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
			
			<!-- 删除商品按钮 -->
			<form action="deleteGoods" method="get">
				<input type="hidden" name="id" value="${goods.id}">
				<input type="submit" class="btn btn-small btn-default" value="删除">
			</form>

			</td>
		</tr>	
		</c:forEach>
	</table>
</body>
</html>
	