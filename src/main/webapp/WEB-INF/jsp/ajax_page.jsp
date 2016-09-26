<%@ page language="java"  pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<div>
	id <input id="person_id" type="text" name="id">
	username : <input id="username" type="text" name="username" />
	password : <input id="password" type="password" name>
	<input type="submit" value="submit" id="submit" />
	
</div>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script>
	$(document).ready(function(){
		var elemenSubmit = $('#submit');
		
		elemenSubmit.click(function(){
		var personId = $('#person_id').val();
		var username = $('#username').val();
		var password = $('#password').val();
		var person  = {
				id : personId,
				username : username,
				password : password
		}
		
			//console.log(person);
			$.ajax({
				type: "POST",
				data : JSON.stringify(person), //send data
				contentType: 'application/json',
				url:"http://localhost:8080/mvn90/pengembalian/data",
				success : function(data){
					console.log(data);
				},
				dataType:'json'
			});	
		});
		
		
	 	var element = $('#loadAjax');
	 	var pengembalian = {
	 		noRegistrasi : "123456"
	 	};
	 	
			element.click(function(){
				$.ajax({
					type: "POST",
					data : JSON.stringify(pengembalian),
					contentType: 'application/json',
					url:"http://localhost:8080/mvn90/restpengembalian/getall",
					success : function(data){
						console.log("name "+ data.anggota.name);
						$('#result').html("name : "+ data.anggota.name);
					},
					dataType: 'json'
				});	
		}); 
	});
</script>
<body>
	halaman jsp
	<a href="#" id="loadAjax">loading</a>
	<div id="result"></div>
</body>
</html>