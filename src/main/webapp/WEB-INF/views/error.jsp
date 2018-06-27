<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	response.setHeader("Expires", "-1");
	response.setHeader("Pragma", "no-cache");
	response.setHeader("Cache-Control", "no-cache");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="ja">
<head>
<title>イベント管理システム</title>
<jsp:include page="./common/header.jsp" />
</head>
<body>
	<br>
	<div class="container">
	<h3>ERROR</h3>
	<div class="alert alert-danger" role="alert"><p class="red"> <c:out value="${message}"/> </p></div>
	</div>
</body>
</html>
