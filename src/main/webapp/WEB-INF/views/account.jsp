<%@ page contentType="text/html;charset=Windows-31J"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="./common/header.jsp" />
<link href='<c:url value="/resources/css/form.css"/>' rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>アカウント</title>
<style>
.title h3 {
	position: relative;
	color: #333333;
	text-shadow: 0 0 2px white;
	background: #FBF0B5;
	z-index: -4;
	border-radius: 0 10px 10px;
}

.title h3:before {
	content: "";
	position: absolute;
	background: #FBE259;
	width: 50px;
	height: 50px;
	border-radius: 50%;
	top: 50%;
	/* border: dashed 1px white; */
	left: -15px;
	-moz-transform: translateY(-50%);
	-webkit-transform: translateY(-50%);
	-ms-transform: translateY(-50%);
	transform: translateY(-50%);
	z-index: -1;
}

a.cp_btn {
	display: block;
	position: relative;
	width: 160px;
	padding: 0.5em;
	text-align: center;
	text-decoration: none;
	color: #fff;
	border: 1px solid #FDA543;
	background: #FDA543;
	overflow: hidden;
	z-index: 1 !important;
}

a.cp_btn:after {
	content: "";
	position: absolute;
	top: 50%;
	left: 50%;
	height: 0;
	width: 100%;
	background: #fff;
	opacity: 0;
	transform: translateX(-50%) translateY(-50%) rotate(45deg);
	transition: 0.3s;
	z-index: -1;
}

a.cp_btn:hover {
	color: #555e64;
}

a.cp_btn:hover:after {
	height: 200%;
	opacity: 1;
}

a.cp_btn:active:after {
	height: 350%;
	opacity: 1;
}
</style>

</head>
<body>
	<div class="container">
		<div class="box">
			<div class="row">
				<br>
				<div class="ribbon3 col-md-offset-1">
					<h3>アカウント設定</h3>
				</div>
				<div class="col-md-8 col-md-offset-2">
					<form:form modelAttribute="form" method="post" name="form"
						class="form-horizontal"
						action="${pageContext.request.contextPath}/registerAccount">
						<div class="row">
							<div
								class="form-group <ext:isErrors path='clientId' value='has-error'/> ">
								<br> <br> <br>
								<div class="row">
									<div class="title">
										<h3>&nbsp;&nbsp;アカウント選択</h3>
										<div class="col-md-5 col-md-offset-1">
											<form:errors path="clientId" element="div"
												cssClass="text-danger" />
										</div>
									</div>
									<br> <br>
									<div class="client col-md-offset-1">
										<div class="radio-inline">
											<form:radiobutton path="clientId" id="radio1" value="few" />
											<label for="radio1" class="label">通知ゆるめ</label><img style = "cursor:default;"
												src="./resources/img/yuruneko.png"  width="200" height="200">
										</div>
										<div class="radio-inline">
											<form:radiobutton path="clientId" id="radio2" value="many" />
											<label for="radio2" class="label">通知しっかり</label><img style = "cursor:default;"
												src="./resources/img/majineko.png"  width="200" height="200">
										</div>
									</div>
								</div>
							</div>
							<br> <br>

							<div class="row">
								<div
									class="form-group <ext:isErrors path='settlementDate' value='has-error'/> ">
									<div class="title">
										<h3>&nbsp;&nbsp;月の締め日</h3>
									</div>
									<div class="col-md-5 col-md-offset-1">
										<form:errors path="settlementDate" element="div"
											cssClass="text-danger" />
									</div>
									<br> <br>

									<div class="col-md-5 col-md-offset-2">
										<form:select path="settlementDate" class="form-control"
											items="${list}" itemLabel="label" itemValue="settlementDate" />
									</div>
								</div>
							</div>
							<br> <br>

							<div class="row">
								<div
									class="form-group <ext:isErrors path='budget' value='has-error'/> ">
									<div class="title">
										<h3>&nbsp;&nbsp;毎月使える金額</h3>
									</div>
									<div class="col-md-5 col-md-offset-1">
										<form:errors path="budget" element="div"
											cssClass="text-danger" />
									</div>
									<br>
									<div class="budget col-md-offset-2">
									<form:input path="budget" value='${form.budget}' type="number"
											class="validate[required,custom[onlyLetter],length[0,100]] feedback-input"
											placeholder="予算を半角数字で入力してください" /> <label>※未入力の場合は制限なしとなります。</label>
									</div>
								</div>
							</div>
							<br> <br> <br>

							<div class="row">
								<div class="col-md-offset-5">
									<a href="javascript:form.submit()"
										style="font-size: 18pt; font-weight: bold;" class="cp_btn">登録</a>
								</div>
							</div>


						</div>
					</form:form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>