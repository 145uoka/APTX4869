<%@ page contentType="text/html;charset=Windows-31J" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="/WEB-INF/fragment/taglib-includes.jspf"%>
<%@ page session="true"%>
<html>
<head>
<link href='<c:url value="/resources/css/common/layout.css"/>' rel="stylesheet">

	<title>Home</title>
</head>
<body>
<h1>
	Hello world!
</h1>

<P>  The time on the server is ${serverTime}. </P>

<c:if test="${loginUserDto.loginFlg}">
<P>ようこそ&nbsp;<c:out value="${loginUserDto.lineName}"></c:out>&nbsp;さん</P>
</c:if>


<div class="demo01">
  <a href="${pageContext.request.contextPath}/login">サンプル</a>
</div>
</body>
</html>
