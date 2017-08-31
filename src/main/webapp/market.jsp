<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<fmt:formatDate value="${job.jobtime }"pattern="yyyy-MM-dd HH:mm:ss"/> 
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
			url:'chanceController/findAllMarket.do',
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
	<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newUser()">New User</a>
	<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editUser()">Edit User</a>
	<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyUser()">Remove User</a>
</div>


<div id="dialog1"  class="easyui-dialog" style="width:400px;height:280px;padding:10px 20px" closed="true">

<form id="ff" method="post">   
	<div>   
        <label for="name">客户编号:</label>   
        <input class="easyui-validatebox" type="text" name="chcId" data-options="required:true" />   
    </div>  
    
    <div>   
        <label for="name">客户来源:</label>   
        <input class="easyui-validatebox" type="text" name="chcSource" data-options="required:true" />   
    </div>   
    <div>   
        <label for="name">客户名:</label>   
        <input class="easyui-validatebox" type="text" name="chcCustName" data-options="validType:'email'" />   
    </div>  
     
     <div>   
        <label for="name">客户概要:</label>   
        <input class="easyui-validatebox" type="text" name="chcTitle" data-options="required:true" />   
    </div>   
    <div>   
        <label for="name">成功概率:</label>   
        <input class="easyui-validatebox" type="text" name="chcRate" data-options="validType:'email'" />   
    </div>   
    
     <div>   
        <label for="name">联系人:</label>   
        <input class="easyui-validatebox" type="text" name="chcLinkman" data-options="required:true" />   
    </div>   
    <div>   
        <label for="telephoe">联系人号码:</label>   
        <input class="easyui-validatebox" type="text" name="chcTel" data-options="validType:'email'" />   
    </div>   
     <div>   
        <label for="name">机会描述:</label>   
        <input class="easyui-validatebox" type="text" name="chcDesc" data-options="required:true" />   
    </div> 
      
    <div>   
        <label for="name">创建人编号:</label>   
        <input class="easyui-validatebox" type="text" name="chcCreateId" data-options="validType:'email'" />   
    </div>   
    
    <div>   
        <label for="name">创建人:</label>   
        <input class="easyui-validatebox" type="text" name="chcCreateBy" data-options="required:true" />   
    </div> 
    
    <div>   
        <label for="name">创建时间:</label>   
        <input class="easyui-validatebox" type="text" name="chcCreateDate" data-options="required:true" />   
    </div> 
    
    <div>   
        <label for="name">指派人编号:</label>   
        <input class="easyui-validatebox" type="text" name="chcDueId" data-options="required:true" />   
    </div> 
    
    <div>   
        <label for="name">指派人名:</label>   
        <input class="easyui-validatebox" type="text" name="chcDueTo" data-options="required:true" />   
    </div> 
    
    <div>   
        <label for="name">指派时间:</label>   
        <input class="easyui-validatebox" type="text" name="chcDueDate" data-options="required:true" />   
    </div> 
    
    <div>   
        <label for="name">状态:</label>   
        <input class="easyui-validatebox" type="text" name="chcStatus" data-options="required:true" />   
    </div> 
</form>  
</div>

	<script>
		function newUser(){
			
			$('#dialog1').dialog({
					title: '新增用户',    
				    width: 600,    
				    height: 400,    
				    closed: false,    
				    cache: false,       
				    modal: true ,
				    buttons:[{
				         text:'保存',
				         handler:function(){
				         	/* $("#ff").form('submit',{
				         		url:'chanceController/add.do',
				         		onSubmit:function(){
				         		},
				         		success:function(data){
				         			alert("data")
				         		}
				         	
				         	
				         	
				         	}) */
				         	$.ajax({
				         		data : $('#ff').serialize(),
				         		type : 'post',
				         		url : 'chanceController/add.do',
				         		success:function(data){
				         			alert("data")
				         		}
				         	})
				         }
				        },{text:'关闭',
				          closed:false	
				        }
				    
				    
				    ]
				    
				    
				
			
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
