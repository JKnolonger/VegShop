<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp" %>
<c:url var="uploadURL" value="/api/home"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin</title>

    
</head>
</head>
<body>
<dec:body/>

 	<script src="<c:url value='/template/web/js/jquery-3.3.1.min.js'/>"></script>
     <script src="<c:url value='/template/web/js/jquery.nice-select.min.js'/>"></script>
    <script src="<c:url value='/template/web/js/jquery-ui.min.js'/>"></script>
    <script src="<c:url value='/template/web/js/jquery.slicknav.js'/>"></script>
    <script src="<c:url value='/template/web/js/mixitup.min.js'/>"></script>
    <script src="<c:url value='/template/web/js/owl.carousel.min.js'/>"></script>
    <script src="<c:url value='/template/web/js/main.js'/>"></script>
<script >
$(document).ready(function(){
	
});

$('#uploadImage').change(function(){
	var dataArray = {};
	var files = $(this)[0].files[0];
	if(files != undefined){
		var reader = new FileReader();
		reader.onload = function(e){
			
			dataArray["name"] = files.name;
			dataArray["base64"] = e.target.result;
			uploadFile(dataArray);
		};
		reader.readAsDataURL(files);
	}
});
function uploadFile(data){
	$.ajax({
		url: '${uploadURL}',
		type: 'POST',
		data: JSON.stringify(data),
		contentType: 'application/json',
		
		success: function (res){
			console.log(res);
		},
		error: function (res){
		}
	});
	alert('Da upload!')
}

</script>
</body>
</html>