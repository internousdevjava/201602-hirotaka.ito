<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Successful Login</title>
</head>
<body>
   ログインしました。<br>
<s:property value="#session.user_name"/>さん<br>

<s:form action="HistoryAction">
<s:submit value="購入履歴" />
</s:form>

<INPUT type="button" value="戻る" onClick="history.back()">

</body>
</html>