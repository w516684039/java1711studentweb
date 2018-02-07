<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../common/header.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">
    <title> - 商品列表</title>
</head>
<body>
	<table class="layui-hide" id="datagrid"></table>
	
	<script>
		layui.use('table', function(){
		  var table = layui.table;
		  
		  table.render({
		    elem: '#datagrid', //要渲染哪个表格
		    url:'${ctx}/manager/product/pageList.action', //异步数据接口
		    cellMinWidth: 50, //列宽自动分配，全局定义常规单元格的最小宽度
		    cols: [[
		      {field:'id', title: 'ID', sort: true},
		      {field:'name', title: '名称', sort: true},
		      {field:'subtitle', title: '标题', sort: true},
		      {field:'price', title: '价格', sort: true},
		      {field:'stock', title: '库存', sort: true},
		      {field:'status', title: '状态', sort: true},
		      {field:'createTime', title: '创建时间', sort: true},
		      {field:'updateTime', title: '更新时间', sort: true},
		    ]],
		    page: true
		  });
		});
	</script>
</body>
</html>