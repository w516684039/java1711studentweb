<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../common/header.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">
    <title> - 用户列表</title>
</head>
<body>
	<table class="layui-hide" id="datagrid"></table>
	
	<script>
		layui.use('table', function(){
		  var table = layui.table;
		  
		  table.render({
		    elem: '#datagrid', //要渲染哪个表格
		    url:'${ctx}/manager/user/pageList.action', //异步数据接口
		    cellMinWidth: 50, //列宽自动分配，全局定义常规单元格的最小宽度
		    cols: [[
		      {field:'id', title: 'ID', sort: true},
		      {field:'username', title: '用户名', sort: true},
		      {field:'password', title: '密码', sort: true},
		      {field:'email', title: '邮箱', sort: true},
		      {field:'phone', title: '电话', sort: true},
		      {field:'question', title: '提示问题', sort: true},
		      {field:'answer', title: '答案', sort: true},
		      {field:'role', title: '角色', sort: true},
		    ]],
		    page: true
		  });
		});
	</script>
</body>
</html>