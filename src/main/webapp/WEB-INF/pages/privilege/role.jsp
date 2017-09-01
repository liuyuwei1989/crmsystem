
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@  taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8" >
	

	<title>角色管理</title>
	
	
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
	<table id="dg" title="角色"  style="width:100%;height:550px"
			data-options="rownumbers:true,singleSelect:true,
			pagination:true,url:'/crmsystem/role/find.do',method:'get' " >
		<thead>
			<tr>
				<th data-options="field:'roleId',width:80">角色编号</th>
				<th data-options="field:'roleName',width:100">角色名称</th>
				<th data-options="field:'roleDesc',width:80,align:'right'">权限</th>
				
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
						
                  
					
						
					}
				},{
					iconCls:'icon-edit',
					handler:function(){
					
				var rows = $('#dg').datagrid('getSelections');
				alert(rows);
				var id=rows[0].roleId;
					
					
					$.ajax({
   type: "post",
   url: "/crmsystem/role/findRights.do",
  
   success: function(data){
   
   
   
   //var map= $.parseJSON(data);

   //alert(data);
   
   for(var mapSon in data){//循环大json里的key值
   
   //大json里的key值对应的vaLue值
   		var child = data[mapSon];
   		if(child["rightParentCode"]=="ROOT_MENU"){
   		 $("#rightdis").append
   		("<input type='checkbox' name='"+id+"'  value="+child["rightCode"]+" />"+child["rightText"]);
   			$("#rightdis").append("</br></br>");
   		for(var mapSons in data){
   			var childs=data[mapSons];
   		
   			if(child["rightCode"]==childs["rightParentCode"]){
   		
   			 $("#rightdis").append
   			("<input type='checkbox' name='"+id+"'  value="+childs["rightCode"]+" />"+childs["rightText"]);
   		
   		
   			}
   		
   		
   		}
   		
   			$("#rightdis").append("</br></br>");
   	}
   }
//    for(var key in map){
//    aler(key);
//    $("#rightdis").append                                 
// ("<input type='checkbox' name='SysRole.roleId'  value="+map.key.rightCode+" />"+map.key.rightText);
   
//    for(var value in map){
   
//    $("#rightdis").append                                 
// ("<input type='checkbox' name='SysRole.roleId'  value="+map.key.rightCode+" />"+map.key.rightText);
   
//     }
   
// }
  }
});
$('#dlg').dialog('open');
					
					}
				}]
			});			
		})
	</script>
</body>

<!-- 弹出小窗口 -->
<form id="ff">
	<div id="dlg" class="easyui-dialog" title="权限管理" 
	style="width:600px;height:400px;padding:10px" closed="true"
			data-options="
			
				buttons: [{
					text:'Ok',
					iconCls:'icon-ok',
					handler:function(){
						sureright();
					}
				},{
					text:'Cancel',
					handler:function(){
						alert('cancel');
					}
				}]
			">
	



    
    
    <div  id="rightdis">
    
    
    </div>
    




	</div>
</form>


<script type="text/javascript">
	function sureright() {
		$.ajax({
			type : "POST",
			url :'/crmsystem/role/add.do' ,
			data : $('#ff').serialize(),
			success : function(msgs) {
				alert($('#ff').serialize());
				$('#dlg').dialog('close');
				$.messager.show({
					title : '提示信息',
					msg : '添加角色成功'
				});

				$("#dg").datagrid("reload");

				$('#dg').datagrid('clearSelections');
			}
});
	}
</script>
</html>