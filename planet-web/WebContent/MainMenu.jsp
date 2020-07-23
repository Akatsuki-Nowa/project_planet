<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<base href="/">
<meta http-equiv="Content-Style-Type" content="text/css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.0.0.min.js"></script>
    <script>
    $(function() {
    	//リクエストJSON
    	  var request = {
    	    param1 : "param",
    	    param2 : 12345
    	  };
    	
        $('#button').click(
          function() {
            $.ajax({
              type: "post",
              url: 'http://localhost:8080/planet-web/Ajax',
              data    : { params: JSON.stringify(request) },        //リクエストJSON
              dataType: 'text',
              success: function (data) {
              $('#results').append(data);
              },
            error: function () {
              alert('読み込み失敗');
            }
            });
         }
       );
     })
    </script>
</head>
<body>
    <form action="http://localhost:8080/planet-web/History.jsp" method="post">
    	<div class="main">
			<p>ユーザー名：<br><input type="text" name="name"></p>
			<div>
				<select name="sentaku">
					<option value="1"> 選択1
					<option value="2"> 選択2
					<option value="3"> 選択3
					<option value="4"> 選択4
					<option value="5"> 選択5
				</select>
			</div>
			<p><input type="submit" value="確認する" id="button2"></p>
	    </div>
	</form>
	<input type="submit" value="ajax通信する" id="button">
	<br/>
	<div id="results"></div>
</body>
</html>