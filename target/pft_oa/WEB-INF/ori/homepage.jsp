<%--
  Created by IntelliJ IDEA.
  User: jiangwei
  Date: 2017/9/8
  Time: 13:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主要内容</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="content-Type" content="text/html;charset=UTF-8">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>Bootstrap 101 Template</title>

    <!-- Bootstrap -->
    <link href="WEB-INF/css/bootstrap.min.css" rel="stylesheet">
</head>
<jsp:forward page="../jsp/index.jsp"/>
<body>
<div class="container">
    <div>Hello!${user.username}</div>
    <h1>Office Automation System</h1>
</div>
<div class="content">
    <table class="tab">
        <caption>员工信息展示</caption>
        <thead>
        <tr>
            <th>名称</th>
            <th>城市</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>Tanmay</td>
            <td>Bangalore</td>
        </tr>
        <tr>
            <td>Sachin</td>
            <td>Mumbai</td>
        </tr>
        </tbody>
    </table>
</div>
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="WEB-INF/js/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="WEB-INF/js/bootstrap.min.js"></script>
</body>
</html>
