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
	<script src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
<style type="text/css">
</style>
<script type="text/javascript">
	$(function() {
		$("#nametb").keyup(function() {
			var svrCustName = $("#nametb").val();

			$.ajax({
				type : 'Post',
				url : "likeByName.do", //提交的页面/方法名
				data : "svrCustName=" + $('#nametb').val(), //参数（如果没有参数：null）
				//dataType:"json",
				error : function() { //请求失败处理函数
					alert("数据加载失败");
					alert(svrCustName)
				},
				success : function(data) { //请求成功后处理函数。
					if (data.length > 0) {
						//alert(data);
						var layer = "";
						layer = "<table id='khts' '";
						for (i = 0; i < data.length; i++) {
							layer += "<tr class='line' ><td>" + data[i].custName + "</td></tr>";

						}
						layer += "</table>";

						$("#searchresult").empty();
						$("#searchresult").append(layer).attr();
						

					} else {
						$("#searchresult").empty();
						$("#searchresult").append("<table id='khts'><tr class='line'><td>没有此客户</td></tr></table>").attr();
						alert(111)

					}
				}
			});
		});

		$('#cc').combobox({
			url : 'findBasDict.do',
			valueField : 'dictValue',
			textField : 'dictValue',
			onLoadSuccess : function(data) {
				if (data) {
					$('#cc').combobox('setValue', data[0].dictValue);
				}
			}
		});
		$.ajax({
			type : "POST",
			url : "findServiceId",
			success : function(msg) {
				$("#svr").text(20);
			}
		});

	});
	
$("#khts td").click(function(){
        alert("table td值："+$(this).text());
      });
</script>
</head>

<body>
	<script type="text/javascript">
	
function getTdValue(id) 
{ 
//var tableId = document.getElementById("khts"); 
alert(id)
var str = ""; 
/* for(var i=0;i<tableId.rows.length;i++) 
{ 
alert(tableId.rows[i].cells[0].innerHTML); 
}  */
} 
	
		$.fn.datebox.defaults.formatter = function(date) {
			var y = date.getFullYear();
			var m = date.getMonth() + 1;
			var d = date.getDate();
			return y + '/' + m + '/' + d;
		}
	</script>
	<div id="p" class="easyui-panel" title="My Panel"
		style="width:500px;height:300px;padding:10px;background:#fafafa;"
		data-options="iconCls:'icon-save',closable:true,    
                collapsible:true,minimizable:true,maximizable:true,url:''">
		<form id="ff" method="post" novalidate>
			<table border="1" bordercolor="black" width="450" cellspacing="0"
				cellpadding="5">
				<tr>
					<td>编号</td>
					<td id="svr"></td>
					<td>服务类型</td>
					<td><input id="cc" name="dept"></td>
				</tr>
				<tr>
					<td>概要</td>
					<td><input type="text" style="width: 100%;padding:0px;"></td>
					<td colspan="2"></td>
				</tr>
				<tr>
					<td>客户</td>
					<td><input type="text" style="width: 100%;padding:0px;"
						name="svrCustName" id="nametb">

						<div id="searchresult"></div></td>
					<td>状态</td>
					<td>新建</td>
				</tr>
				<tr>
					<td>详细描述</td>
					<td colspan="3"><textarea style="width: 100%;padding:0px;"></textarea></td>
				</tr>
				<tr>
					<td>创建人</td>
					<td>cyl 登录的用户</td>
					<td>创建时间</td>
					<td><input class="easyui-datetimebox" name="birthday"
						data-options="required:true,showSeconds:false" showSeconds="true"
						value="today" style="width:100%"></td>
				</tr>
			</table>

		</form>
	</div>
	
	<table id="khts" width="708px;" cellpadding="5" cellspacing="1">
    <tbody>
      <tr bgcolor="#DEE9F4" id="tr_1">
        <td align="center"> 日</td>
        <td align="center"> 一 </td>
        <td align="center"> 二 </td>
        <td align="center"> 三 </td>
        <td align="center"> 四 </td>
        <td align="center"> 五 </td>
        <td align="center"> 六 </td>
      </tr>
      <tr bgcolor="#DEE9F4" id="tr_2">
        <td align="center">   </td>
        <td align="center">   </td>
        <td align="center">   </td>
        <td align="center"> 1 </td>
        <td align="center"> 2 </td>
        <td align="center"> 3 </td>
        <td align="center"> 4</td>
      </tr>
      <tr bgcolor="#DEE9F4" id="tr_3">
        <td align="center"> 5 </td>
        <td align="center"> 6 </td>
        <td align="center"> 7 </td>
        <td align="center"> 8 </td>
        <td align="center"> 9 </td>
        <td align="center" bgcolor="red">10</td>
        <td align="center">11</td>
      </tr>
      <tr bgcolor="#DEE9F4" id="tr_4">
        <td align="center"> 12 </td>
        <td align="center"> 13 </td>
        <td align="center"> 14 </td>
        <td align="center"> 15 </td>
        <td align="center"> 16 </td>
        <td align="center"> 17 </td>
        <td align="center"> 18 </td>
      </tr>
    </tbody>
  </table>
</body>



</html>