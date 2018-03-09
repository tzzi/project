<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
 <meta name="viewport" content="width=device-width, initial-scale=1"> <!-- 모바일 터치 -->
<title><%-- <tiles:getAsString name="title"></tiles:getAsString> --%></title>
</head>
<body>
<div class="container-fluid">
  <h1 style="background: silver">My First Bootstrap Page</h1>
  <p>This is some text.</p> 
  <div class="row">
  	<div class="col-md-4">
  		a
  	</div>
  	<div class="col-md-8">
  		b
  	</div>
  </div>
</div>
</body>
</html>