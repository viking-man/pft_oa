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
    <title>Modern an Admin Panel Category Flat Bootstarp Resposive Website Template | Register :: w3layouts</title>
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
    <link href="../../../../../css/style.css" rel='stylesheet' type='text/css'/>
    <link rel="stylesheet" type="text/css" href="http://www.jq22.com/jquery/font-awesome.4.6.0.css">
    <!-- jQuery -->
    <script src="http://www.jq22.com/jquery/jquery-1.10.2.js"></script>

    <!---//webfonts--->
    <!-- Bootstrap Core JavaScript -->
    <script src="http://www.jq22.com/jquery/bootstrap-3.3.4.js"></script>
</head>
<body id="login">
<%--<div class="login-logo">--%>
<%--<a href="index.jsp"><img src="../../images/logo.png" alt=""/></a>--%>
<%--</div>--%>
<h2 class="form-heading">新建员工</h2>
<form class="form-signin app-cam" action="/oa/user/insert.do">
    <p>填写员工个人信息：</p>
    <input type="text" class="form-control1" placeholder="姓名" name="username">
    <input type="text" class="form-control1" placeholder="地址" name="addr">
    <input type="text" class="form-control1" placeholder="手机号" name="mobileno">
    <input type="text" class="form-control1" placeholder="邮箱" name="email">
    <input type="text" class="form-control1" placeholder="部门" name="department">
    <select id="departmentno" name="departmentno" style="display: block;">
        <option value="manage">管理层</option>
        <option value="technology" selected="selected">技术部</option>
        <option value="operation">运维部</option>
        <option value="market">市场部</option>
    </select>
    <select id="rolecode" name="rolecode">
        <option value="normal" selected="selected">普通员工</option>
        <option value="groupleader" selected="selected">组长</option>
        <option value="charge">主管</option>
    </select>
    <input type="text" class="form-control1" placeholder="备注" name="remark">
    <div class="radios">
        <label for="radio-01" class="label_radio">
            <input id="radio-01" type="radio" checked="checked" value="1" name="sex"> Male
        </label>
        <label for="radio-02" class="label_radio">
            <input id="radio-02" type="radio" value="0" name="sex"> Female
        </label>
    </div>
    <p>填写员工登陆信息：</p>
    <input type="text" class="form-control1" placeholder="登陆编码" name="userno">
    <input type="password" id="pass1" class="form-control1" placeholder="密码" name="pwd">
    <input type="password" id="pass2" class="form-control1" placeholder="确认密码" onblur="validatePass()">
    <p id="check_info"></p>
    <button id="submit" class="btn btn-lg btn-success1 btn-block" type="submit" onfocus="validateAll()">Submit</button>
    <div class="registration">
        <a class="" href="/userQuery.do">
            返回
        </a>
    </div>
</form>
<div class="copy_layout login register">
    <p>Copyright © 2015 Modern. All Rights Reserved | Design by </p>
</div>

</body>
</html>
