<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="dec" uri="http://www.opensymphony.com/sitemesh/decorator"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="description" content="Ogani Template">
    <meta name="keywords" content="Ogani, unica, creative, html">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Ogani | Template</title>

    <!-- Google Font -->
    <link href="https://fonts.googleapis.com/css2?family=Cairo:wght@200;300;400;600;900&display=swap" rel="stylesheet">

    <!-- Css Styles -->
    <link rel="stylesheet" href="<c:url value='/template/web/css/bootstrap.min.css'/>" type="text/css">
    <link rel="stylesheet" href="<c:url value='/template/web/css/font-awesome.min.css'/>" type="text/css">
    <link rel="stylesheet" href="<c:url value='/template/web/css/elegant-icons.css'/>" type="text/css">
    <link rel="stylesheet" href="<c:url value='/template/web/css/nice-select.css'/>" type="text/css">
    <link rel="stylesheet" href="<c:url value='/template/web/css/jquery-ui.min.css'/>" type="text/css">
    <link rel="stylesheet" href="<c:url value='/template/web/css/owl.carousel.min.css'/>" type="text/css">
    <link rel="stylesheet" href="<c:url value='/template/web/css/slicknav.min.css'/>" type="text/css">
    <link rel="stylesheet" href="<c:url value='/template/web/css/style.css'/>" type="text/css"> 
</head>
<body>
	<%@ include file="/common/web/header.jsp" %>  
	<%@ include file="/common/web/menu.jsp" %>  
	<dec:body></dec:body>
	
	<%@ include file="/common/web/footer.jsp" %>
   
   
    <!-- Js Plugins -->
     <script src="<c:url value='/template/web/js/jquery-3.3.1.min.js'/>"></script>
    <script src="<c:url value='/template/web/js/bootstrap.min.js'/>"></script>
     <script src="<c:url value='/template/web/js/jquery.nice-select.min.js'/>"></script>
    <script src="<c:url value='/template/web/js/jquery-ui.min.js'/>"></script>
    <script src="<c:url value='/template/web/js/jquery.slicknav.js'/>"></script>
    <script src="<c:url value='/template/web/js/mixitup.min.js'/>"></script>
    <script src="<c:url value='/template/web/js/owl.carousel.min.js'/>"></script>
    <script src="<c:url value='/template/web/js/main.js'/>"></script>
</body>
</html>