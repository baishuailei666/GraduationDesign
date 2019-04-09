<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/6 0006
  Time: 10:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>超市进销存管理系统</title>
    <style type="text/css">
        form{
            margin: 0px auto;
            width: 1080px;
            padding: 20px;
        }
    </style>
    <link href="../../libs/css/bootstrap.min.css" rel="stylesheet"/>
    <script src="../../libs/js/bootstrap.min.js"></script>
    <script src="../../libs/js/jqurey.min.js"></script>
</head>
<body style="background-image: url('../../images/ha.jpg')">

    <br>
    <div style="padding-top: 10px; padding-left: 100px" >
        <table style="padding-left: 30px" >
            <tr><td style="padding-left: 355px"><h2>超市进销存管理系统 | 欢迎注册</h2></td>
                <td style="padding-left: 420px"><input type="button" class="btn btn-outline-primary" name="back" onclick="javascript:history.back();" value="BACK">
                    &nbsp;&nbsp;&nbsp;
                    <input type="button" class="btn btn-info" name="exit" onclick="window.location.href='/userInfo/logout';" value="EXIT">
                </td>
            </tr>
            <br>
        </table>

    </div>
    <hr>
    <form action="/userInfo/registerAccount" method="post">
        <table align = "center" style="padding-top: 30px; width: 1000px; height: 500px; background-image: url('../../images/bg.jpg'); " border="0">
            <tr><td align = "center" style="padding-top: 10px;">
                <div class="progress" style="width: 800px; padding: 0 auto; height: 30px">
                    <div class="progress-bar progress-bar-striped" role="progressbar"
                         aria-valuenow="60" aria-valuemin="0" aria-valuemax="100"
                         style="width: 30%; ">
                        ①设置账号
                        <span class="sr-only">设置账号</span>
                    </div>
                    <div class="progress-bar progress-bar-striped" role="progressbar"
                         aria-valuenow="60" aria-valuemin="0" aria-valuemax="100"
                         style="width: 30%">
                        ②设置密码
                        <span class="sr-only">设置账号</span>
                    </div>
                    <div class="progress-bar progress-bar-striped" role="progressbar"
                         aria-valuenow="60" aria-valuemin="0" aria-valuemax="100"
                         style="width: 40%">
                        ③注册成功
                        <span class="sr-only">设置账号</span>
                    </div>

                </div>


            </td></tr>
            <tr><td style="padding-left: 240px; padding-top: 10px">账&nbsp;&nbsp;&nbsp;&nbsp;号：<input name="userAccount" type="text"> &nbsp;*请输入小写字母、数字字符组合</td></tr>
            <tr><td style="padding-left: 240px; padding-top: 10px">密&nbsp;&nbsp;&nbsp;&nbsp;码：<input name="userPassword" type="password"> &nbsp;*请输入6-12位小写字母、数字字符组合 </td></tr>
            <tr><td style="padding-left: 240px; padding-top: 10px">验证码：<input name="userAuth" type="text"> &nbsp;*请输入验证码</td></tr>
            <tr>
                <td style="padding-top: 30px; padding-left: 340px">
                    <input name="true" class="btn btn-primary" type="submit" value="确定">
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <input name="false" class="btn btn-default" type="button"  onclick="javascript:history.back();" value="取消">
                </td>
            </tr>
        </table>
    </form>
    <br><br><br><br><br>
    <hr>
    <div class="blockquote-footer" style="margin-top: 40px; margin-left: 800px">
        <em>&copy; 2018 @baishuailei 版权所有</em>
        <em>&nbsp;—</em>
    </div>
</body>
</html>
