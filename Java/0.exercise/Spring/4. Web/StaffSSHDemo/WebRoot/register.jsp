<%@ page language="java" pageEncoding="GBK"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
  <head>
    <html:base />
    <title>Ա��ע��</title>
  </head>
  
  <body>
   <form action="staff.do?method=insert" method="post">
   	<table border="1" align="center">
   		<tr>
   			<td>
   				����
   			</td>
   			<td>
   				<input type="text" name="name"/>
   			</td>
   		</tr>
   		<tr>
   			<td>
   				�Ա�
   			</td>
   			<td>
   				<input type="radio" name="gender" value="m" checked/>��
   				<input type="radio" name="gender" value="f"/>Ů
   			</td>
   		</tr>
   		<tr>
   			<td>
   				<input type="submit" value="ע��"/>
   			</td>
   			<td>
   				<input type="reset" value="����"/>
   			</td>
   		</tr>
   	</table>
   </form>
  </body>
</html:html>






