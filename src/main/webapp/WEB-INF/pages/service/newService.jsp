<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>创建服务</title>
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
<script>
	$(function() {
		$('#cc').combobox({
			url : 'combobox_data.json',
			valueField : 'id',
			textField : 'text'
		});
		
$('#cc').combobox({    
    url:'service/findBasDict.do',    
    valueField:'id',    
    textField:'text'   
});  


         
	});
</script>
</head>

<body>
<script type="text/javascript">
$.fn.datebox.defaults.formatter = function(date){
	var y = date.getFullYear();
	var m = date.getMonth()+1;
	var d = date.getDate();
	return y+'/'+m+'/'+d;
}
</script>
	<div id="p" class="easyui-panel" title="My Panel"
		style="width:500px;height:300px;padding:10px;background:#fafafa;"
		data-options="iconCls:'icon-save',closable:true,    
                collapsible:true,minimizable:true,maximizable:true">
		<table border="1" bordercolor="black" width="450" cellspacing="0"
			cellpadding="5">
			<tr>
				<td>编号</td>
				<td></td>
				<td>服务类型</td>
				<td><input id="cc" name="dictValue"></td>
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
				<td>cyl</td>
				<!-- 登录的用户 -->
				<td>创建时间</td>
				<td>
				 <input class="easyui-datetimebox" name="birthday"
					data-options="required:true,showSeconds:false"
					showSeconds="true"
					 value="today"
					style="width:100%"> 
					</td>
			</tr>
		</table>
	</div>
</body>



</html>