<%@ page contentType="text/html;charset=Windows-31J" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@include file="/WEB-INF/fragment/taglib-includes.jspf"%>


<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link
	href='<c:url value="/resources/css/vendor/bootstrap/bootstrap.css"/>'
	rel="stylesheet">
<link
	href='<c:url value="/resources/css/vendor/jquery/jquery-ui-1.10.4.custom.min.css"/>'
	rel="stylesheet">
<link
	href='<c:url value="/resources/css/vendor/sticky_footer/sticky-footer.css"/>'
	rel="stylesheet">
<link
	href='<c:url value="/resources/css/vendor/bootstrap_datepicker/datepicker.css"/>'
	rel="stylesheet">
<link href='<c:url value="/resources/css/color/templateColor.css"/>'
	rel="stylesheet">

<script type="text/javascript"
	src='<c:url value="/resources/js/vendor/jquery/jquery-1.11.1.min.js"/>'></script>
<script type="text/javascript"
	src='<c:url value="/resources/js/vendor/jquery/jquery-ui.min.js"/>'></script>
<script type="text/javascript"
	src='<c:url value="/resources/js/vendor/bootstrap/bootstrap.min.js"/>'></script>
<script type="text/javascript"
	src='<c:url value="/resources/js/vendor/bootstrap/bootstrap-datepicker.js"/>'></script>
<script type="text/javascript"
	src='<c:url value="/resources/js/vendor/bootstrap/bootstrap-datepicker.ja.min.js"/>'></script>
<script type="text/javascript"
	src='<c:url value="/resources/js/vendor/bootstrap_tab/tab.js"/>'></script>
<script type="text/javascript"
	src='<c:url value="/resources/js/common/common.js"/>'></script>
<script type="text/javascript"
	src='<c:url value="/resources/js/vendor/googleChart/loader.js"/>'></script>

<div>
  <!-- ナビゲーションバー -->
  <nav class="navbar navbar-default">
    <div class="container-fluid">
      <div class="navbar-header">
        <a class="navbar-brand" href="${pageContext.request.contextPath}/">TOP</a>
      </div>
      <!-- メニュー -->
      <ul class="nav navbar-nav">
        <li><a href="${pageContext.request.contextPath}/moneyReception/create/${loginUserDto.lineId}">収支登録</a></li>
      </ul>

      <%-- 右側 --%>
          <div class="navbar-right">
            <c:if test="${loginUserDto.loginFlg}">
                <ul class="nav navbar-nav">
                  <li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button"><span class="glyphicon glyphicon-user"> <c:out
                          value="${loginUserDto.lineName}" />
                    </span><span class="caret"></span></a>
                    <ul class="dropdown-menu" role="menu">
                      <li><a href="${pageContext.request.contextPath}/logout"><span class="glyphicon glyphicon-log-out">&nbsp;</span>Log out</a></li>
                    </ul></li>
                </ul>
            </c:if>
          </div>
    </div>
  </nav>
</div>