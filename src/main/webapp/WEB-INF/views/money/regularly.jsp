<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="/WEB-INF/fragment/taglib-includes.jspf"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="utf-8">
<jsp:include page="../common/common.jsp" />
<style>
thead {
	background: #9EE1AB
}

thead.b {
	background: #E8C5E6
}

a.btn {
	background-color: #F89A8E;
	color: #FFFFFF;
}

a.btn:hover {
	background-color: #FCCB50;
	color: #FFFFFF;
}

a.delete {

	color: #F78181;
}

a.delete:hover {
	color: #FCCB50;
}

.panel-warningg>.panel-heading {
	background-color: #CBDCFD;
}

</style>
</head>

<body>
	<!-- ナビゲーションバー -->
	<jsp:include page="../common/header.jsp" />

	<form:form modelAttribute="form" class="form-horizontal" name="form"
		action="${pageContext.request.contextPath}/regularly/store"
		method="POST">

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

					<div class="panel panel-warningg">
						<div class="panel-heading">
							<h4>定期支出</h4>
						</div>
						<br>
						<div class="panel-body">

							<!-- タブ・メニュー -->
							<ul class="nav nav-tabs">
								<li class="active"><a href="#spending" data-toggle="tab">支出</a></li>
								<li><a href="#income" data-toggle="tab">収入</a></li>
							</ul>

							<!-- タブ内容 -->
							<div class="tab-content" >
								<div class="tab-pane active" id="spending">
									<table
										class="table table-striped table-bordered table-hover table-condensed panel">
										<thead>
											<tr>
												<th class="text-center">No</th>
												<th class="text-center">日付</th>
												<th class="text-center">金額</th>
											</tr>
										</thead>
										<tbody class="b">
											<c:forEach begin="0" end="4" varStatus="status">
												<tr>
													<td>${status.count}</td>
													<td><form:select
															path="accountingDate[${status.index}]"
															class="form-control" items="${list}" itemLabel="label"
															itemValue="accountingDate" /></td>
													<td><form:input path="amount[${status.index}]"
															class="form-control" maxlength="9"
															cssErrorClass="form-control error-input" /></td>
												<tr>
											</c:forEach>
										</tbody>
									</table>
								</div>

								<div class="tab-pane" id="income">
									<table
										class=" table table-striped table-bordered table-hover table-condensed panel" >
										<thead class="b">
											<tr>
												<th class="text-center">No</th>
												<th class="text-center">日付</th>
												<th class="text-center">金額</th>
											</tr>
										</thead>
										<tbody>
											<c:forEach begin="5" end="9" varStatus="status">
												<tr>
													<td>${status.count + 5}</td>
													<td><form:select
															path="accountingDate[${status.index}]"
															class="form-control" items="${list}" itemLabel="label"
															itemValue="accountingDate" /></td>
													<td><form:input path="amount[${status.index}]"
															class="form-control" maxlength="9"
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

		<form:hidden path="userId" />
		<form:hidden path="regularlyFlag" />
		<div class="row">
			<div class="col-md-offset-1 col-md-10" align="center">
				<a type="button" class="btn" onClick="resistration()"> <i
					class="glyphicon glyphicon-plus"></i>&nbsp;&nbsp;&nbsp;登録する
				</a>
			</div>
		</div>
		<br>
		<br>

		<!-- テーブル -->
		<c:if test="${!empty regularlyList}">
			<div class="row">
				<div class="col-md-offset-3 col-md-6">
					<table
						class="table table-striped table-bordered table-hover table-condensed" style="font-size : 15px;">
						<thead>
							<tr style="background-color: #D8F781;">
								<th class="text-center">収支</th>
								<th class="text-center ">日付</th>
								<th class="text-center">金額</th>
								<th class="text-center"></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="regularlyList" items="${regularlyList}"
								varStatus="status">
								<tr>
								<c:choose>
										<c:when test="${regularlyList.regularlyFlag == 'false'}">
											<td class="text-center" >支出</td>
										</c:when>
										<c:otherwise>
											<td class="text-center" >収入</td>
										</c:otherwise>
									</c:choose>
									<c:choose>
										<c:when test="${regularlyList.accountingdate == '99'}">
											<td class="text-center" ><c:out
													value="${lastDayOfMonth}" />日</td>
										</c:when>
										<c:otherwise>
											<td class="text-center" ><c:out
													value="${regularlyList.accountingdate}" />日</td>
										</c:otherwise>
									</c:choose>

									<td class="text-center"><c:out
											value="${regularlyList.amount}" />円</td>
									<td class="text-center"><a class="delete"
										onClick="deleteConfirmation('${regularlyList.propertyId}')">
											<i class="glyphicon glyphicon-trash"></i>
									</a></td>
								</tr>

							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</c:if>

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
	<script type="text/javascript">
		function deleteConfirmation(propertyId) {
			// 「OK」時の処理終了
			if (window.confirm('削除しますか？')) {
				document.form.action = "${pageContext.request.contextPath}/regularly/delete/"
						+ propertyId;
				document.form.method = "post";
				document.form.submit();
			}
		}
	</script>
	<jsp:include page="../common/footer.jsp" />
</body>
</html>