<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/4/24 0024
  Time: 9:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>导航栏展开隐藏</title>

    <script language="javascript">
        function f(str){
            var sub_menu = document.getElementById(str);
            var dis_v = sub_menu.style.display;

            if(dis_v == "none")
                sub_menu.style.display = "block";
            else
                sub_menu.style.display = "none";

        }
    </script>
</head>
<body>
<table cellspacing="0" cellpadding="0" border="1">
    <tbody>
    <tr onclick = "f('sub_menu_1')">
        <td>主菜单=人事统计 </td>
    </tr>
    <tr>
        <td>
            <table id="sub_menu_1" >
                <tbody>
                <tr><td>姓名</td><td>编号</td></tr>
                <tr><td>周星星</td><td>9527</td></tr>
                <tr><td>刘备</td><td>1000</td></tr>
                </tbody>
            </table>
        </td>
    </tr>

    <tr onclick = "f('sub_menu_2')">
        <td>主菜单=财务统计 </td>
    </tr>
    <tr>
        <td>
            <table id="sub_menu_2" >
                <tbody>
                <tr><td>成本</td><td>收益率</td></tr>
                <tr><td>运输</td><td>0.7</td></tr>
                <tr><td>材料</td><td>0.8</td></tr>
                </tbody>
            </table>
        </td>
    </tr>
    </tbody>
</table>

<form style="width: 1000px;" class="bs-example bs-example-form" role="form" name="goods_select_form" method="post" action="/goods/delete/22">
    <div class="col-lg-3">
        <div class="input-group">

            <input style="width: 155px;" type="text" class="form-control" placeholder="请输入查询商品名称" name="goodsName">
            <span class="input-group-btn" style="padding-right: 20px; padding-bottom: 15px">
                                        <button class="btn btn-default" type="button" href="#goods" data-toggle="tab" onclick="goods_select_form.action='/goods/goodsName/';goods_select_form.submit()">
                                           <span class="glyphicon glyphicon-search" ></span> 查询
                                        </button>
            </span>
            <input type="submit" value="523">
            <input type="button" value="sdwa" onclick="goods_select_form.action='/goods/goodsBarcode/692';goods_select_form.submit()">
            |______|
            <input style="width: 155px;" type="text" class="form-control" placeholder="请输入删除商品编号">
            <input type="hidden" name="_method" value="DELETE"/>
            <span class="input-group-btn" style="padding-bottom: 15px;">
                                        <button class="btn btn-default" type="button" onclick="goods_select_form='/goods/delete/22';goods_select_form.submit()">
                                           <span class="glyphicon glyphicon-trash" ></span> 删除
                                        </button>
                                </span>

        </div>
    </div>
</form>
</body>
</html>
