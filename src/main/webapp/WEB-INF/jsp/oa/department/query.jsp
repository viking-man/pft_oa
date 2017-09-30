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
    <script type="application/x-javascript"> addEventListener("load", function () {
        setTimeout(hideURLbar, 0);
    }, false);
    function hideURLbar() {
        window.scrollTo(0, 1);
    } </script>
    <!-- Bootstrap Core CSS -->
    <link rel="stylesheet" type="text/css" href="http://www.jq22.com/jquery/bootstrap-3.3.4.css">
    <!-- Custom CSS -->
    <link href="../../../../css/style.css" rel='stylesheet' type='text/css'/>
    <!-- Graph CSS -->
    <link href="../../../../css/lines.css" rel='stylesheet' type='text/css'/>
    <link rel="stylesheet" type="text/css" href="http://www.jq22.com/jquery/font-awesome.4.6.0.css">
    <!-- jQuery -->
    <script src="http://www.jq22.com/jquery/jquery-1.10.2.js"></script>

    <!---//webfonts--->
    <!-- Nav CSS -->
    <link href="../../../../css/custom.css" rel="stylesheet">
    <!-- Metis Menu Plugin JavaScript -->
    <script src="../../../../js/metisMenu.min.js"></script>
    <script src="../../../../js/custom.js"></script>
    <!-- Graph JavaScript -->
    <script src="../../../../js/d3.v3.js"></script>
    <script src="../../../../js/rickshaw.js"></script>
</head>
<body>
<div id="wrapper">
    <!-- Navigation -->
    <nav class="top1 navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="/index.do">内部管理系统</a>
        </div>
        <!-- /.navbar-header -->
        <ul class="nav navbar-nav navbar-right">
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false"><i
                        class="fa fa-comments-o"></i><span class="badge">4</span></a>
                <ul class="dropdown-menu">
                    <li class="dropdown-menu-header">
                        <strong>Messages</strong>
                        <div class="progress thin">
                            <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40"
                                 aria-valuemin="0" aria-valuemax="100" style="width: 40%">
                                <span class="sr-only">40% Complete (success)</span>
                            </div>
                        </div>
                    </li>
                    <li class="avatar">
                        <a href="#">
                            <img src="../../../../images/1.png" alt=""/>
                            <div>New message</div>
                            <small>1 minute ago</small>
                            <span class="label label-info">NEW</span>
                        </a>
                    </li>
                    <li class="avatar">
                        <a href="#">
                            <img src="../../../../images/2.png" alt=""/>
                            <div>New message</div>
                            <small>1 minute ago</small>
                            <span class="label label-info">NEW</span>
                        </a>
                    </li>
                    <li class="avatar">
                        <a href="#">
                            <img src="../../../../images/3.png" alt=""/>
                            <div>New message</div>
                            <small>1 minute ago</small>
                        </a>
                    </li>
                    <li class="avatar">
                        <a href="#">
                            <img src="../../../../images/4.png" alt=""/>
                            <div>New message</div>
                            <small>1 minute ago</small>
                        </a>
                    </li>
                    <li class="avatar">
                        <a href="#">
                            <img src="../../../../images/5.png" alt=""/>
                            <div>New message</div>
                            <small>1 minute ago</small>
                        </a>
                    </li>
                    <li class="avatar">
                        <a href="#">
                            <img src="../../../../images/pic1.png" alt=""/>
                            <div>New message</div>
                            <small>1 minute ago</small>
                        </a>
                    </li>
                    <li class="dropdown-menu-footer text-center">
                        <a href="#">View all messages</a>
                    </li>
                </ul>
            </li>
            <li class="dropdown">
                <a href="#" class="dropdown-toggle avatar" data-toggle="dropdown"><img
                        src="../../../../images/1.png"><span
                        class="badge">9</span></a>
                <ul class="dropdown-menu">
                    <li class="dropdown-menu-header text-center">
                        <strong>个人信息</strong>
                    </li>
                    <li class="m_2"><a href="#"><i class="fa fa-bell-o"></i> 姓名 <span
                            class="label label-info">${loginuser.username}</span></a></li>
                    <li class="m_2"><a href="#"><i class="fa fa-envelope-o"></i> 登录编码 <span
                            class="label label-success">${loginuser.userno}</span></a></li>
                    <li class="m_2"><a href="#"><i class="fa fa-tasks"></i> 部门 <span
                            class="label label-danger">${loginuser.departmentno}</span></a></li>
                    <li><a href="#"><i class="fa fa-comments"></i> 微信ID <span
                            class="label label-warning">${loginuser.wxuserid}</span></a>
                    </li>
                    <li class="dropdown-menu-header text-center">
                        <strong>Settings</strong>
                    </li>
                    <li class="m_2"><a href="#"><i class="fa fa-user"></i> Profile</a></li>
                    <li class="m_2"><a href="#"><i class="fa fa-wrench"></i> Settings</a></li>
                    <li class="m_2"><a href="#"><i class="fa fa-usd"></i> Payments <span
                            class="label label-default">42</span></a></li>
                    <li class="m_2"><a href="#"><i class="fa fa-file"></i> Projects <span
                            class="label label-primary">42</span></a></li>
                    <li class="divider"></li>
                    <li class="m_2"><a href="#"><i class="fa fa-shield"></i> Lock Profile</a></li>
                    <li class="m_2"><a href="/logout.do"><i class="fa fa-lock"></i> 注销</a></li>
                </ul>
            </li>
        </ul>
        <form class="navbar-form navbar-right">
            <input type="text" class="form-control" value="Search..." onFocus="this.value = '';"
                   onBlur="if (this.value == '') {this.value = 'Search...';}">
        </form>
        <div class="navbar-default sidebar" role="navigation">
            <div class="sidebar-nav navbar-collapse">
                <ul class="nav" id="side-menu">
                    <li>
                        <a href="../../index.jsp"><i class="fa fa-dashboard fa-fw nav_icon"></i>系统管理</a>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-laptop nav_icon"></i>员工管理<span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="/userQuery.do">员工列表</a>
                            </li>
                            <li>
                                <a href="/userQuery.do">部门管理</a>
                            </li>
                            <li>
                                <a href="/userQuery.do">权限管理</a>
                            </li>
                        </ul>
                        <!-- /.nav-second-level -->
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-indent nav_icon"></i>Menu Levels<span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="../../graphs.jsp">Graphs</a>
                            </li>
                            <li>
                                <a href="../../typography.jsp">Typography</a>
                            </li>
                        </ul>
                        <!-- /.nav-second-level -->
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-envelope nav_icon"></i>Mailbox<span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="../../inbox.jsp">Inbox</a>
                            </li>
                            <li>
                                <a href="../../compose.jsp">Compose email</a>
                            </li>
                        </ul>
                        <!-- /.nav-second-level -->
                    </li>
                    <li>
                        <a href="../../widgets.jsp"><i class="fa fa-flask nav_icon"></i>Widgets</a>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-check-square-o nav_icon"></i>Forms<span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="../../forms.jsp">Basic Forms</a>
                            </li>
                            <li>
                                <a href="../../validation.jsp">Validation</a>
                            </li>
                        </ul>
                        <!-- /.nav-second-level -->
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-table nav_icon"></i>Tables<span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="../../basic_tables.jsp">Basic Tables</a>
                            </li>
                        </ul>
                        <!-- /.nav-second-level -->
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-sitemap fa-fw nav_icon"></i>Css<span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="../../media.jsp">Media</a>
                            </li>
                            <li>
                                <a href="../../login.jsp">Login</a>
                            </li>
                        </ul>
                        <!-- /.nav-second-level -->
                    </li>
                </ul>
            </div>
            <!-- /.sidebar-collapse -->
        </div>
        <!-- /.navbar-static-side -->
    </nav>
    <div id="page-wrapper">
        <div class="graphs">
            <div class="md">
                <h3>部门管理</h3>
                <div>
                    <div style="margin:10px;display:inline;padding: 10px 20px;height: 30px;width: 60px;">
                        <input type="submit" value="新建" data-toggle="modal" data-target="#myModal"
                               style="height: 30px;width: 60px;" id="createdepartment">
                    </div>

                    <form style="margin:10px;display:inline;padding: 10px 20px;"
                          action="/oa/user/query.do" method="post">
                        <input type="submit" value="查询" style="height: 30px;width: 60px;">
                    </form>

                    <hr style="margin: 5px 0px 10px 0px;width: 2px;color: #2d2d2d">

                </div>
                <table class="table table-bordered">
                    <thead>
                    <tr>
                        <td>部门编码</td>
                        <td>部门名称</td>
                        <td>备注</td>
                        <td>基本操作</td>
                    </tr>
                    </thead>
                    <c:forEach items="${departments}" var="departmentno" varStatus="i">
                        <tr id="info">
                            <td>${departmentno.departmentno}</td>
                            <td>${departmentno.departmentname}</td>
                            <td>${departmentno.remark}</td>
                            <td contenteditable="false">
                                <a href="/oa/user/user/edit.do?id=${user.id}">修改</a>
                                <a href="/oa/user/user/delete.do?id=${user.id}">删除</a>

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

<!-- 新建模态框 -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                        aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel">新建</h4>
            </div>
            <div class="modal-body">
                <div class="input-group col-md-4">
                    <span class="input-group-addon">部门名称</span>
                    <input type="text" class="form-control" placeholder="departmentname" name="departmentname">
                </div>
                <div class="input-group col-md-4">
                    <span class="input-group-addon">部门编码</span>
                    <input type="text" class="form-control" placeholder="departmentno" name="departmentno">
                </div>
                <div class="input-group col-md-4">
                    <span class="input-group-addon">备注</span>
                    <input type="text" class="form-control" placeholder="remark" name="remark">
                </div>
                <div class="form-group">
                    <label>固有部门:</label>
                    <input type="radio" id="esex_m" name="fixed" value="M" checked="checked">固有
                    <input type="radio" id="esex_f" name="fixed" value="F">非固有
                </div>

                <br>
                <div class="input-group">
                    <span class="input-group-addon" id="Wechat">微信ID号</span>
                    <input type="text" class="form-control" placeholder="Wechat" aria-describedby="basic-addon1">
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-primary">新建</button>
            </div>
        </div>
    </div>
</div>
<!-- 查询模态框 -->
<div class="modal fade" id="myModa2" tabindex="-1" role="dialog" aria-labelledby="myModalLabe2">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                        aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabe2">查询</h4>
            </div>
            <div class="modal-body">
                <textarea style="width:100%;height:100%;"></textarea>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-primary">查询</button>
            </div>
        </div>
    </div>
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

    $("#info").onfocus(function () {
        $(this).addClass("active");
    })

    $("#info").onblur(function () {
        $(this).removeClass("active");
    })

    $("#createdepartment").onclick(function () {
        $
    })
</script>
</body>
</html>
