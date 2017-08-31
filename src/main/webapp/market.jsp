<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'market.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!-- 导入jquery核心类库 -->
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
<!-- 导入easyui类库 -->
<link id="easyuiTheme" rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/js/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/js/easyui/themes/icon.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/js/easyui/themes/demo.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/css/default.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/easyui/jquery.easyui.min.js"></script>
	
 
  <body>
 
	<div style="margin:20px 0;"></div>
	<div id="add"></div>
	<table id="dg" title="销售机会管理"
			toolbar="#toolbar"
	        style="width:700px;height:250px"
			data-options="rownumbers:true,
			singleSelect:true,
			pagination:true,
			url:'findAllMarket.do',
			method:'get'"
			
			>
		<thead>
			<tr>
				<th data-options="field:'chcId',width:50">编号</th>
				<th data-options="field:'chcCustName',width:100">客户名称</th>
				<th data-options="field:'chcSource',width:80,align:'right'">客户来源</th>
				<th data-options="field:'chcTitle',width:80,align:'center'">客户概要</th>
				<th data-options="field:'chcRate',width:80,align:'right'">客户成功概率</th>
				<th data-options="field:'chcDesc',width:80">客户级别</th>
				<th data-options="field:'chcLinkman',width:80,align:'center'">联系人</th>
				<th data-options="field:'chcTel',width:80,align:'center'">联系人号码</th>
				<th data-options="field:'chcCreateId',width:80,align:'center'">创建人编号</th>
				<th data-options="field:'chcCreateBy',width:80,align:'center'">创建人姓名</th>
				<th data-options="field:'chcCreateDate',width:80,align:'center'">创建时间</th>
				<th data-options="field:'chcDueId',width:80,align:'center'">指派人编号</th>
				<th data-options="field:'chcDueTo',width:80,align:'center'">指派人姓名</th>
				<th data-options="field:'chcDueDate',width:80,align:'center'">指派时间</th>
				<th data-options="field:'chcStatus',width:80,align:'center'">机会状态</th>
				
			</tr>
		</thead>
	</table>
	<div id="toolbar">
	<a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newUser()">New User</a>
	<a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editUser()">Edit User</a>
	<a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyUser()">Remove User</a>
</div>
	<script>
		function newUser(){
			$("#add").dialog({
			}, function() {
				
			})
		}
	</script>
	
	<script type="text/javascript">
		$(function(){
			var pager = $('#dg').datagrid().datagrid('getPager');	// get the pager of datagrid
			pager.pagination({
				buttons:[{
					iconCls:'icon-search',
					handler:function(){
						alert('search');
					}
				},{
					iconCls:'icon-add',
					handler:function(){
						alert('add');
					}
				},{
					iconCls:'icon-edit',
					handler:function(){
						alert('edit');
					}
				}]
			});			
		})
	</script>
  </body>
</html>
