<%@ page language="java" pageEncoding="GBK"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
<head>
	<html:base />
	<title>��ʾԱ����Ϣ</title>
</head>

<body bgcolor="white">
	<table border="1" align="center">
		<!-- ����� -->
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
		<!-- ѭ����������� -->
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
