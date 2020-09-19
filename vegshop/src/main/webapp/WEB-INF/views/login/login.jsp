<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>	

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Đăng nhập</title>
</head>
<body>

	
	<div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100 p-l-50 p-r-50 p-t-77 p-b-30">
			<c:if test="${param.incorrectAccount != null}">
					<div class="alert alert-danger">	
							Username or password incorrect
					</div>
				</c:if>
				<c:if test="${param.accessDenied != null}">
					<div class="alert alert-danger">	
						You Not authorize
					</div>
				</c:if>
				<form class="login100-form validate-form" action="j_spring_security_check" id="formLogin" method="post">
					<span class="login100-form-title p-b-55">
						Login
					</span>

					<div class="wrap-input100 validate-input m-b-16" data-validate = "UserName is required">
						<input class="input100" type="text" name="j_username" id="userName" placeholder="Username">
						<span class="focus-input100"></span>
						<span class="symbol-input100">
							<span class="lnr lnr-envelope"></span>
						</span>
					</div>

					<div class="wrap-input100 validate-input m-b-16" data-validate = "Password is required">
						<input class="input100" type="password" id="password" name="j_password" placeholder="Password">
						<span class="focus-input100"></span>
						<span class="symbol-input100">
							<span class="lnr lnr-lock"></span>
						</span>
					</div>

					<div class="contact100-form-checkbox m-l-4">
						<input class="input-checkbox100" id="ckb1" type="checkbox" name="remember-me">
						<label class="label-checkbox100" for="ckb1">
							Remember me
						</label>
						
					</div>
					<div class="m-l-4"><label class="label"  >
							<a href="<c:url value='/quen-mat-khau'/>">Forget password!</a>
						</label></div>
					
					<div class="container-login100-form-btn p-t-25">
						<button class="login100-form-btn" id="submit" name="submit" type="submit">
							Login
						</button>
					</div>

					<div class="text-center w-full p-t-42 p-b-22">
						<span class="txt1">
							Or login with
						</span>
					</div>

					<a href="#" class="btn-face m-b-10">
						<i class="fa fa-facebook-official"></i>
						Facebook
					</a>

					<a href="#" class="btn-google m-b-10">
						<img src="<c:url value='/template/login/images/icons/icon-google.png'/>" alt="GOOGLE">
						Google
					</a>

					<div class="text-center w-full p-t-115">
						<span class="txt1">
							Not a member?
						</span>

						<a class="txt1 bo1 hov1" href="<c:url value='/dang-ki'/>">
							Sign up now							
						</a>
					</div>
				</form>
			</div>
		</div>
	</div>
	
</body>
</html>