<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function getXhr() {
		var xhr = new XMLHttpRequest();
		return xhr;
	}
	//发送get请求
	function getMethod() {
		var xhr = getXhr();
		xhr.open("GET", "/web07/GetServlet?name=siri&age=5", true);

		xhr.onreadystatechange = function() {
			if (xhr.readyState == 4 && xhr.status == 200) {
				var str = xhr.responseText;
				document.getElementById("getSpan").innerHTML = str;
			}
		}
		xhr.send();
	}
	function psotMethod() {
		var xhr = getXhr();
		xhr.open("POST","/web07/PostServlet",true);
		xhr.setRequestHeader("Content-type","application/x-www-form-urlencoded");
		xhr.onreadystatechange=function(){
			if(xhr.readyState==4&&xhr.status==200){
				var str=xhr.responseText;
				document.getElementById("postSpan").innerHTML=str;
			}
		}
		xhr.send("name=tom&gender=nan");
	}
</script>
</head>
<body>
	<button onclick="getMethod()">get方式异步请求</button>
	<span id="getSpan"></span>
	<br>
	<button onclick="postMethod()">post方式异步请求</button>
	<span id="postSpan"></span>
</body>
</html>