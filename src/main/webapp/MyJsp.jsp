<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'MyJsp.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
	
	<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/jquery.ocupload-1.1.2.js"></script>
      
    <script>
      $(function() {
       $('#importBnt').upload({
                name: 'upload',//上传组件的name属性，即<input type='file' name='file'/>
                action: 'userAction_importExcel',//向服务器请求的路径
                enctype: 'multipart/form-data',//mime类型，默认即可
               
                onComplete: function() {
                    alert("success");
                
                }//提交表单完成后触发的事件
             
        });
      });
      </script>  
  </head>
  
  <body>
     <input type="button" value="导入" id="importBnt">
     
     
  </body>
</html>
