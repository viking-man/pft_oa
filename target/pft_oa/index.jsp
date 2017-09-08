<%--
  Created by IntelliJ IDEA.
  User: jiangwei
  Date: 2017/9/8
  Time: 9:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="content-Type" content="text/html;charset=UTF-8">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>Bootstrap 101 Template</title>

    <!-- Bootstrap -->
    <link href="WEB-INF/css/bootstrap.min.css" rel="stylesheet">

</head>
<jsp:forward page="index.html"/>
<body>
<h1 class="text-center text-primary">Office Automation System</h1>
<div class="container" id="login_blank">
    <p>oa登录提示</p>
    <form action="jsp/content.jsp" method="post">
        <div>用户名：<input type="text" class="col-lg-1" placeholder="张三"></div>
        <div>密码：<input type="text" class="col-lg-1" placeholder="123456"></div>
        <div>验证码：<input type="text" class="col-lg-1" placeholder="还没写"></div>
        <div><input type="submit" class="col-lg-1">提交</div>
    </form>
</div>

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="WEB-INF/js/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="WEB-INF/js/bootstrap.min.js"></script>
</body>
</html>
