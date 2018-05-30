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

	<form:form modelAttribute="form" class="form-horizontal" name="form"
		action="${pageContext.request.contextPath}/moneyReception/store" method="POST">

		<div class="container">

			<!-- 画面タイトル -->
			<!-- <div class="row">
				<div class="col-md-offset-1 col-md-10">
					<h3>収支登録</h3>
				</div>
			</div> -->

			<!-- メッセージ領域 -->
			<div class="row">
				<div class="col-md-offset-1 col-md-10">
					<%@include file="/WEB-INF/fragment/messages.jspf"%>
				</div>
			</div>

			<div class="row">
				<div class="col-md-offset-1 col-md-10">

					<div class="panel panel-success">
						<div class="panel-heading">
							<h4><c:out value="${form.moneyReceptionDate}" /></h4>
							<form:hidden path="moneyReceptionDate"/>
						</div>
						<div class="panel-body">

							<!-- タブ・メニュー -->
							<ul class="nav nav-tabs">
								<li class="active"><a href="#spending" data-toggle="tab" >支出</a></li>
								<li><a href="#income" data-toggle="tab" >収入</a></li>
							</ul>

							<!-- タブ内容 -->
							<div class="tab-content">
								<div class="tab-pane active" id="spending">
									<table class="table table-striped table-bordered table-hover table-condensed panel">
										<thead class="main-background-color">
											<tr>
												<th class="text-center">No</th>
												<th class="text-center">項目</th>
												<th class="text-center">金額</th>
												<th class="text-center">備考</th>
											</tr>
										</thead>
										<tbody>
											<c:forEach begin="0" end="9" varStatus="status">
												<tr>
													<td>${status.count}</td>
													<td><form:select path="genreId[${status.index}]"
															class="form-control" items="${selectSpendingGenreList}"
															itemLabel="label" itemValue="value"
															cssErrorClass="form-control error-input" /></td>
													<td><form:input path="amount[${status.index}]"
															class="form-control" maxlength="9"
															cssErrorClass="form-control error-input" /></td>
													<td><form:input path="supplement[${status.index}]"
															class="form-control" maxlength="20"
															cssErrorClass="form-control error-input" /></td>
												<tr>
											</c:forEach>
										</tbody>
									</table>
								</div>

								<div class="tab-pane" id="income">
									<table class="table table-striped table-bordered table-hover table-condensed panel">
										<thead class="main-background-color">
											<tr>
												<th class="text-center">No</th>
												<th class="text-center">項目</th>
												<th class="text-center">金額</th>
												<th class="text-center">備考</th>
											</tr>
										</thead>
										<tbody>
											<c:forEach begin="10" end="14" varStatus="status">
												<tr>
													<td>${status.count + 10}</td>
													<td><form:select path="genreId[${status.index}]"
															class="form-control" items="${selectIncomeGenreList}"
															itemLabel="label" itemValue="value"
															cssErrorClass="form-control error-input" /></td>
													<td><form:input path="amount[${status.index}]"
															class="form-control" maxlength="9"
															cssErrorClass="form-control error-input" /></td>
													<td><form:input path="supplement[${status.index}]"
															class="form-control" maxlength="20"
															cssErrorClass="form-control error-input" /></td>
												<tr>
											</c:forEach>
										</tbody>
									</table>
							</div>

						</div>
					</div>
				</div>
			</div>
		</div>
		</div>

		<form:hidden path="moneyReceptionId"/>
		<form:hidden path="userId"/>
		<form:hidden path="moneyReceptionFlag"/>
		<div class="row">
			<div class="col-md-offset-1 col-md-10" align="right">
				<a type="button" class="btn btn-info" onClick="resistration()">
					<i class="glyphicon glyphicon-plus"></i>&nbsp;&nbsp;&nbsp;登録する
				</a>
			</div>
		</div>

	</form:form>

	<script type="text/javascript">

		function resistration() {
			$(".btn").prop("disabled", true)
			document.form.submit();
		}

		/* function receptionFlag(name) {
			if(name == 'spending'){
				$('#moneyReceptionFlag').val(true);

			}else if(name == 'income'){
				$('#moneyReceptionFlag').val(false);
			}
		} */

	</script>

</body>
</html>