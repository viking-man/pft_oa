<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="oa.user.user.entity.UserEntity" %>
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
    <title>Modern an Admin Panel Category Flat Bootstarp Resposive Website Template | Grids :: w3layouts</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="keywords" content="Modern Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template,
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design"/>
</head>
<body>
<div id="wrapper">
    <!-- Navigation -->
    <div id="page-wrapper">
        <div class="graphs">
            <div class="md">
                <h3>基本操作</h3>
                <div>
                    <form style="margin:10px;display:inline;padding: 10px 20px;height: 30px;width: 60px;"
                          action="/oa/user/create.do" method="post">
                        <input type="submit" value="新建" style="height: 30px;width: 60px;">
                    </form>

                    <form style="margin:10px;display:inline;padding: 10px 20px;"
                          action="/oa/user/query.do" method="post">
                        <input type="submit" value="查询" style="height: 30px;width: 60px;">
                    </form>

                    <div style="margin:10px;display:inline;padding: 10px 20px;">
                        <input type="button" id="delete" onclick="" value="删除"/>
                    </div>

                    <hr style="margin: 5px 0px 10px 0px;width: 2px;color: #2d2d2d">

                </div>
                <table class="table table-bordered">
                    <thead>
                    <tr>
                        <td>姓名</td>
                        <td>工号</td>
                        <td>性别</td>
                        <td>地址</td>
                        <td>手机号</td>
                        <td>邮箱</td>
                        <td>微信ID</td>
                        <td>信息管理</td>
                    </tr>
                    </thead>
                    <c:forEach items="${users}" var="user" varStatus="i">
                        <tr id="userinfo">
                            <td>${user.username}</td>
                            <td>${user.userno}</td>
                            <td class="td">${user.sex}</td>
                            <td>${user.addr}</td>
                            <td>${user.mobileno}</td>
                            <td>${user.email}</td>
                            <td>${user.wxuserid}</td>
                            <td contenteditable="false">
                                <a href="/oa/user/edit.do?id=${user.id}">修改</a>
                                <a href="/oa/user/delete.do?id=${user.id}">删除</a>
                                <a href="/wxBind.do?id=${user.id}">微信绑定</a>
                                <a href="/removeWxBind.do?id=${user.id}">解除绑定</a>

                                    <%--<form style="margin:0px;display:inline;padding: 0px 10px" action="/userUpdate.do"--%>
                                    <%--method="post">--%>
                                    <%--<button type="submit" style="height: 25px;width: 60px">保存</button>--%>
                                    <%--</form>--%>

                                    <%--<form style="margin:0px;display:inline;padding: 0px 10px" action="/userDelete.do"--%>
                                    <%--method="post">--%>
                                    <%--<button type="submit" style="height: 25px;width: 60px">删除</button>--%>
                                    <%--</form>--%>
                            </td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
        <div>
            <p class="text-center">${error}</p>
        </div>
    </div>

    <!-- /#page-wrapper -->
    <%--<div class="copy_layout">--%>
    <%--<p>Copyright © 2015 Modern. All Rights Reserved | Design by </p>--%>
    <%--</div>--%>
</div>
<!-- /#wrapper -->
<!-- Metis Menu Plugin JavaScript -->
<script src="http://www.jq22.com/jquery/bootstrap-3.3.4.js"></script>
<script>
    $(document).ready(function () {
        $(".td").each(function () {
            if ($(this).text() == "1") {
                $(this).text('男');
            } else if ($(this).text() == "0") {
                $(this).text('女');
            } else {
                $(this).text("未知");
            }
        });
    });

    $("#userinfo").onfocus(function () {
        $(this).addClass("active");
    })

    $("#userinfo").onblur(function () {
        $(this).removeClass("active");
    })
</script>
</body>
</html>
