
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <title>JSP Page</title>
        <style>
            body {
                font-family: Arial, Helvetica, sans-serif;
                background-color: black;
            }

            * {
                box-sizing: border-box;
            }

            /* Add padding to containers */
            .container {
                padding: 16px;
                background-color: white;
            }

            /* Full-width input fields */
            input[type=text], input[type=password] {
                width: 100%;
                padding: 15px;
                margin: 5px 0 22px 0;
                display: inline-block;
                border: none;
                background: #f1f1f1;
            }

            input[type=text]:focus, input[type=password]:focus {
                background-color: #ddd;
                outline: none;
            }

            /* Overwrite default styles of hr */
            hr {
                border: 1px solid #f1f1f1;
                margin-bottom: 25px;
            }

            /* Set a style for the submit button */
            .registerbtn {
                background-color: #4CAF50;
                color: white;
                padding: 16px 20px;
                margin: 8px 0;
                border: none;
                cursor: pointer;
                width: 100%;
                opacity: 0.9;
            }

            .registerbtn:hover {
                opacity: 1;
            }

            /* Add a blue text color to links */
            a {
                color: dodgerblue;
            }

            /* Set a grey background color and center the text of the "sign in" section */
            .signin {
                background-color: #f1f1f1;
                text-align: center;
            }
        </style>
    </head>
    <body  style="background-color: bisque">
    <center>
        <div  algin="center" style="width:600px">
            <form >
                <div class="container">
                    <p>Thêm Sản Phẩm</p>
                    <p>Vui lòng điền vào mẫu này để thêm sản phẩm.</p>
                    <hr>

                    <label for="email"><b>Mã Sản Phẩm</b></label>
                    <input type="text" placeholder="Enter Mã Sản Phẩm" name="txtMasp" required>
                    <label for="psw"><b>Tên Sản Phẩm</b></label>
                    <input type="text" placeholder="Enter Tên Sản Phẩm" name="txtTensp" required>
                    <label for="psw"><b>Giá</b></label>
                    <input type="text" placeholder="Enter GIá Sản Phẩm" name="txtGia" required>

                    <hr>

                    <button type="submit" class="registerbtn">Add</button>
                </div>

                <div class="container signin">
                    <p>Quay Lại Trang Sản Phẩm? <a href="Controller?btnAction=Sanpham">Sản Phẩm</a>.</p>
                </div>
            </form>
            <hr>
            <sql:setDataSource driver="com.microsoft.sqlserver.jdbc.SQLServerDriver"
                               url="jdbc:sqlserver://localhost:1433;databaseName=Ass_Java4"
                               user="sa"
                               password="123"
                               var="con"/>

            <c:if test="${not empty param.txtMasp}">
                <sql:update dataSource="${con}">
                    insert into SANPHAM(MASP,TENSP,GIA) Values(?,?,?)
                    <sql:param value="${param.txtMasp}"/>
                    <sql:param value="${param.txtTensp}"/>
                    <sql:param value="${param.txtGia}"/>

                </sql:update>
            </c:if>
            </table>
        </div>
    </center>
</body>
</html>
