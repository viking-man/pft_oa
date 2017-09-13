<%@ page import="org.apache.commons.lang3.StringUtils" %>
<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>Modern an Admin Panel Category Flat Bootstarp Resposive Website Template | Login :: w3layouts</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="keywords" content="Modern Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template,
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design"/>
    <script type="application/x-javascript"> addEventListener("load", function () {
        setTimeout(hideURLbar, 0);
    }, false);
    function hideURLbar() {
        window.scrollTo(0, 1);
    } </script>
    <!-- Bootstrap Core CSS -->
    <link rel="stylesheet" type="text/css" href="http://www.jq22.com/jquery/bootstrap-3.3.4.css">
    <!-- Custom CSS -->
    <link href="../../css/style.css" rel='stylesheet' type='text/css'/>
    <link rel="stylesheet" type="text/css" href="http://www.jq22.com/jquery/font-awesome.4.6.0.css">
    <!-- jQuery -->
    <script src="http://www.jq22.com/jquery/jquery-1.10.2.js"></script>

    <!---//webfonts--->
    <!-- Bootstrap Core JavaScript -->
    <script src="http://www.jq22.com/jquery/bootstrap-3.3.4.js"></script>
</head>
<body id="login">
<div class="login-logo">
    <a href="index.jsp"><img src="../../images/logo.png" alt=""/></a>
</div>
<h2 class="form-heading">login</h2>
<div class="app-cam">
    <form action="/login.do" method="post">
        <input name="userno" type="text" class="text" placeholder="Userno">
        <input name="password" type="password" placeholder="Password">
        <div class="submit"><input type="submit" onClick="myFunction()" value="Login"></div>
        <div class="login-social-link">
            <a href="https://open.work.weixin.qq.com/wwopen/sso/qrConnect?appid=wx5ba8760d25c0e797&agentid=1000002&redirect_uri=http%3A%2F%2F120.55.173.61:8082&state=usWmsYx" class="facebook">
                微信登录
            </a>
        </div>
        <div class="text-center">
            ${error}
        </div>
        <ul class="new">
            <li class="new_left"><p><a href="#">Forgot Password ?</a></p></li>
            <li class="new_right"><p class="sign">New here ?<a href="usercreate.jsp"> Sign Up</a></p></li>
            <div class="clearfix"></div>
        </ul>
    </form>
</div>
<div class="copy_layout login">
    <p>Copyright © 2015 Modern. All Rights Reserved | Design by </p>
</div>
</body>
</html>
