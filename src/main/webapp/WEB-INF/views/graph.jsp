<%@ page contentType="text/html;charset=Windows-31J"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<jsp:include page="./common/header.jsp" />

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
						       colors: [
						                '#AFE367',
						                '#F4E954',
						                '#FB8761',
						                '#FF8D8E',
						                '#ACDAE5'
						            ]
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
						var targetMonth = ${graphDto.year} + "年" + ${graphDto.month} + "月";
						dc.SetTitle(targetMonth + 'の支出');
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
				<label>指定月の締め日までを一月としています</label>
					<div id="piechart" style="width: 80%; height: 500px; margin: auto;"></div>
				</div>
				<div class="row">
					<div class="col-md-offset-3 col-md-6">

						<table
							class="table table-striped table-bordered table-hover table-condensed">
							<thead>
								<tr>
									<th colspan="2" bgcolor="#FE9A2E"><c:out
											value="     ${graphDto.year}年 ${graphDto.month}月の支出"></c:out></th>
								</tr>

								<tr >
									<th class="text-center"><c:out value="項目" /></th>
									<th class="text-center"><c:out value="金額" /></th>
								</tr>
							</thead>
							<c:forEach var="amountDto" items="${graphDto.amountDtoList}"
								varStatus="status">
								<tr>
									<th class="text-center"><c:out
											value="${amountDto.genreName}" /></th>
									<td class="text-right"><c:out value="${amountDto.sum}" />円</td>
								</tr>
							</c:forEach>
							<tr>
								<th colspan="2" bgcolor="#FBD78E" class="text-right">合計／<c:out
										value="${graphDto.amountSummary}" />円
								</th>
							</tr>
						</table>

					</div>
				</div>
			</div>

</body>
</html>