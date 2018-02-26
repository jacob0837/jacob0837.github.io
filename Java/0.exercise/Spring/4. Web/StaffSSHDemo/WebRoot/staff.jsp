<%@ page language="java" pageEncoding="GBK"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
<head>
	<html:base />
	<title>显示员工信息</title>
</head>

<body bgcolor="white">
	<table border="1" align="center">
		<!-- 表格题 -->
		<tr>
			<th>
				ID
			</th>
			<th>
				NAME
			</th>
			<th>
				GENDER
			</th>
		</tr>
		<!-- 循环产生表格行 -->
		<logic:present name="STAFFLIST" scope="session">
			<logic:iterate id="staff" name="STAFFLIST" scope="session">
				<tr>
					<td>
						<bean:write name="staff" property="id"/>
					</td>
					<td>
						<bean:write name="staff" property="name"/>
					</td>
					<td>
						<bean:write name="staff" property="gender"/>
					</td>
				</tr>
			</logic:iterate>
		</logic:present>
	</table>
</body>
</html:html>
