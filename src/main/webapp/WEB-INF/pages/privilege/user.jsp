
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8" >
	

	<title>用户管理</title>
	
	
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
	
</head>


<body>
<!-- 	<h2>Custom DataGrid Pager</h2> -->
<!-- 	<p>You can append some buttons to the standard datagrid pager bar.</p> -->
	<div style="margin:20px 0;"></div>
	<table id="dg" title="用户"  style="width:100%;height:550px"
			data-options="rownumbers:true,singleSelect:true,
			pagination:true,url:'datagrid_data1.json',method:'get'" >
		<thead>
			<tr>
				<th data-options="field:'itemid',width:80">Item ID</th>
				<th data-options="field:'productid',width:100">Product</th>
				<th data-options="field:'listprice',width:80,align:'right'">List Price</th>
				<th data-options="field:'unitcost',width:80,align:'right'">Unit Cost</th>
				<th data-options="field:'attr1',width:240">Attribute</th>
				<th data-options="field:'status',width:60,align:'center'">Status</th>
			</tr>
		</thead>
	</table>
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
					
					$('#dlg').dialog('open');
					
						
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

<!-- 弹出小窗口 -->
	<div id="dlg" class="easyui-dialog" title="Toolbar and Buttons" hidden="true"
	style="width:400px;height:200px;padding:10px"
			data-options="
				iconCls: 'icon-save',
				toolbar: [{
					text:'Add',
					iconCls:'icon-add',
					handler:function(){
						alert('add')
					}
				},'-',{
					text:'Save',
					iconCls:'icon-save',
					handler:function(){
						alert('save')
					}
				}],
				buttons: [{
					text:'Ok',
					iconCls:'icon-ok',
					handler:function(){
						alert('ok');
					}
				},{
					text:'Cancel',
					handler:function(){
						alert('cancel');;
					}
				}]
			">
		
<form id="addUser" method="post" novalidate>
			<table border="1" bordercolor="black" width="450" cellspacing="0"
				cellpadding="5">
				<tr>
					<td>编号</td>
					<td></td>
					<td>服务类型</td>
					<td><input id="cc" class="easyui-combobox" name="dept"   
    data-options="valueField:'dictId',textField:'dictValue',url:''" /> 

					</select></td>
				</tr>
				<tr>
					<td>概要</td>
					<td><input type="text" style="width: 100%;padding:0px;"></td>
					<td colspan="2"></td>
				</tr>
				<tr>
					<td>客户</td>
					<td><input type="text" style="width: 100%;padding:0px;"></td>
					<td>状态</td>
					<td>新建</td>
				</tr>
				<tr>
					<td>详细描述</td>
					<td colspan="3"><textarea style="width: 100%;padding:0px;"></textarea></td>
				</tr>
				<tr>
					<td>创建人</td>
					<td>cyl</td> 登录的用户
					<td>创建时间</td>
					<td><input class="easyui-datetimebox" name="birthday"
						data-options="required:true,showSeconds:false" showSeconds="true"
						value="today" style="width:100%"></td>
				</tr>
			</table>
			</form>




	</div>


</html>