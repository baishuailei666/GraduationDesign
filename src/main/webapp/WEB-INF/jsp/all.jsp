<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/4/20 0020
  Time: 10:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>超市经销存管理系统</title>
    <style type="text/css">
        li {
            list-style:none;
        }
        #myTab {
            top:3px;
            left:2px;
        }

        form{
            margin: 0px auto;
            width: 1300px;
            padding: 20px;
        }
        table th{
            height: 50px;
            text-align: center
        }

    </style>

    <script type="text/javascript" >
        function goods_page() {
            window.location.href="/goods/page/1";
        }
        function sales_page() {
            window.location.href="/sales/page/1";
        }
        function purchase_page() {
            window.location.href="/purchase/page/1";
        }
        function supplier_page() {
            window.location.href="/supplier/page/1";
        }
        function warehouse_page() {
            window.location.href="/warehouse/page/1";
        }
        function userInfo_page() {
            window.location.href="/userInfo/page/1";
        }




    </script>
    <link href="../../libs/css/bootstrap.min.css" rel="stylesheet"/>
    <script src="../../libs/js/bootstrap.min.js"></script>
    <script src="../../libs/js/jqurey.min.js"></script>
    <script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
    <script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body style="background-image:url('../../images/tm.jpg')">
<div style="padding-left: 100px" >
    <table>
        <tr><td style="padding-left: 100px"><h2>超市进销存管理系统 </h2></td>
            <td style="padding-left: 950px"><input type="button" class="btn btn-outline-primary" name="back" onclick="history.back();" value="BACK">
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <input type="button" class="btn btn-info" name="exit" onclick="window.location.href='/userInfo/logout';" value="EXIT">
            </td>
        </tr>
    </table>
</div>
<hr>
<div style="padding-left: 200px; width: 1000px">
    <table style="width: 1400px; height: 40px" border="1">
        <tr>
            <td style="width: 139px"><span class="glyphicon glyphicon-user" style="font-size: 24px;"></span>
                Hi User！${userAccount.toString()}
            </td>
            <td>
                <div>
                    <form style="width: 450px; padding-bottom: 15px" class="bs-example bs-example-form" role="form">
                        <div class="col-lg-3">
                            <div class="input-group">
                                <input style="width: 200px;" type="text" class="form-control" placeholder="请输入查询内容">
                                <span class="input-group-btn" style="padding-right: 20px; padding-bottom: 15px">
                                        <button class="btn btn-default" type="button">
                                           <span class="glyphicon glyphicon-search" ></span> 查询
                                        </button>
                                    </span>
                                <input style="width: 200px;" type="text" class="form-control" placeholder="请输入删除编号或内容">
                                <span class="input-group-btn" style="padding-bottom: 15px;">
                                        <button class="btn btn-default" type="button">
                                           <span class="glyphicon glyphicon-trash" ></span> 删除
                                        </button>
                                    </span>
                            </div>
                        </div>
                    </form>
                </div>
            </td>

            <td style="width: 230px">
                <button type="button" class="btn btn-info btn-sm">
                    <span class="glyphicon glyphicon-arrow-left"></span> 上一页
                </button>
                &nbsp;&nbsp;&nbsp;
                <button type="button" class="btn btn-info btn-sm">
                    下一页 <span class="glyphicon glyphicon-arrow-right"></span>
                </button>
            </td>
        </tr>

    </table>
</div>

    <div style="padding-left: 200px; width: 500px; height: 600px">
    <table style="padding-left: 200px; width: 1200px; height: 600px" border="0" >
        <td id="myTab" class="nav nav-tabs">
            <table style=" padding-top: 30px; width: 140px; height: 650px;" border="1">
                <tr><td class="main_nav">

                    <button type="button" class="btn btn-info btn-lg" onclick="goods_page()" href="#goods" data-toggle="tab">
                        <span class="glyphicon glyphicon-tags"></span> 商品管理
                    </button>

                    <ul>
                        <li><span class="glyphicon glyphicon-hand-right"></span>
                            <a href="" data-toggle="tab">商品添加</a>
                        </li>
                        <li><span class="glyphicon glyphicon-hand-right"></span>
                            <a href="" data-toggle="tab">商品修改</a>
                        </li>

                    </ul>

                </td></tr>
                <tr><td class="main_nav">

                    <button type="button" class="btn btn-info btn-lg" onclick="sales_page()" href="#sales" data-toggle="tab">
                        <span class="glyphicon glyphicon-yen"></span> 销售管理
                    </button>

                    <ul>
                        <li><span class="glyphicon glyphicon-hand-right"></span>
                            <a href="" data-toggle="tab">销售添加</a>
                        </li>
                        <li><span class="glyphicon glyphicon-hand-right"></span>
                            <a href="" data-toggle="tab">销售修改</a>
                        </li>

                    </ul>

                </td></tr>

                <tr><td class="main_nav">

                    <button type="button" class="btn btn-info btn-lg" onclick="purchase_page()" href="#purchase" data-toggle="tab">
                        <span class="glyphicon glyphicon-list-alt"></span> 采购管理
                    </button>

                    <ul>
                        <li><span class="glyphicon glyphicon-hand-right"></span>
                            <a href="" data-toggle="tab">采购添加</a>
                        </li>
                        <li><span class="glyphicon glyphicon-hand-right"></span>
                            <a href="" data-toggle="tab">采购修改</a>
                        </li>

                    </ul>

                </td></tr>

                <tr><td class="main_nav">

                    <button type="button" class="btn btn-info btn-lg" onclick="supplier_page()" href="#supplier" data-toggle="tab">
                        <span class="glyphicon glyphicon-th-list"></span> 供货管理
                    </button>

                    <ul>
                        <li><span class="glyphicon glyphicon-hand-right"></span>
                            <a href="" data-toggle="tab">供货添加</a>
                        </li>
                        <li><span class="glyphicon glyphicon-hand-right"></span>
                            <a href="" data-toggle="tab">供货修改</a>
                        </li>

                    </ul>

                </td></tr>

                <tr><td class="main_nav">

                    <button type="button" class="btn btn-info btn-lg" onclick="warehouse_page()" href="#warehouse" data-toggle="tab">
                        <span class="glyphicon glyphicon-home"></span> 仓库管理
                    </button>

                    <ul>
                        <li><span class="glyphicon glyphicon-hand-right"></span>
                            <a href="" data-toggle="tab">商品添加</a>
                        </li>
                        <li><span class="glyphicon glyphicon-hand-right"></span>
                            <a href="" data-toggle="tab">商品修改</a>
                        </li>

                    </ul>

                </td></tr>

                <tr><td class="main_nav">

                    <button type="button" class="btn btn-info btn-lg" onclick="userInfo_page() " href="#userInfo" data-toggle="tab">
                        <span class="glyphicon glyphicon-user"></span> 用户管理
                    </button>

                    <ul>
                        <li><span class="glyphicon glyphicon-hand-right"></span>
                            <a href="" data-toggle="tab">用户添加</a>
                        </li>
                        <li><span class="glyphicon glyphicon-hand-right"></span>
                            <a href="" data-toggle="tab">用户修改</a>
                        </li>

                    </ul>

                </td></tr>

                <tr><td class="main_nav">
                    <button type="button" class="btn btn-info btn-lg" href="#system" data-toggle="tab">
                        <span class="glyphicon glyphicon-cog"></span> 系统管理
                    </button>
                    <ul>
                        <li><span class="glyphicon glyphicon-hand-right"></span>
                            <a href="#systemOne" data-toggle="tab">系统说明</a>
                        </li>
                        <li><span class="glyphicon glyphicon-hand-right"></span>
                            <a href="#systemTwo" data-toggle="tab">系统相关</a>
                        </li>
                    </ul>
                </td></tr>

            </table>
        </td>

        <td id="myTabContent" class="tab-content">
            <div class="tab-pane fade in active" id="goods">
                <form action="/goods/page/1" method="get" name="form_goods">
                    <table style="padding-top: 30px; padding-left: 0px; width: 1400px; height: 650px; text-align:center" border="1">
                        <thead>
                        <tr>
                            <th style="width: 70px">商品编号</th>
                            <th>商品名称</th>
                            <th>商品条码</th>
                            <th>生成许可证</th>
                            <th style="width: 70px">商品售价</th>
                            <th>商品规格</th>
                            <th style="width: 70px">商品单位</th>
                            <th style="width: 70px">商品进价</th>
                            <th>商品种类</th>
                            <th>供货商家</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="goods" items="${goodsList}">
                            <tr>
                                <td style="height: 60px;">${goods.goodsId}</td>
                                <td>${goods.goodsName}</td>
                                <td>${goods.goodsBarcode}</td>
                                <td>${goods.goodsSc}</td>
                                <td>${goods.goodsPrice}</td>
                                <td>${goods.goodsContent}</td>
                                <td>${goods.goodsUnit}</td>
                                <td>${goods.supplierPrice}</td>
                                <td>${goods.categoryName}</td>
                                <td>${goods.supplierName}</td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>

                </form>
            </div>

            <div  class="tab-pane fade " id="sales">
                <form action="/sales/page/1" method="get" name="form_sales">
                    <table style="padding-top: 30px; padding-left: 0px; width: 1400px; height: 650px; text-align:center" border="1">
                        <thead>
                        <tr>
                            <th style="width: 70px">销售编号</th>
                            <th>商品名称</th>
                            <th>商品条码</th>
                            <th style="width: 70px">商品价格</th>
                            <th>销售数量</th>
                            <th style="width: 70px">商品单位</th>
                            <th style="width: 70px">销售总额</th>
                            <th>销售管理员</th>
                            <th>销售时间</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="sales" items="${salesList}">
                            <tr>
                                <td style="height: 60px;">${sales.salesId}</td>
                                <td>${sales.goodsName}</td>
                                <td>${sales.goodsBarcode}</td>
                                <td>${sales.goodsPrice}</td>
                                <td>${sales.goodsNum}</td>
                                <td>${sales.goodsUnit}</td>
                                <td>${sales.salesTotalAmount}</td>
                                <td>${sales.salesManager}</td>
                                <td>${sales.salesTime}</td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>

                </form>
            </div>

            <div  class="tab-pane fade " id="purchase">
                <form action="/purchase/page/1" method="post">
                    <table style="padding-top: 30px; padding-left: 0px; width: 1400px; height: 650px; text-align:center" border="1">
                        <thead>
                        <tr>
                            <th style="width: 70px">采购编号</th>
                            <th>采购商品名称</th>
                            <th style="width: 70px">商品价格</th>
                            <th>采购商品数量</th>
                            <th style="width: 70px">采购种类</th>
                            <th>采购管理员</th>
                            <th>采购时间</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="purchase" items="${purchaseList}">
                            <tr>
                                <td style="height: 60px;">${purchase.purchaseId}</td>
                                <td>${purchase.goodsName}</td>
                                <td>${purchase.supplierPrice}</td>
                                <td>${purchase.goodsNum}</td>
                                <td>${purchase.categoryName}</td>
                                <td>${purchase.purchaseManager}</td>
                                <td>${purchase.purchaseTime}</td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </form>
            </div>

            <div  class="tab-pane fade " id="supplier">
                <form action="/supplier/page/1" method="post">
                    <table style="padding-top: 30px; padding-left: 0px; width: 1400px; height: 650px; text-align:center" border="1">
                        <thead>
                        <tr>
                            <th style="width: 70px">供货编号</th>
                            <th>供货商名称</th>
                            <th style="width: 70px">供货商品名称</th>
                            <th>供货商品价格</th>
                            <th>供货商品单位</th>
                            <th style="width: 70px">供货商品种类</th>
                            <th>供货联系人</th>
                            <th>联系人电话</th>
                            <th>联系人邮箱</th>
                            <th>商家地址</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="supplier" items="${supplierList}">
                            <tr>
                                <td style="height: 60px;">${supplier.supplierId}</td>
                                <td>${supplier.supplierName}</td>
                                <td>${supplier.goodsName}</td>
                                <td>${supplier.supplierPrice}</td>
                                <td>${supplier.goodsUnit}</td>
                                <td>${supplier.categoryName}</td>
                                <td>${supplier.supplierPersonnel}</td>
                                <td>${supplier.supplierTel}</td>
                                <td>${supplier.supplierEmail}</td>
                                <td>${supplier.supplierAddress}</td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </form>
            </div>

            <div  class="tab-pane fade " id="warehouse">
                <form action="/warehouse/page/1" method="post">
                    <table style="padding-top: 30px; padding-left: 0px; width: 1400px; height: 650px; text-align:center" border="1">
                        <thead>
                        <tr>
                            <th style="width: 70px">仓库编号</th>
                            <th>商品名称</th>
                            <th style="width: 100px">商品条码</th>
                            <th>商品规格</th>
                            <th>商品价格</th>
                            <th>商品库存量</th>
                            <th>商品单位</th>
                            <th>商品种类</th>
                            <th style="width: 100px">商品供货商</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="warehouse" items="${wareHouseList}">
                            <tr>
                                <td>${warehouse.warehouseId}</td>
                                <td>${warehouse.goodsName}</td>
                                <td>${warehouse.goodsBarcode}</td>
                                <td>${warehouse.goodsContent}</td>
                                <td>${warehouse.goodsPrice}</td>
                                <td>${warehouse.goodsInventory}</td>
                                <td>${warehouse.goodsUnit}</td>
                                <td>${warehouse.categoryName}</td>
                                <td>${warehouse.supplierName}</td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </form>
            </div>

            <div  class="tab-pane fade " id="userInfo">
                <form action="/userInfo/page/1" method="post">
                    <table style="padding-top: 30px; padding-left: 0px; width: 1400px; height: 650px; text-align:center" border="1">
                        <thead>
                        <tr>
                            <th style="width: 70px">用户编号</th>
                            <th>用户账号</th>
                            <th>用户密码</th>
                            <th>用户姓名</th>
                            <th>用户性别</th>
                            <th>用户电话</th>
                            <th>用户邮箱</th>
                            <th>用户职位</th>
                            <th>用户部门</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="userInfo" items="${userList}">
                            <tr>
                                <td>${userInfo.userId}</td>
                                <td>${userInfo.userAccount}</td>
                                <td>${userInfo.userPassword}</td>
                                <td>${userInfo.userName}</td>
                                <td>${userInfo.userSex}</td>
                                <td>${userInfo.userTel}</td>
                                <td>${userInfo.userEmail}</td>
                                <td>${userInfo.userPosition}</td>
                                <td>${userInfo.userDepartment}</td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </form>
            </div>

            <div  class="tab-pane fade " id="systemOne">
                <table style="padding-top: 30px; padding-left: 0px; width: 1400px; height: 650px; text-align:left">
                    <tr>
                        <td>
                            #2018-04-04 <br>
                            毕业设计：超市进销存管理系统Supermarket inventory management system. <br>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;进销存管理系统是一个基于Web的应用系统，它是一个面对当前的进销存管理工作基本还处于手工和半信息自动化处理状态而应运而生的一个基于Web的一个完全信息自动化的系统，它包括商品信息，进货信息,销售信息,仓库信息,以及统计分析及系统管理一体的应用系统。<br>
                            （一）功能说明： <br><br>
                            <div class="panel-group" id="accordion">
                                <div class="panel panel-default">
                                    <div class="panel-heading">
                                        <h4 class="panel-title">
                                            <a data-toggle="collapse" data-parent="#accordion"
                                               href="#collapseOne">
                                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;一、商品管理
                                            </a>
                                        </h4>
                                    </div>
                                    <div id="collapseOne" class="panel-collapse collapse in">
                                        <div class="panel-body">
                                            （1）商品添加：该模块将实现对商品的基本信息的添加功能。
                                            包括：商品名称、商品条码、生产编号、商品售价、商品规格、商品单位、商品进价、商品种类、供货商家等基本信息。<br>
                                            （2）商品查询：该模块将实现对商品的基本信息的查询功能。
                                            包括：根据特定条件查询（如：商品名称、商品条码、商品种类）并分页显示商品信息；提供上一页，下一页查询功能，<br>
                                            精确查询：例如只输入完整的商品编号，如10002，显示商品编号为10002的记录 模糊查询：商品编号只输入1000，就可以把所有商品编号包含1000的商品查询出来。<br>
                                            （3）商品更新：该模块将实现对商品的基本信息的修改功能。
                                            包括：商品名称、商品条码、生产编号、商品售价、商品规格、商品单位、商品进价、商品种类、供货商家等基本信息。<br>
                                            （4）商品删除/商品销售：该模块将实现对商品的基本信息的删除功能，涉及到表关联，前台销售模块。
                                            输入要删除的商品编号ID点击删除按钮即可。从而为商品入库、出库、库存统计提供基本信息。
                                        </div>
                                    </div>
                                </div>
                                <div class="panel panel-default">
                                    <div class="panel-heading">
                                        <h4 class="panel-title">
                                            <a data-toggle="collapse" data-parent="#accordion"
                                               href="#collapseTwo">
                                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;二、销售管理
                                            </a>
                                        </h4>
                                    </div>
                                    <div id="collapseTwo" class="panel-collapse collapse">
                                        <div class="panel-body">
                                            （1）销售添加：该模块将实现对商品销售的基本信息的添加功能。从而为商品库存统计提供基本信息
                                            包括：商品名称、商品条码、商品销售价格、商品销售数量、商品单位、销售总金额、销售管理员、销售商品时间等。<br>
                                            （2）销售查询：该模块间实现对商品销售的基本信息的基本查询功能。
                                            包括：根据特定条件查询（如：商品名称、商品条码、商品种类、销售时间等）并分页显示商品信息；提供上一页，下一页查询功能，
                                            并且可以点击按钮查看销售总金额由高到低、由低到高排序；销售商品时间由高到低、由低到高排序，
                                            精确查询：例如只输入完整的商品编号，如10002，显示商品编号为10002的记录；模糊查询：商品编号只输入1000，就可以把所有商品编号包含1000的商品查询出来。<br>
                                            （3）销售更新：该模块将实现对销售商品的基本信息的修改功能。
                                            包括：商品名称、商品条码、商品销售价格、商品销售数量、商品单位、销售总金额、销售管理员、销售商品时间等基本信息。<br>
                                            （4）销售删除：该模块间实现对销售商品基本信息的删除功能。由于销售管理员操作不正确导致需要删除销售信息，输入要删除的商品编号ID点击删除按钮即可。
                                        </div>
                                    </div>
                                </div>
                                <div class="panel panel-default">
                                    <div class="panel-heading">
                                        <h4 class="panel-title">
                                            <a data-toggle="collapse" data-parent="#accordion"
                                               href="#collapseThree">
                                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;三、采购管理
                                            </a>
                                        </h4>
                                    </div>
                                    <div id="collapseThree" class="panel-collapse collapse">
                                        <div class="panel-body">
                                            （1）采购单添加：该模块将实现对商品采购的基本信息的添加功能。可根据商品销售情况及商品库存情况自动生成采购单并采购，
                                            或者由采购管理员根据系统管理员下派任务添加采购单。从而为商品库存统计提供基本信息。
                                            包括：采购商品名称、采购商品价格（即进货价）、采购商品数量、采购商品所属种类、采购管理员、采购商品时间等基本信息。<br>
                                            （2）采购单查询：该模块将实现对采购商品的基本信息的查询功能。
                                            包括：根据特定条件查询（如：商品名称、采购时间、商品条码、商品种类等）并分页显示采购信息；提供上一页，下一页查询功能，
                                            精确查询：例只输入完整的商品编号，如10002，显示商品编号为10002的记录 模糊查询：商品编号只输入1000，就可以把所有商品编号包含1000的商品查询出来。<br>
                                            （3）采购单修改：该模块将实现对采购商品基本信息的修改功能。
                                            包括：根据采购编号修改采购商品名称、采购商品价格（即进货价）、采购商品数量、采购商品所属种类、采购管理员、采购商品时间等基本信息。<br>
                                            （4）采购单删除：该模块将实现对采购商品基本信息的删除功能。由于采购管理员操作不正确导致需要删除采购单信息，输入要删除的采购编号点击删除按钮即可删除采购单信息。
                                        </div>
                                    </div>
                                </div>
                                <div class="panel panel-default">
                                    <div class="panel-heading">
                                        <h4 class="panel-title">
                                            <a data-toggle="collapse" data-parent="#accordion"
                                               href="#collapseFour">
                                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;四、供货管理
                                            </a>
                                        </h4>
                                    </div>
                                    <div id="collapseFour" class="panel-collapse collapse">
                                        <div class="panel-body">
                                            （1）供货商添加：该模块将实现对供货商基本信息的添加功能。从而为商品采购提供基本信息。
                                            包括：供货商编号、供货商名称、供货商品名称、供货商品价格（即进货价）供货商品单位、供货商品种类、供货联系人、供货联系人电话、联系人邮箱、供货商地址等基本信息。<br>
                                            （2）供货商查询：该模块将实现对供货商基本信息的查询功能。
                                            包括：根据特定条件查询（如：供货商名称、供货商品种类）并分页显示采购信息；提供上一页，下一页查询功能。<br>
                                            （3）供货商修改：该模块将实现对供货商基本信息的修改功能。
                                            包括：根据供货商编号修改供货商名称、供货商品名称、供货商品价格（即进货价）供货商品单位、供货商品种类、供货联系人、供货联系人电话、联系人邮箱、供货商地址等基本信息。<br>
                                            （4）供货商删除： 该模块将实现对供货商基本信息的删除功能。由于更换供货商或者供货商倒闭需要删除供货商信息，输入要删除的供货商编号点击删除按钮即可删除供货商信息。
                                        </div>
                                    </div>
                                </div>
                                <div class="panel panel-default">
                                    <div class="panel-heading">
                                        <h4 class="panel-title">
                                            <a data-toggle="collapse" data-parent="#accordion"
                                               href="#collapseFive">
                                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;五、用户管理
                                            </a>
                                        </h4>
                                    </div>
                                    <div id="collapseFive" class="panel-collapse collapse">
                                        <div class="panel-body">
                                            （1）用户添加：该模块将实现对用户管理员基本信息的添加功能。从而为系统管理提供基本信息。
                                            包括：用户编号、用户账号、用户密码、用户姓名、用户性别、用户电话、用户邮箱、用户职位（如：系统管理员；销售管理员；商品管理员；采购管理员；仓库管理员等）、用户所属部门等基本信息。<br>
                                            （2）用户查询：该模块将实现对用户管理员基本信息的查询功能。
                                            包括：根据特定条件查询（如：用户账号、用户职位等）并分页显示用户管理员信息；提供上一页，下一页查询功能。<br>
                                            （3）用户修改：该模块将实现对用户管理员基本信息的修改功能。
                                            包括：根据用户管理员编号修改用户账号、用户密码、用户姓名、用户性别、用户电话、用户邮箱、用户职位（如：系统管理员；销售管理员；商品管理员；采购管理员；仓库管理员等）、用户所属部门等基本信息。<br>
                                            （4）用户删除：该模块将实现对用户管理员基本信息的删除功能。由于用户管理员离职或者人事变动等情况需要删除用户基本信息，输入需要删除的用户编号点击删除按钮即可删除用户信息。<br>
                                            （5）用户权限：此功能模块主要是对可以使用此系统的用户进行管理，不同类别的用户管理员权限不同，操作不同。如：系统管理员进入系统可以查看所有功能模块，但不能修改，删除，可以对用户管理模块进行修改删除操作；
                                            销售管理员进入系统只能对销售管理模块进行查询，修改，删除操作，对其他模块不能够操作；仓库管理员进入系统只能对仓库管理模块进行查询，修改，删除操作，对其他模块不能够操作；
                                            采购管理员进入系统只能对采购管理和供货商管理模块进行查询，修改，删除操作，对其他模块不能够操作；商品管理员进入系统只能对商品管理模块进行查询，修改，删除操作，对其他模块不能够操作。
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </td>
                    </tr>

                </table>
            </div>
            <div  class="tab-pane fade " id="systemTwo">
                <table style="padding-top: 30px; padding-left: 0px; width: 1400px; height: 650px; text-align:left">
                    <tr>
                        <td>
                            #2018-04-04 <br>
                            毕业设计：超市进销存管理系统Supermarket inventory management system. <br>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;进销存管理系统是一个基于Web的应用系统，它是一个面对当前的进销存管理工作基本还处于手工和半信息自动化处理状态而应运而生的一个基于Web的一个完全信息自动化的系统，它包括商品信息，进货信息,销售信息,仓库信息,以及统计分析及系统管理一体的应用系统。<br>
                            （二）系统开发： <br><br>
                            <div class="panel-group" id="accordionTwo">
                                <div class="panel panel-default">
                                    <div class="panel-heading">
                                        <h4 class="panel-title">
                                            <a data-toggle="collapse" data-parent="#accordion"
                                               href="#collapseOneTwo">
                                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;一、MySQL关系型数据库
                                            </a>
                                        </h4>
                                    </div>
                                    <div id="collapseOneTwo" class="panel-collapse collapse in">
                                        <div class="panel-body">
                                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;MySQL是一个关系型数据库管理系统，由瑞典MySQL AB 公司开发，目前属于 Oracle 旗下产品。MySQL 是最流行的关系型数据库管理系统之一，在 WEB 应用方面，MySQL是最好的 RDBMS (Relational Database Management System，关系数据库管理系统) 应用软件。
                                            MySQL是一种关系数据库管理系统，关系数据库将数据保存在不同的表中，而不是将所有数据放在一个大仓库内，这样就增加了速度并提高了灵活性。
                                            MySQL所使用的 SQL 语言是用于访问数据库的最常用标准化语言。MySQL 软件采用了双授权政策，分为社区版和商业版，由于其体积小、速度快、总体拥有成本低，尤其是开放源码这一特点，一般中小型网站的开发都选择 MySQL 作为网站数据库。
                                            <br>
                                            数据库及数据表的设计：<br>
                                            UserInfo（用户信息表）<br>
                                            Warehouse（仓库信息表）<br>
                                            Purchase（采购信息表）<br>
                                            Goods（商品信息表）<br>
                                            Supplier（供货商信息表）<br>
                                            Sales（销售信息表）<br>
                                            Category（商品种类表）<br>
                                        </div>
                                    </div>
                                </div>
                                <div class="panel panel-default">
                                    <div class="panel-heading">
                                        <h4 class="panel-title">
                                            <a data-toggle="collapse" data-parent="#accordion"
                                               href="#collapseTwoTwo">
                                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;二、SSM（Spring + Spring MVC + Mybatis）框架
                                            </a>
                                        </h4>
                                    </div>
                                    <div id="collapseTwoTwo" class="panel-collapse collapse">
                                        <div class="panel-body">
                                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;SSM(Spring+SpringMVC+MyBatis)框架集由Spring、SpringMVC、MyBatis三个开源框架整合而成，常作为数据源较简单的web项目的框架。
                                            其中spring是一个轻量级的控制反转(IoC)和面向切面(AOP)的容器框架。
                                            SpringMVC分离了控制器、模型对象、分派器以及处理程序对象的角色，这种分离让它们更容易进行定制。
                                            MyBatis是一个支持普通SQL查询，存储过程和高级映射的优秀持久层框架。
                                        </div>
                                    </div>
                                </div>
                                <div class="panel panel-default">
                                    <div class="panel-heading">
                                        <h4 class="panel-title">
                                            <a data-toggle="collapse" data-parent="#accordion"
                                               href="#collapseThreeTwo">
                                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;三、JSP、JS、CSS等技术（部分使用）
                                            </a>
                                        </h4>
                                    </div>
                                    <div id="collapseThreeTwo" class="panel-collapse collapse">
                                        <div class="panel-body">
                                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;JSP全名为Java Server Pages，中文名叫java服务器页面，其根本是一个简化的Servlet设计，
                                            它是由Sun Microsystems公司倡导、许多公司参与一起建立的一种动态网页技术标准。JSP技术有点类似ASP技术，
                                            它是在传统的网页HTML(标准通用标记语言的子集)文件(*.htm,*.html)中插入Java程序段(Scriptlet)和JSP标记(tag)，从而形成JSP文件，后缀名为(*.jsp)。
                                            &nbsp;&nbsp;&nbsp;&nbsp;JSP(JavaServer Pages)是一种动态页面技术，它的主要目的是将表示逻辑从Servlet中分离出来。<br>
                                            &nbsp;&nbsp;&nbsp;&nbsp;JavaScript一种直译式脚本语言，是一种动态类型、弱类型、基于原型的语言，内置支持类型。它的解释器被称为JavaScript引擎，为浏览器的一部分，
                                            广泛用于客户端的脚本语言，最早是在HTML（标准通用标记语言下的一个应用）网页上使用，用来给HTML网页增加动态功能。<br>
                                            &nbsp;&nbsp;&nbsp;&nbsp;CSS层叠样式表(英文全称:Cascading Style Sheets)是一种用来表现HTML(标准通用标记语言的一个应用)或XML(标准通用标记语言的一个子集)等文件样式的计算机语言。
                                            CSS不仅可以静态地修饰网页，还可以配合各种脚本语言动态地对网页各元素进行格式化。CSS能够对网页中元素位置的排版进行像素级精确控制，支持几乎所有的字体字号样式，拥有对网页对象和模型样式编辑的能力。

                                        </div>
                                    </div>
                                </div>
                                <div class="panel panel-default">
                                    <div class="panel-heading">
                                        <h4 class="panel-title">
                                            <a data-toggle="collapse" data-parent="#accordion"
                                               href="#collapseFourTwo">
                                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;四、开发工具IDEA
                                            </a>
                                        </h4>
                                    </div>
                                    <div id="collapseFourTwo" class="panel-collapse collapse">
                                        <div class="panel-body">
                                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;IDEA 全称IntelliJ IDEA，是java语言开发的集成环境，IntelliJ在业界被公认为最好的java开发工具之一，
                                            尤其在智能代码助手、代码自动提示、重构、J2EE支持、Ant、JUnit、CVS整合、代码审查、 创新的GUI设计等方面的功能可以说是超常的。
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </td>
                    </tr>

                </table>
            </div>
        </td>

    </table>
    </div>
    <br><br><br><br>
    <hr>
    <div class="blockquote-footer" style="margin-top: 20px; margin-left: 800px">
        <em>&copy; 2018 @baishuailei 版权所有</em>
        <em>&nbsp;—</em>
    </div>
</body>
</html>
