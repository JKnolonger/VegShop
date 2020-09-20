
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@include file="/common/taglib.jsp"%>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>Trang chủ</title>

</head>
<body >
   

   
   <h1 style="text-align: center;"> ${msg}</h1>
  
   <div class="container">
  <h2>Striped Rows</h2>
  <p>The .table-striped class adds zebra-stripes to a table:</p>            
  <table class="table table-striped">
    <thead>
      <tr>
        <th>User name</th>
        <th>Full name</th>
        <th>Email</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach var="item" items="${ListUser}">
      <tr>
        <td>${item.userName }</td>
        <td>${item.fullName }</td>
        <td>${item.email }</td>
      </tr>
      </c:forEach>
    </tbody>
  </table>
</div>
  
</body>

</html>