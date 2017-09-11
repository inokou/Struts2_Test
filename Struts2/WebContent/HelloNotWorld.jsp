<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Struts2　テスト</title>
</head>
<body>
	<h1>暗黒世界へようこそ！！</h1><br/>
	名前 <s:property value="name"/><br/><br/>
	住所<s:property value="address"/><br/><br/>

	一言「<s:property value="retMessage"/>」<br/><br/>

</body>
</html>