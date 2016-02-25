<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<title>Login</title>
</head>
<body>
<s:form action="LoginAction">
<s:textfield label="ID" name="userId" />
<s:textfield label="パスワード" name="password" />
<s:submit value="確認" />
</s:form>
</body>
</html>
