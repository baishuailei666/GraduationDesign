<%@ page language="java" contentType="text/html" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>超市经销存管理系统</title>
    <style type="text/css">
        form{
            margin: 0px auto;
            width: 560px;
            padding: 20px;
        }
    </style>
    <link href="libs/css/bootstrap.min.css" rel="stylesheet"/>
    <script src="libs/js/bootstrap.min.js"></script>
    <script src="libs/js/jqurey.min.js"></script>

</head>

<body style="background-image:url('./images/ha.jpg')">
<form action="/userInfo/login" method="post">
    <h3 style="margin-top: 100px">欢迎━(*｀∀´*)ノ亻:-) | 超市进销存管理系统<br><hr></h3>
    <div style="width: 520px; height: 300px; background-color: transparent; margin-top: 70px">
        <table style="margin-left: 30px">
            <tr><td style="padding-top: 65px">账   号：<input name="userAccount" type="text"></td></tr>
            <tr><td style="padding-top: 20px">密   码：<input name="userPassword" type="password"></td></tr>
            <tr>
                <td style="padding-top: 70px; padding-left: 75px">
                    <input name="login" class="btn btn-default" type="submit" value="登录">
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <input name="register" class="btn btn-default" type="button" onclick="window.location.href='/userInfo/register';" value="注册">
                </td>
            </tr>
        </table>
        <br><br><br>
        <hr>
    </div>
</form>

    <div class="blockquote-footer" style="margin-top: 300px; margin-left: 800px">
        <em>&copy; 2018 @baishuailei 版权所有</em>
        <em>&nbsp;—</em>
    </div>

</body>
</html>