<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>履歴確認画面</title>
<meta charset="UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/login.css">
</head>
<body>
<%
request.setCharacterEncoding("UTF-8");
String name = request.getParameter("name");
String sentaku = request.getParameter("sentaku");
out.println("名前：" + name + "<br>");
out.println("選択：" + sentaku + "<br>");
%>
</body>
</html>