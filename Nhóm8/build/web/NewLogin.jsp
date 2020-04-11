<!DOCTYPE html>
<%@page import="model.Load"%>
<%@page import="java.util.List"%>
<%@page import="model.LoginBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Thêm thành viên</title>
        <link type="text/css" href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <link type="text/css" href="bootstrap/css/bootstrap-responsive.min.css" rel="stylesheet">
        <link type="text/css" href="css/theme.css" rel="stylesheet">
        <link type="text/css" href="images/icons/css/font-awesome.css" rel="stylesheet">
        <link type="text/css" href='http://fonts.googleapis.com/css?family=Open+Sans:400italic,600italic,400,600' rel='stylesheet'>
    </head>
    <body>

        <div class="navbar navbar-fixed-top">
            <div class="navbar-inner">
                <div class="container">
                    <a class="btn btn-navbar" data-toggle="collapse" data-target=".navbar-inverse-collapse">
                        <i class="icon-reorder shaded"></i>
                    </a>

                    <a class="brand" href="index.html">
                        Admin
                    </a>

                    <div class="nav-collapse collapse navbar-inverse-collapse">
                        <ul class="nav nav-icons">
                            <li class="active"><a href="#">
                                    <i class="icon-envelope"></i>
                                </a></li>
                            <li><a href="#">
                                    <i class="icon-eye-open"></i>
                                </a></li>
                            <li><a href="#">
                                    <i class="icon-bar-chart"></i>
                                </a></li>
                        </ul>

                        <form class="navbar-search pull-left input-append" action="#">
                            <input type="text" class="span3">
                            <button class="btn" type="button">
                                <i class="icon-search"></i>
                            </button>
                        </form>

                        <ul class="nav pull-right">
                         

                            <li><a href="showcart.jsp">
                                    Giỏ hàng
                                </a></li>
                            <li><a href="Trangchu_1.jsp">
                                    Đăng xuất
                            </a></li>
                         
                        </ul>
                    </div><!-- /.nav-collapse -->
                </div>
            </div><!-- /navbar-inner -->
        </div><!-- /navbar -->



        <div class="wrapper">
            <div class="container">
                <div class="row">
                    <div class="span3">
                        <div class="sidebar">

                            <ul class="widget widget-menu unstyled">
                                <li class="active">
                                    <a href="Trangchu.jsp">
                                        <i class="menu-icon icon-dashboard"></i>
                                        Trang chủ
                                    </a>
                                </li>
                                <li>
                                    <a href="Thanhvien.jsp">
                                        <i class="menu-icon icon-bullhorn"></i>
                                        Quản lý tài khoản
                                    </a>
                                </li>
                                <li>
                                    <a href="SanPham.jsp">
                                        <i class="menu-icon icon-inbox"></i>
                                        Quản lý sản phẩm
                                    </a>
                                </li>

                                <li>
                                    <a href="#">
                                        <i class="menu-icon icon-tasks"></i>
                                        Thông báo
                                        <b class="label orange pull-right">19</b>
                                    </a>
                                </li>
                            </ul><!--/.widget-nav-->

                            <ul class="widget widget-menu unstyled">
                                <li><a href="#"><i class="menu-icon icon-bold"></i> </a></li>
                                <li><a href="#"><i class="menu-icon icon-book"></i></a></li>
                                <li><a href="#"><i class="menu-icon icon-paste"></i></a></li>
                                <li><a href="#"><i class="menu-icon icon-table"></i></a></li>
                                <li><a href="#"><i class="menu-icon icon-bar-chart"></i></a></li>
                            </ul><!--/.widget-nav-->

                            <ul class="widget widget-menu unstyled">
                                <li>
                                    <a class="collapsed" data-toggle="collapse" href="#togglePages">
                                        <i class="menu-icon icon-cog"></i>
                                        <i class="icon-chevron-down pull-right"></i><i class="icon-chevron-up pull-right"></i>

                                    </a>
                                    <ul id="togglePages" class="collapse unstyled">
                                        <li>
                                            <a href="other-login.html">
                                                <i class="icon-inbox"></i>
                                                Login
                                            </a>
                                        </li>
                                        <li>
                                            <a href="other-user-profile.html">
                                                <i class="icon-inbox"></i>
                                                Profile
                                            </a>
                                        </li>
                                        <li>
                                            <a href="other-user-listing.html">
                                                <i class="icon-inbox"></i>
                                                All Users
                                            </a>
                                        </li>
                                    </ul>
                                </li>

                                <li>
                                    <a href="#">
                                        <i class="menu-icon icon-signout"></i>
                                        Logout
                                    </a>
                                </li>
                            </ul>

                        </div><!--/.sidebar-->
                    </div><!--/.span3-->


                    <div class="span9">
                        <div class="content">

                            <div class="module">
                                <div class="module-head">
                                    <h3>Thêm Thành Viên</h3>
                                </div>
                                <div class="module-body">


                                    <form class="form-horizontal row-fluid">
                                        <div class="control-group">
                                            <label class="control-label" for="basicinput">Tên đăng nhập</label>
                                            <div class="controls">
                                                <input name="txt1User" required data-title="A tooltip for the input" type="text" placeholder="Tên đăng nhập…" data-original-title="" class="span8 tip">
                                            </div>
                                        </div>
                                        <div class="control-group">
                                            <label class="control-label" for="basicinput">Mật khẩu</label>
                                            <div class="controls">
                                                <input name="txt1Pass" required data-title="A tooltip for the input" type="password" placeholder="Mật khẩu…" data-original-title="" class="span8 tip">
                                            </div>
                                        </div>
                                        <div class="control-group">
                                            <label class="control-label" for="basicinput">Họ tên</label>
                                            <div class="controls">
                                                <input name="txt1Name" required required data-title="A tooltip for the input" type="text" placeholder="Họ tên…" data-original-title="" class="span8 tip">
                                            </div>
                                        </div>
                                        <div class="control-group">
                                            <label class="control-label" for="basicinput">Số điện thoại</label>
                                            <div class="controls">
                                                <input name="txt1Sdt" required data-title="A tooltip for the input" type="text" placeholder="Số điện thoại…" data-original-title="" class="span8 tip">
                                            </div>
                                        </div>

                                        <div class="control-group">
                                            <label class="control-label" for="basicinput">Chức vụ</label>
                                            <div class="controls">
                                                <select tabindex="1" data-placeholder="Select here.." class="span8" name="cbo1Quyen">
                                                    <option value="nv">Người dùng</option>
                                                    <option value="admin">Quản lý</option>
                                                </select>
                                            </div>
                                        </div>



                                        <div class="control-group">
                                            <div class="controls">
                                                <button type="submit" class="btn">Thêm</button>
                                            </div>
                                        </div>
                                    </form>
                                    <sql:setDataSource driver="com.microsoft.sqlserver.jdbc.SQLServerDriver"
                                                       url="jdbc:sqlserver://localhost:1433;databaseName=Ass_Java4"
                                                       user="sa"
                                                       password="123"
                                                       var="con"/>

                                    <c:if test="${not empty param.txt1User}">
                                        <sql:update dataSource="${con}">
                                            Insert Into Users(UserName,Password,Ten,SDT,Permission) Values(?,?,?,?,?)
                                            <sql:param value="${param.txt1User}"/>
                                            <sql:param value="${param.txt1Pass}"/>
                                            <sql:param value="${param.txt1Name}"/>
                                            <sql:param value="${param.txt1Sdt}"/>
                                            <sql:param value="${param.cbo1Quyen}"/>
                                        </sql:update>
                                    </c:if>
                                </div>
                            </div>



                        </div><!--/.content-->
                    </div><!--/.span9-->
                </div><!--/.span9-->
            </div>
        </div><!--/.container-->

    </div><!--/.wrapper-->
    <!-- Button trigger modal -->       

    <!-- Modal -->     
    <div class="footer">
        <div class="container">


            <b class="copyright">&copy; 2014 Edmin - EGrappler.com </b> All rights reserved.
        </div>
    </div>

    <script src="scripts/jquery-1.9.1.min.js"></script>
    <script src="scripts/jquery-ui-1.10.1.custom.min.js"></script>
    <script src="bootstrap/js/bootstrap.min.js"></script>
    <script src="scripts/datatables/jquery.dataTables.js"></script>
   
</body>
</html>