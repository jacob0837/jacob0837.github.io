<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>    
    <title>用户注册</title>
  </head>
  
  <body>
    <center>
    	<form action="login.springmvc" method="post">
    		<table border=2>
    			<tr>
    				<td>用户名</td>
    				<td>
    					<input type="text" name="username"/>
    				</td>
    			</tr>
    			<tr>
    				<td>密码</td>
    				<td>
    					<input type="password" name="userpassword"/>
    				</td>
    			</tr>
    			<tr align=center>
    				<td colspan=2>
    					<input type="submit" value="注册"/>
    					<input type="reset" value="重填"/>
    				</td>
    			</tr>
    		</table>
    	</form>
    </center>
  </body>
</html>
