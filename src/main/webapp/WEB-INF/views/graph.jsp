<%@ page contentType="text/html;charset=Windows-31J"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
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

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>グラフ</title>
<script type="text/javascript">
google.charts.load('current', {'packages':['corechart']});
google.charts.setOnLoadCallback(drawChart);
					function drawChart() {
						   var data = null;
						   var chart = null;
						   var options = {
						       title: '',
						       curveType: 'function',
						   };
						   var defaultDataArray = [];

						   // タイトルの設定
						   this.SetTitle = function(title){
						       options.title = title;
						   }

						   // 初期データ配列の設定
						   this.SetDefaultDataArray = function(data){
						       defaultDataArray = data;
						   }

						   // setOnLoadCallbackにセットするメソッド(関数を返す)
						   this.Get = function(){
						       return function(){
						           data = google.visualization.arrayToDataTable(defaultDataArray);
						           chart = new google.visualization.PieChart(document.getElementById('piechart'));
						           chart.draw(data, options);
						       }
						   }

						}

						var dc = new drawChart();
						dc.SetTitle('今月の支出');
						dc.SetDefaultDataArray(function(){
						  var wd = [];
						  wd.push(['Amount', '支出合計']);
						  var json = ${json};
						  for(var i in json){
						     wd.push([json[i].genreName, json[i].sum]);
						  }
						  return wd;
						}());

						//Load the Visualization API and the corechart package.
						google.charts.load('current', {'packages':['corechart']});
						//Set a callback to run when the Google Visualization API is loaded.
						google.charts.setOnLoadCallback(dc.Get());


				</script>
</head>
<body>
	<div class="container">
		<div class="row">
			<div id="piechart" style="width: 80%; height: 500px; margin: auto;"></div>
		</div>
		<div class="row">
			<div class="col-md-offset-3 col-md-6">
				<table
					class="table table-striped table-bordered table-hover table-condensed">
					<tr>
						<th colspan="2" bgcolor="#FE9A2E">今月の支出</th>
					</tr>
					<c:forEach var="amountDto" items="${amountDtoList}"
						varStatus="status">
						<tr>
							<th class="text-center">${amountDto.genreName}</th>
							<td class="text-center">${amountDto.sum}円</td>
						</tr>
					</c:forEach>
					<tr>
					<th colspan="2"  bgcolor="#F3E2A9" class="text-right">合計:${amountMoney}円</th>
					</tr>
				</table>

			</div>
		</div>
	</div>
</body>
</html>