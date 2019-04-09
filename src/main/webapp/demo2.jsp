<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/4/23 0023
  Time: 18:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>柠檬酒店</title>
    <style>
        /*设置导航每个主菜单的样式*/
        .main_nav{
            display:block;
            width:200px;
            padding:10px;
            font-weight:bold;
            background-color:#BADFF2;
        }
        li{list-style:none;}
        #globalNav {
            position:absolute;
            top:3px;
            left:2px;
        }
        /*导航中每个子菜单的样式*/
        #globalNav ul li a{
            margin:auto 10px;
            display:block;
            width:140px;
            color:#fff;
            font-weight:bold;
            text-decoration:none;
        }
        #globalNav li ul li a{
            background:#6DBBE1;
        }
        #globalNav li ul li a:hover{
            background:#BCF2F0;<!--鼠标经过的颜色-->
        }
    </style>
    <script type="text/javascript" >
        function initTree(t) {
            var tree=document.getElementById(t);//生成树
            tree.style.display="none";//设置样式为隐藏形式，不显示
            var lis=tree.getElementsByTagName("li");
            for(var i=0;i<lis.length;i++) {  //取出主要的导航栏
                lis[i].id="li"+i;
                var uls=lis[i].getElementsByTagName("ul"); //子导航栏
                if(uls.length!=0) {
                    uls[0].id="ul"+i;
                    uls[0].style.display="none";
                    var as=lis[i].getElementsByTagName("a"); //子导航栏的内容
                    as[0].id="a"+i;
                    as[0].className="folder";
                    as[0].href="#this";
                    as[0].tget=uls[0];
                    as[0].onclick=function() {
                        openTag(this,this.tget);
                    }
                }
            }
            tree.style.display="block";
        }
        function openTag(a,t) {
            if(t.style.display=="block") { //点击一些展开，再点击一下折叠
                t.style.display="none";
                a.className="folder";
            } else {
                t.style.display="block";
                a.className="";
            }
        }
        window.onload=function() {
            initTree("globalNav");
        }
    </script>
</head>
<body id="index">
<ul id="globalNav">
    <li class="main_nav"><a href="#">房间信息</a>
        <ul>
            <li><a href="nullroom.php" target="mainFrame">空房</a></li>
            <li><a href="room.php" target="mainFrame">所有房间</a></li>
            <li><a href="orderroom.php" target="mainFrame">被订房间</a></li>
            <li><a href="register/room.html" target="mainFrame">录入房间信息</a></li>
        </ul>
    </li>
    <li class="main_nav"><a href="#">房客信息</a>
        <ul>
            <li><a href="register/custom.html" target="mainFrame">录入房客信息</a></li>
            <li><a href="custom_info.php" target="mainFrame">客史档案</a></li>
        </ul>
    </li>
    <li class="main_nav"><a href="#">订单</a>
        <ul>
            <li><a href="register/order.html" target="mainFrame">录入订单信息</a></li>
            <li><a href="order.php" target="mainFrame">查看订单</a></li>
        </ul>
    </li>
    <li class="main_nav"><a href="#">会员</a>
        <ul>
            <li><a href="register/member.html" target="mainFrame">录入会员信息</a></li>
            <li><a href="member.php" target="mainFrame">查看会员信息</a></li>
        </ul>
    </li>
    <li class="main_nav"><a href="#">财务</a>
        <ul>
            <li><a href="register/cash.html" target="mainFrame">录入财务信息</a></li>
            <li><a href="cash.php" target="mainFrame">查看财务信息 </a></li>
        </ul>
    </li>
    <li class="main_nav"><a href="login/login.html"  target="_parent">退出</a></li>
</ul>
<script>
    $(function () {
        $('#globalNav td:eq(1) button').tab('show');
    });
</script>
</body>
</html>
