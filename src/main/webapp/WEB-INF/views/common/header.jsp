<%@ page contentType="text/html;charset=Windows-31J"
	pageEncoding="UTF-8"%>
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


<head>
<style>
/* Pull up  */
div.pullUp a:before {
	position: absolute;
	width: 100%;
	height: 2px;
	left: 0px;
	bottom: 0px;
	content: '';
	background: #FFF;
	opacity: 0.3;
	transition: all 0.3s;
}

div.pullUp a:hover:before {
	height: 100%;
}

.navbar-aptx {
	background-color: #FB8562;
	border-color: #FB8562;
	font-size: 18px;
	font-family: 'Verdana', sans-serif;
}

.navbar-aptx .navbar-brand {
	color: #ffffff;
}

.navbar-aptx .navbar-brand:hover, .navbar-aptx .navbar-brand:focus {
	color: #FDE99A;
	background-color: transparent;
}

.navbar-aptx .navbar-nav>li>a {
	color: #ffffff;
}

.navbar-aptx .navbar-nav>li>a:hover, .navbar-aptx .navbar-nav>li>a:focus
	{
	color: #FDE99A;
	background-color: transparent;
}

.navbar-aptx .navbar-nav>.active>a, .navbar-aptx .navbar-nav>.active>a:hover,
	.navbar-aptx .navbar-nav>.active>a:focus {
	color: #555;
	background-color: #FDE99A;
}

.navbar-brand {
	background: url("./resources/img/yuruneko.png") no-repeat left
		center;
	background-size: 80px 80px;
}


/* Top and Bottom borders go out */
div.topBotomBordersOut a:before, div.topBotomBordersOut a:after
{
    position: absolute;
    left: 0px;
    width: 100%;
    height: 2px;
    background: #FFF;
    content: "";
    opacity: 0;
    transition: all 0.3s;
}

div.topBotomBordersOut a:before
{
    top: 0px;
    transform: translateY(10px);
}

div.topBotomBordersOut a:after
{
    bottom: 0px;
    transform: translateY(-10px);
}

div.topBotomBordersOut a:hover:before, div.topBotomBordersOut a:hover:after
{
    opacity: 1;
    transform: translateY(0px);
}


</style>
</head>








<div>
	<!-- ナビゲーションバー -->
	<nav class="navbar navbar-aptx">
		<div class=topBotomBordersOut>
			<div class="navbar-header">
				<a class="navbar-brand" href="${pageContext.request.contextPath}/">&emsp;&emsp;&emsp;&emsp;TOP
				</a>
			</div>
		</div>
		<!-- メニュー -->
		<div class="container topBotomBordersOut">
			<ul class="nav navbar-nav">
				<li><a href="${pageContext.request.contextPath}/account">&emsp;ACCOUNT</a></li>
				<li><a
					href="${pageContext.request.contextPath}/moneyReception/create/${loginUserDto.lineId}">MONEY
						RECEPTION</a></li>
				<li><a href="${pageContext.request.contextPath}/graph">GRAPH</a></li>
			</ul>

			<%-- 右側 --%>
			<div class="navbar-right">
				<c:if test="${loginUserDto.loginFlg}">
					<ul class="nav navbar-nav">
						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown" role="button"><span
								class="glyphicon glyphicon-user"> <c:out
										value="${loginUserDto.lineName}" />
							</span><span class="caret"></span></a>
							<ul class="dropdown-menu" role="menu">
								<li><a href="${pageContext.request.contextPath}/logout"><span
										class="glyphicon glyphicon-log-out">&nbsp;</span>Log out</a></li>
							</ul></li>
					</ul>
				</c:if>
			</div>
		</div>
	</nav>
</div>