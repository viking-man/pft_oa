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
    <link href="../../../../../css/style.css" rel='stylesheet' type='text/css'/>
    <!-- Graph CSS -->
    <link href="../../../../../css/lines.css" rel='stylesheet' type='text/css'/>
    <link rel="stylesheet" type="text/css" href="http://www.jq22.com/jquery/font-awesome.4.6.0.css">
    <!-- jQuery -->
    <script src="http://www.jq22.com/jquery/jquery-1.10.2.js"></script>

    <!---//webfonts--->
    <!-- Nav CSS -->
    <link href="../../../../../css/custom.css" rel="stylesheet">
    <!-- Metis Menu Plugin JavaScript -->
    <script src="../../../../../js/metisMenu.min.js"></script>
    <script src="../../../../../js/custom.js"></script>
    <!-- Graph JavaScript -->
    <script src="../../../../../js/d3.v3.js"></script>
    <script src="../../../../../js/rickshaw.js"></script>
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
                            <img src="../../../../../images/1.png" alt=""/>
                            <div>New message</div>
                            <small>1 minute ago</small>
                            <span class="label label-info">NEW</span>
                        </a>
                    </li>
                    <li class="avatar">
                        <a href="#">
                            <img src="../../../../../images/2.png" alt=""/>
                            <div>New message</div>
                            <small>1 minute ago</small>
                            <span class="label label-info">NEW</span>
                        </a>
                    </li>
                    <li class="avatar">
                        <a href="#">
                            <img src="../../../../../images/3.png" alt=""/>
                            <div>New message</div>
                            <small>1 minute ago</small>
                        </a>
                    </li>
                    <li class="avatar">
                        <a href="#">
                            <img src="../../../../../images/4.png" alt=""/>
                            <div>New message</div>
                            <small>1 minute ago</small>
                        </a>
                    </li>
                    <li class="avatar">
                        <a href="#">
                            <img src="../../../../../images/5.png" alt=""/>
                            <div>New message</div>
                            <small>1 minute ago</small>
                        </a>
                    </li>
                    <li class="avatar">
                        <a href="#">
                            <img src="../../../../../images/pic1.png" alt=""/>
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
                        src="../../../../../images/1.png"><span
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
                        <a href="../../../index.jsp"><i class="fa fa-dashboard fa-fw nav_icon"></i>系统管理</a>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-laptop nav_icon"></i>员工管理<span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="/oa/user/user/query.do">员工管理</a>
                            </li>
                            <li>
                                <a href="/oa/user/role/query.do">角色管理</a>
                            </li>
                            <li>
                                <a href="/oa/user/permission/query.do">权限管理</a>
                            </li>
                        </ul>
                        <!-- /.nav-second-level -->
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-indent nav_icon"></i>Menu Levels<span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="../../../graphs.jsp">Graphs</a>
                            </li>
                            <li>
                                <a href="../../../typography.jsp">Typography</a>
                            </li>
                        </ul>
                        <!-- /.nav-second-level -->
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-envelope nav_icon"></i>Mailbox<span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="../../../inbox.jsp">Inbox</a>
                            </li>
                            <li>
                                <a href="../../../compose.jsp">Compose email</a>
                            </li>
                        </ul>
                        <!-- /.nav-second-level -->
                    </li>
                    <li>
                        <a href="../../../widgets.jsp"><i class="fa fa-flask nav_icon"></i>Widgets</a>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-check-square-o nav_icon"></i>Forms<span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="../../../forms.jsp">Basic Forms</a>
                            </li>
                            <li>
                                <a href="../../../validation.jsp">Validation</a>
                            </li>
                        </ul>
                        <!-- /.nav-second-level -->
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-table nav_icon"></i>Tables<span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="../../../basic_tables.jsp">Basic Tables</a>
                            </li>
                        </ul>
                        <!-- /.nav-second-level -->
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-sitemap fa-fw nav_icon"></i>Css<span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="../../../media.jsp">Media</a>
                            </li>
                            <li>
                                <a href="../../../login.jsp">Login</a>
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
    <div id="page-wrapper" style="position: relative">
        <div class="graphs">
            <div class="md">
                <h3>基本操作</h3>
                <div>
                    <div style="margin:10px;display:inline;padding: 10px 20px;height: 30px;width: 60px;"
                         data-toggle="modal" data-target="#createModal">
                        <input type="submit" value="新建" style="height: 30px;width: 60px;" id="permission.create">
                    </div>

                    <form style="margin:10px;display:inline;padding: 10px 20px;"
                          action="/oa/user/permission/readRolePermission.do"
                          method="post">
                        <select id="roleDisplay" onclick="queryRoles()">
                        </select>
                        <input type="submit" value="查询" style="height: 30px;width: 60px;" id="permission.query">
                    </form>

                    <hr style="margin: 50px 0px;color: #888;">
                </div>
                <h3>角色名称：${bean.role.rolename}</h3>
                <table class="table table-bordered" id="rolesdisplay">
                    <thead>
                    <tr>
                        <td>权限项</td>
                        <td>权限名称</td>
                        <td>权限别名</td>
                        <td>权限描述</td>
                        <td>URL</td>
                    </tr>
                    </thead>
                    <c:forEach items="${bean.permissions}" var="permission" varStatus="i">
                        <tr id="${permission.id}">
                            <td>${permission.permission}</td>
                            <td>${permission.name}</td>
                            <td>${permission.alias}</td>
                            <td>${permission.remark}</td>
                            <td>${permission.url}</td>
                            <td contenteditable="false">
                                <a href="#=${permission.id}" data-toggle="modal" data-target="#editModal"
                                   onclick="edit(this);return false;" id="/oa/user/permission/edit.do">编辑</a>
                                <a href="#=${permission.id}" onclick="deleteRole(this);return false;"
                                   id="/oa/user/permission/delete.do">删除</a>

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
</div>

<!-- 新建模态框 -->
<div class="modal fade" id="createModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">

            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                        aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel">新建</h4>
            </div>
            <div class="modal-body">
                <div class="input-group col-md-4">
                    <span class="input-group-addon">角色编码</span>
                    <input type="text" class="form-control" placeholder="rolecode" name="rolecode">
                </div>
                <div class="input-group col-md-4">
                    <span class="input-group-addon">角色名称</span>
                    <input type="text" class="form-control" placeholder="rolename" name="rolename">
                </div>
                <div class="input-group col-md-4">
                    <span class="input-group-addon">角色别名</span>
                    <input type="text" class="form-control" placeholder="rolealias" name="rolealias">
                </div>
                <div class="input-group col-md-4">
                    <span class="input-group-addon">备注</span>
                    <input type="text" class="form-control" placeholder="remark" name="remark">
                </div>
                <div class="form-group">
                    <label>固有角色:</label>
                    <input type="radio" id="esex_m" name="fixed" value="1" checked="checked">固有
                    <input type="radio" id="esex_f" name="fixed" value="0">非固有
                </div>

                <br>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                <button type="submit" class="btn btn-primary" data-dismiss="modal" onclick="insert()">保存</button>
            </div>

        </div>
    </div>
</div>

<!-- 新建模态框 -->
<div class="modal fade" id="editModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <input type="hidden" name="id">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                        aria-hidden="true">&times;</span></button>
                <h4 class="modal-title">编辑页面</h4>
            </div>
            <div class="modal-body">
                <div class="input-group col-md-4">
                    <span class="input-group-addon">角色编码</span>
                    <input type="text" class="form-control" placeholder="rolecode" name="rolecode">
                </div>
                <div class="input-group col-md-4">
                    <span class="input-group-addon">角色名称</span>
                    <input type="text" class="form-control" placeholder="rolename" name="rolename">
                </div>
                <div class="input-group col-md-4">
                    <span class="input-group-addon">角色别名</span>
                    <input type="text" class="form-control" placeholder="rolealias" name="rolealias">
                </div>
                <div class="input-group col-md-4">
                    <span class="input-group-addon">备注</span>
                    <input type="text" class="form-control" placeholder="remark" name="remark">
                </div>
                <div class="form-group">
                    <label>固有角色:</label>
                    <input type="radio" name="fixed" value="1" checked="checked">固有
                    <input type="radio" name="fixed" value="0">非固有
                </div>

                <br>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-primary" data-dismiss="modal" onclick="update(this)">保存</button>
            </div>
        </div>
    </div>
</div>

<!-- /#wrapper -->
<!-- Metis Menu Plugin JavaScript -->
<script src="http://www.jq22.com/jquery/bootstrap-3.3.4.js"></script>
<script>


    function edit(a) {
        var href = $(a).attr("href");
        id = href.substring(href.indexOf("=") + 1, href.length);

        $.ajax({
            async: false,
            url: "/oa/user/role/edit.do",
            type: "post",
            dataType: "json",
            data: {
                id: id
            },
            success: function (data) {
                var role = data.edit;
                var modal = $("#editModal input");
                modal[0].value = (role.id);
                modal[1].value = (role.rolecode);
                modal[2].value = (role.rolename);
                modal[3].value = (role.rolealias);
                modal[4].value = (role.remark);
                modal[5].value = (role.fixed);

            },
            error: function (data, err) {
                alert("编辑时出错：" + err);
            }
        });
    }

    function insert() {
        var modal = $("#createModal input");
        var rolecode = modal[0].value;
        var rolename = modal[1].value;
        var rolealias = modal[2].value;
        var remark = modal[3].value;
        var fixed = $('#createModal input:radio[name="fixed"]:checked').val();

        $.ajax({
            async: false,
            url: "/oa/user/role/insert.do",
            type: "post",
            dataType: "json",
            data: {
                rolecode: rolecode,
                rolename: rolename,
                rolealias: rolealias,
                remark: remark,
                fixed: fixed
            },
            success: function (data) {
                var role = data;
                $("#rolesdisplay").append("" +
                    "<tr>" +
                    "<td>" + data.rolecode + "</td>" +
                    "<td>" + data.rolename + "</td>" +
                    "<td>" + data.rolealias + "</td>" +
                    "<td>" + data.remark + "</td>" +
                    "<td>" + data.fixed + "</td>" +
                    "</tr>");

                window.location.reload();
            },
            error: function (data, err) {
                alert("插入时出错：" + err);
            }
        })
    }

    function update(u) {
        var modal = $("#editModal input");
        var id = modal[0].value;
        var rolecode = modal[1].value;
        var rolename = modal[2].value;
        var rolealias = modal[3].value;
        var remark = modal[4].value;
        var fixed = $('#editModal input:radio[name="fixed"]:checked').val();

        $.ajax({
            async: false,
            url: "/oa/user/role/update.do",
            type: "post",
            dataType: "json",
            data: {
                id: id,
                rolecode: rolecode,
                rolename: rolename,
                rolealias: rolealias,
                remark: remark,
                fixed: fixed
            },
            success: function (data) {
                var role = data;
                var modal = $("#" + data.id + " td");
                modal[0].value = (role.rolecode);
                modal[1].value = (role.rolename);
                modal[2].value = (role.rolealias);
                modal[3].value = (role.remark);
                modal[4].value = (role.fixed);
                window.location.reload();
            },
            error: function (data, err) {
                alert("保存时出错：" + err);
            }
        })
    }

    function deleteRole(a) {
        var href = $(a).attr("href");
        id = href.substring(href.indexOf("=") + 1, href.length);

        $.ajax({
            async: false,
            url: "/oa/user/role/delete.do",
            type: "post",
            dataType: "json",
            data: {
                id: id
            },
            success: function () {
                $(a).parent().parent().remove();
            },
            error: function (data, err) {
                alert("删除时出错：" + err);
            }
        });
    }

    function queryRoles() {
        $.ajax({
            async: true,
            url: "/oa/user/role/query.do",
            type: "post",
            dataType: "json",
            success: function (data) {
                var roles = data.query;
//                $(roles).each(function (index, value) {
//                    $("#roleDisplay").append("<option value=></option>");
//                })

                $.each(roles, function (key, value) {
                    $('#roleDisplay').append($("<option><option/>", {
                        value: key,
                        text: value
                    }));
                });
            },
            error: function (data, error) {
                alert(error);
            }
        })

    }
</script>
</body>
</html>
