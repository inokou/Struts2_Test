<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello Struts2</title>
</head>
<body>
   <h1>Struts2 テスト</h1>
   <form action="hello">
      <label for="name">適当に入力</label><br/>
      名前<input type="text" name="name"/><br/><br/><br/>
      住所<input type="text" name="address"/><br/>
      <input type="submit" value="スタート"/>
   </form>
</body>
</html>