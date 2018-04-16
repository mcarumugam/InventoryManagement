<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Login Page</title>
</head>
<link rel="stylesheet" type="text/css" href="css/OM.css">
<body>
  <!-- Code Starts Here-->
	<div class="container3">
        <div class="loginForm ">     
<h2>Login</h2>
<s:actionerror />
<s:form action="login.action" method="post">
<div class="selectWidth95">
	<s:textfield name="username"  size="20" cssClass="inputboxBg"  key="label.username"/>
</div>
<div class="selectWidth95">
	<s:password name="password" key="label.password" cssClass="inputboxBg" size="20"/>
</div> 
<s:submit method="execute" key="label.login" align="center"  cssClass="loginButtonblue"/>   
</s:form>
</div></div>
</body>
</html>
