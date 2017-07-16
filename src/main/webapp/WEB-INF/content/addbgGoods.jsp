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
	
    <title>后台商品上架页面</title>

    <link rel="stylesheet" href="css/bootstrap.min.css"  type="text/css">
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="font-awesome/css/font-awesome.min.css"  type="text/css">
    <link rel="stylesheet" href="fonts/font-slider.css" type="text/css">
	<script src="js/jquery-2.1.1.js"></script>	 
    <script src="js/bootstrap.min.js"></script>
</head>
<body>
<div class="row">
	<div class="col-md-1"> </div>
	<div class="col-md-7">
		<center><h2>商品上架</h2></center>
		<div class="container">
	        <div class="row">
	        	<div class="span4">
					<div class="alert alert-success">
				        <a class="close" data-dismiss="alert">×</a>
				        	${requestScope.message}
				    </div>
				</div>
			</div>
		</div>
		<form class="form-horizontal"  action="addGoods" method="get">
		  <div class="form-group">
		    <label for="inputName" class="col-sm-2 control-label">商品名称</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" id="inputName" name="name">
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputImage" class="col-sm-2 control-label">商品图片</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" id="inputImage" name="image">
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputPrice" class="col-sm-2 control-label">价格</label>
		    <div class="col-sm-10">
		      <input type="number" class="form-control" id="inputPrice" min="1" name="price">
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputType" class="col-sm-2 control-label">商品类型</label>
		    <div class="col-sm-10">
		    <script language="JavaScript" type="text/javascript">
<!--
/*
 * 说明：将指定下拉列表的选项值清空
 * 转自：Gdong Elvis ( http://www.gdcool.net )
 *
 * @param {String || Object]} selectObj 目标下拉选框的名称或对象，必须
 */
 function removeOptions(selectObj)
 {
 if (typeof selectObj != 'object')
 {
 selectObj = document.getElementById(selectObj);
 }
 // 原有选项计数
 var len = selectObj.options.length;
 for (var i=0; i < len; i++) {
 // 移除当前选项
 selectObj.options[0] = null;
 }
 }
 /*
 * @param {String || Object]} selectObj 目标下拉选框的名称或对象，必须
 * @param {Array} optionList 选项值设置 格式：[{txt:'北京', val:'010'}, {txt:'上海', val:'020'}] ，必须
 * @param {String} firstOption 第一个选项值，如：“请选择”，可选，值为空
 * @param {String} selected 默认选中值，可选
 */
 function setSelectOption(selectObj, optionList, firstOption, selected) {
 if (typeof selectObj != 'object')
 {
 selectObj = document.getElementById(selectObj);
 }
 // 清空选项
 removeOptions(selectObj);
 // 选项计数
 var start = 0;
 // 如果需要添加第一个选项
 if (firstOption) {
 selectObj.options[0] = new Option(firstOption, '');
 // 选项计数从 1 开始
 start ++;
 }
 var len = optionList.length;
 for (var i=0; i < len; i++) {
 // 设置 option
 selectObj.options[start] = new Option(optionList[i].txt, optionList[i].val);
 // 选中项
 if(selected == optionList[i].val)  {
 selectObj.options[start].selected = true;
 }
 // 计数加 1
 start ++;
 }
 }
 //-->
</script>
<script language="JavaScript" type="text/javascript">
var cityArr = [];
cityArr['家用电器'] =
[
 {txt:'空调', val:'空调'},
 {txt:'冰箱', val:'冰箱'},
 {txt:'洗衣机', val:'洗衣机'}
 ];
cityArr['手机'] =
[
 {txt:'手机', val:'手机'},
 {txt:'手机配件', val:'手机配件'}
 ];
cityArr['电脑'] =
	[
	 {txt:'电脑整机', val:'电脑整机'},
	 {txt:'电脑配件', val:'电脑配件'},
	 {txt:'外设产品', val:'外设产品'}
	 ];
function setCity(province)
{
 setSelectOption('type', cityArr[province], '-请选择-');
}
</script>
 <select name="province" id="province" onchange="if(this.value != '') setCity(this.options[this.selectedIndex].value);">
 <option value="">-请选择-</option>
 <option value="家用电器">家用电器</option>
 <option value="手机">手机</option>
 <option value="电脑">电脑</option>
 </select>
 <select name="type" id="type">
 <option value="">-请选择-</option>
 </select>
		    
		    
<!-- 
				<select class="form-control" id="inputType" name="type">
						  <option>空调</option>
						  <option>洗衣机</option>
						  <option>冰箱</option>
						  <option>手机</option>
						  <option>手机配件</option>
						  <option>电脑整机</option>
						  <option>电脑配件</option>
						  <option>外设产品</option>
				</select>
-->
	    	</div>
		  </div>
		  <div class="form-group">
		    <label for="inputInventory" class="col-sm-2 control-label">库存</label>
		    <div class="col-sm-10">
		      <input type="number" class="form-control" id="inputInventory" min="1" name="inventory">
		    </div>
		  </div>
		  <div class="form-group">
		    <div class="col-sm-offset-2 col-sm-10">
		      <center><button type="submit" class="btn btn-primary btn-lg btn-block ">提交</button></center>
		    </div>
		  </div>
		</form>
	</div>
	<div class="col-md-4"> </div>
</div>		

</body>
</html>
	