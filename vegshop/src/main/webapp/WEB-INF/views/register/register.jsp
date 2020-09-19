<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp" %>
<c:url var="xn" value="/addUser"/>
<%@ taglib prefix="dec" uri="http://www.opensymphony.com/sitemesh/decorator"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <div class="page-wrapper bg-gra-02 p-t-130 p-b-100 font-poppins">
        <div class="wrapper wrapper--w680">
            <div class="card card-4">
                <div class="card-body">
                    <h2 class="title">Registration Form</h2>
                    <form action="${xn}" method="POST">
                        <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Full name</label>
                                    <input class="input--style-4" type="text" name="fullName">
                                </div>
                            </div>
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">User name</label>
                                    <input class="input--style-4" type="text" name="userName">
                                </div>
                            </div>
                        </div>
                        <div class="row row-space">
	                        <div class="col-2">
	                                <div class="input-group">
	                                    <label class="label">Gender</label>
	                                    <div class="p-t-10">
	                                        <label class="radio-container m-r-45">Male
	                                            <input type="radio" checked="checked" name="gender">
	                                            <span class="checkmark"></span>
	                                        </label>
	                                        <label class="radio-container">Female
	                                            <input type="radio" name="gender">
	                                            <span class="checkmark"></span>
	                                        </label>
	                                    </div>
	                                </div>
	                            </div>
	                            <div class="col-2">
	                                <div class="input-group">
	                                    <label class="label">Email</label>
	                                    <input class="input--style-4" type="email" name="email">
	                                </div>
                            	</div>
	                          
                        </div>
                        <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Birthday</label>
                                    <div class="input-group-icon">
                                        <input class="input--style-4 js-datepicker" type="text" name="birthday">
                                        <i class="zmdi zmdi-calendar-note input-icon js-btn-calendar"></i>
                                    </div>
                                </div>
                            </div>
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Password</label>
                                    <input class="input--style-4" type="password" name="password">
                                </div>
                            </div>
                        </div>
                        <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Phone</label>
                                    <input class="input--style-4" type="text" name="phone">
                                </div>
                            </div>
                            <div class="col-2">
                            </div>
                        </div>
                         <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Address</label>
                                    <input class="input--style-4" type="text" name="address" style="width: 211%;">
                                </div>
                            </div>
                        </div>
                        <div class="p-t-15">
                            <button class="btn btn--radius-2 btn--blue" type="submit">Submit</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
    <script></script>
</body>

</html>