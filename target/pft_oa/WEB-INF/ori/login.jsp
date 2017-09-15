<%--
  Created by IntelliJ IDEA.
  User: jiangwei
  Date: 2017/9/8
  Time: 9:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="zh">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>翻转式用户登录注册界面设计</title>
    <link rel="stylesheet" type="text/css" href="../../css/styles.css">
    <!--[if IE]>
    <script src="http://libs.baidu.com/html5shiv/3.7/html5shiv.min.js"></script>
    <![endif]-->
</head>
<body>
<div class="jq22-container" style="padding-top:100px">
    <div class="login-wrap">
        <div class="login-html">
            <input id="tab-1" type="radio" name="tab" class="sign-in" checked><label for="tab-1" class="tab">Sign
            In</label>
            <input id="tab-2" type="radio" name="tab" class="sign-up"><label for="tab-2" class="tab">Sign Up</label>
            <div class="login-form">
                <div class="sign-in-htm">
                    <form action="/login.do" method="post">
                        <div class="group">
                            <label for="username" class="label">Username</label>
                            <input id="username" name="username" type="text" class="input">
                        </div>
                        <div class="group">
                            <label for="password" class="label">Password</label>
                            <input id="password" name="password" type="password" class="input" data-type="password">
                        </div>
                        <div class="group">
                            <input id="check" type="checkbox" class="check" checked>
                            <label for="check"><span class="icon"></span> Keep me Signed in</label>
                        </div>
                        <div class="group">
                            <input type="submit" class="button" value="Sign In">
                        </div>
                    </form>
                    <div class="hr"></div>
                    <div class="foot-lnk">
                        <a href="#forgot">Forgot Password?</a>
                    </div>
                </div>
                <div class="sign-up-htm">
                    <div class="group">
                        <label for="user_up" class="label">Username</label>
                        <input id="user_up" type="text" class="input">
                    </div>
                    <div class="group">
                        <label for="pass_up" class="label">Password</label>
                        <input id="pass_up" type="password" class="input" data-type="password">
                    </div>
                    <div class="group">
                        <label for="pass_up_validate" class="label">Repeat Password</label>
                        <input id="pass_up_validate" type="password" class="input" data-type="password">
                    </div>
                    <div class="group">
                        <label for="email_up" class="label">Email Address</label>
                        <input id="email_up" type="text" class="input">
                    </div>
                    <div class="group">
                        <input type="submit" class="button" value="Sign Up">
                    </div>
                    <div class="hr"></div>
                    <div class="foot-lnk">
                        <label for="tab-1">
                            <a>Already Member?</a>
                        </label>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
