<%@ page language="java" pageEncoding="GBK"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
  <head>
    <html:base />
    <title>员工注册</title>
  </head>
  
  <body>
   <form action="staff.do?method=insert" method="post">
   	<table border="1" align="center">
   		<tr>
   			<td>
   				姓名
   			</td>
   			<td>
   				<input type="text" name="name"/>
   			</td>
   		</tr>
   		<tr>
   			<td>
   				性别
   			</td>
   			<td>
   				<input type="radio" name="gender" value="m" checked/>男
   				<input type="radio" name="gender" value="f"/>女
   			</td>
   		</tr>
   		<tr>
   			<td>
   				<input type="submit" value="注册"/>
   			</td>
   			<td>
   				<input type="reset" value="重填"/>
   			</td>
   		</tr>
   	</table>
   </form>
  </body>
</html:html>






