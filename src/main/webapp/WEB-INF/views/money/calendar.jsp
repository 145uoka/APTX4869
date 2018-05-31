<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="/WEB-INF/fragment/taglib-includes.jspf"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="utf-8">
<jsp:include page="../common/common.jsp" />
</head>

<body>
	<!-- ナビゲーションバー -->
	<jsp:include page="../common/header.jsp" />

	<form:form modelAttribute="form" class="form-horizontal" name="form" method="POST">

		<div class="container">

			<!-- メッセージ領域 -->
			<div class="row">
				<div class="col-md-offset-1 col-md-10">
					<%@include file="/WEB-INF/fragment/messages.jspf"%>
				</div>
			</div>

			<div class="row">
				<div class="col-md-offset-2 col-md-8">
					<div id="calendar"></div>
				</div>
			</div>

			<div class="row">
				<div class="col-md-offset-1 col-md-10">
					<div class="panel panel-default">
						<div class="panel-heading">
							<div class="panel-title">収支情報</div>
						</div>

						<div class="panel-body">

							<div class="form-group">
								<label class="col-md-3 control-label">収入</label>
								<div class="col-md-2 form-control-static">
									<c:out value="${form.income}" />円
								</div>
								<label class="col-md-2 control-label">残予算</label>
								<div class="col-md-2 form-control-static">
									<c:out value="${form.remainingBudget}" />円
								</div>
							</div>

							<div class="form-group">
								<label class="col-md-3 control-label">支出</label>
								<div class="col-md-2 form-control-static">
									<c:out value="${form.spending}" />円
								</div>
							</div>

							<div class="form-group">
								<label class="col-md-3 control-label">定期収入</label>
								<div class="col-md-2 form-control-static">
									<c:out value="${form.regularlyIncome}" />円
								</div>
								<a type="button" class="btn btn-edit" onClick="regularlyUpdate()">
									<i class="glyphicon glyphicon-plus"></i>&nbsp;&nbsp;&nbsp;修正する
								</a>
							</div>

							<div class="form-group">
								<label class="col-md-3 control-label">定期支出</label>
								<div class="col-md-2 form-control-static">
									<c:out value="${form.regularlySpending}" />円
								</div>
								<a type="button" class="btn btn-edit" onClick="regularlyUpdate()">
									<i class="glyphicon glyphicon-plus"></i>&nbsp;&nbsp;&nbsp;修正する
								</a>
							</div>

							<div class="form-group">
								<label class="col-md-3 control-label">現在実残高</label>
								<div class="col-md-2 form-control-static">
									<c:out value="${form.balance}" />円
								</div>
								<a type="button" class="btn btn-edit" onClick="receptionEdit()">
									<i class="glyphicon glyphicon-plus"></i>&nbsp;&nbsp;&nbsp;差額修正
								</a>
							</div>

							<div class="form-group">
								<label class="col-md-3 control-label">予定残高</label>
								<div class="col-md-2 form-control-static">
									<c:out value="${form.estimate}" />円
								</div>
							</div>

						</div>
					</div>
				</div>
			</div>

		</div>

		<form:hidden path="userId"/>
		<form:hidden path="moneyReceptionDate"/>

	</form:form>

	<script type="text/javascript">

		function regularlyUpdate() {
			$(".btn").prop("disabled", true)
			document.form.action = "${pageContext.request.contextPath}/";
			document.form.submit();
		}

		function receptionEdit() {
			$(".btn").prop("disabled", true)
			document.form.action = "${pageContext.request.contextPath}/moneyReception/create/${form.lineId}";
			document.form.submit();
		}


		$(function() {
			$('#calendar').fullCalendar({
				header : {
					left : 'prevYear,prev',
					center : 'title',
					right : 'next,nextYear'
				},
				footer : {

				},

				height : 500,
				contentHeight : "auto",

				theme : 'bootstrap3',
				prev : 'glyphicon-chevron-left',
				next : 'glyphicon-chevron-right',
				prevYear : 'glyphicon-backward',
				nextYear : 'glyphicon-forward',

				dayClick : function(date) {
					$('#moneyReceptionDate').val(date.format());
					document.form.action = "${pageContext.request.contextPath}/";
					document.form.submit();
				},
			});
		});

	</script>
<jsp:include page="../common/footer.jsp" />
</body>
</html>