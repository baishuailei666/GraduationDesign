<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/4/23 0023
  Time: 15:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width,initial-scale=1.0">
    <title>Bootstrap选项卡</title>
    <!-- 引入Bootstrap的样式表 -->
    <link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
    <script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>

    <title>demo</title>
</head>
<body>
<!--
1.导航对应的所有内容需要放在一个class为tab-content的层里；
2.对应的每个内容块都要加上tab-pane的class，且激活的内容块加上active的class
3.给每一个导航的a标签添加data-toggle="tab"；
4.给每一个内容块添加一个id，和选项卡的锚点对应
-->
<%--<ul id="myTab" class="nav nav-tabs">--%>
    <%--<li class="active">--%>
        <%--<a href="#home" data-toggle="tab">--%>
            <%--菜鸟教程--%>
        <%--</a>--%>
    <%--</li>--%>
    <%--<li><a href="#ios" data-toggle="tab">iOS</a></li>--%>
    <%--<li class="dropdown">--%>
        <%--<a href="#" id="myTabDrop1" class="dropdown-toggle"--%>
           <%--data-toggle="dropdown">Java--%>
            <%--<b class="caret"></b>--%>
        <%--</a>--%>
        <%--<ul class="dropdown-menu" role="menu" aria-labelledby="myTabDrop1">--%>
            <%--<li><a href="#jmeter" tabindex="-1" data-toggle="tab">jmeter</a></li>--%>
            <%--<li><a href="#ejb" tabindex="-1" data-toggle="tab">ejb</a></li>--%>
        <%--</ul>--%>
    <%--</li>--%>
<%--</ul>--%>
<%--<div id="myTabContent" class="tab-content">--%>
    <%--<div class="tab-pane fade in active" id="home">--%>
        <%--<p>菜鸟教程是一个提供最新的web技术站点，本站免费提供了建站相关的技术文档，帮助广大web技术爱好者快速入门并建立自己的网站。菜鸟先飞早入行——学的不仅是技术，更是梦想。</p>--%>
    <%--</div>--%>
    <%--<div class="tab-pane fade" id="ios">--%>
        <%--<p>iOS 是一个由苹果公司开发和发布的手机操作系统。最初是于 2007 年首次发布 iPhone、iPod Touch 和 Apple--%>
            <%--TV。iOS 派生自 OS X，它们共享 Darwin 基础。OS X 操作系统是用在苹果电脑上，iOS 是苹果的移动版本。</p>--%>
    <%--</div>--%>
    <%--<div class="tab-pane fade" id="jmeter">--%>
        <%--<p>jMeter 是一款开源的测试软件。它是 100% 纯 Java 应用程序，用于负载和性能测试。</p>--%>
    <%--</div>--%>
    <%--<div class="tab-pane fade" id="ejb">--%>
        <%--<p>Enterprise Java Beans（EJB）是一个创建高度可扩展性和强大企业级应用程序的开发架构，部署在兼容应用程序服务器（比如 JBOSS、Web Logic 等）的 J2EE 上。--%>
        <%--</p>--%>
    <%--</div>--%>
<%--</div>--%>


<%--<ul id="myTab" class="nav nav-tabs">--%>
    <%--<li class="active">--%>
        <%--<a href="#home" data-toggle="tab">菜鸟教程</a>--%>
    <%--</li>--%>
    <%--<li><a href="#ios" data-toggle="tab">iOS</a></li>--%>
    <%--<li class="dropdown">--%>
        <%--<a href="#" id="myTabDrop1" class="dropdown-toggle"--%>
           <%--data-toggle="dropdown">Java <b class="caret"></b>--%>
        <%--</a>--%>
        <%--<ul class="dropdown-menu" role="menu" aria-labelledby="myTabDrop1">--%>
            <%--<li><a href="#jmeter" tabindex="-1" data-toggle="tab">--%>
                <%--jmeter</a>--%>
            <%--</li>--%>
            <%--<li><a href="#ejb" tabindex="-1" data-toggle="tab">--%>
                <%--ejb</a>--%>
            <%--</li>--%>
        <%--</ul>--%>
    <%--</li>--%>
<%--</ul>--%>

<%--<div id="myTabContent" class="tab-content">--%>
    <%--<div class="tab-pane fade in active" id="home">--%>
        <%--<p>菜鸟教程是一个提供最新的web技术站点，本站免费提供了建站相关的技术文档，帮助广大web技术爱好者快速入门并建立自己的网站。菜鸟先飞早入行——学的不仅是技术，更是梦想。</p>--%>
    <%--</div>--%>
    <%--<div class="tab-pane fade" id="ios">--%>
        <%--<p>iOS 是一个由苹果公司开发和发布的手机操作系统。最初是于 2007 年首次发布 iPhone、iPod Touch 和 Apple--%>
            <%--TV。iOS 派生自 OS X，它们共享 Darwin 基础。OS X 操作系统是用在苹果电脑上，iOS 是苹果的移动版本。</p>--%>
    <%--</div>--%>
    <%--<div class="tab-pane fade" id="jmeter">--%>
        <%--<p>jMeter 是一款开源的测试软件。它是 100% 纯 Java 应用程序，用于负载和性能测试。</p>--%>
    <%--</div>--%>
    <%--<div class="tab-pane fade" id="ejb">--%>
        <%--<p>Enterprise Java Beans（EJB）是一个创建高度可扩展性和强大企业级应用程序的开发架构，部署在兼容应用程序服务器（比如 JBOSS、Web Logic 等）的 J2EE 上。--%>
        <%--</p>--%>
    <%--</div>--%>
<%--</div>--%>
<%--<script>--%>
    <%--$(function () {--%>
        <%--$('#myTab li:eq(1) a').tab('show');--%>
    <%--});--%>
<%--</script>--%>

<!DOCTYPE>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>可编辑下拉框 </title>
</head>
</head>
<body>
<select name="fason"style="width: 140px;">
    <option value=""></option>
    <option value="作者 ">作者 </option>
    <option value="123">123</option>
    <option value="124">124</option>
    <option value="125">125</option>
    <option value="126">126</option>
    <option value="127">127</option>
</select>
<script >
    function combox(obj,select){
        this.obj=obj
        this.name=select;
        this.select=document.getElementsByName(select)[0];
        /*要转换的下拉框 */
    }
    /*初始化对象 */
    combox.prototype.init=function(){
            var inputbox="<input name='combox_"+this.name+"' onchange='"+this.obj+".find()' "
            inputbox+="style='position:absolute;width:"+(this.select.offsetWidth-16)+";height:"+this.select.o ffsetHeight+";left:"+getL(this.select)+";top:"+getT(this.select)+"'>"
            document.write(inputbox)
            with(this.select.style){
                left=getL(this.select)
                top=getT(this.select)
                position="absolute"
                clip="rect(0 "+(this.select.offsetWidth)+" "+this.select.offsetHeight+" "+(this.select.offsetWidth-18)+")"
                /*切割下拉框 */
            }
            this.select.onchange=new Function(this.obj+".change()")
            this.change()
        }

</script>


<div>
    <form>
        <div class="text">
            出发地：<input type="text"/>
            目的地：<input type="text"/>
        </div>
        <input id="x" class="btn btn-primary" type="button" value="X"/>
        <input id="x2" class="btn btn-info" type="button" value="y"/>

        <input type="reset" value="重置">
    </form>
</div>


<script src="../js/jquery-1.11.3.js"></script>
<script type="text/javascript">

    $(document).ready(function(e){
        /*点击删除 清空输入框的内容*/
        $('.btn').click(function(){
            $('.text input').val('');
        });
    });
</script>


<div class="has-feedback">
    <label class="text-info" for="addressId">输入地址</label>
    <input class="form-control" id="addressId" name="address">

    <!--删除按钮-->
    <a class="glyphicon glyphicon-remove btn form-control-feedback"style="pointer-events: auto"></a>

</div>
<script type="text/javascript">
    $(function () {
        $('a').click(function () {
            $('#addressId')[0].value = "";
        })
    })
</script>


<label for="goods_unit_add_te" class="col-sm-2 control-label">商 品 单 位：</label>
<div class="input-group">
    <div class="dropdown">
        <input id="goods_unit_add_te" style="width: 300px" class="form-control" type="text" name="goodsUnit" placeholder="点击选择">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">
            <button class="btn btn-info btn-sm" style="height: 33px">
                <span class="caret"></span>
            </button>
        </a>
        <ul id="unit_select" class="dropdown-menu dropdown-menu-right" role="menu">
            <li><a href="#">包</a></li>
            <li><a href="#">袋</a></li>
            <li><a href="#">箱</a></li>
            <li><a href="#">个</a></li>
            <li><a href="#">把</a></li>
            <li><a href="#">瓶</a></li>
            <li><a href="#">件</a></li>
        </ul>
    </div>
</div>
<script>
    $(function(){
        $('#unit_select li').click(function(){
//            alert($(this).text());
            $('#goods_unit_add_te').val($(this).text());
        });
    });


</script>

<form name="update_user_modal" method="get">
<input type="button" name="user_update_btn" value="按钮">
</form>
<script>
    $(document).on('click',"#user_update_btn",function(){
        //1 验证输入的信息是否合法
        //alert($("#update_user_modal form").serialize());//获取表单数据失败
        console.log("表单数据为："+$("#update_user_modal form").serialize()+",下面发送put请求");
        //2 使用ajax发送put请求
        $.ajax({
            url:"${pageContext.request.contextPath}/goods/page/1",
            type:"post",
            data:$("#update_user_modal form").serialize(),//输出修改模态框中表单的序列化结果：+"&_method=PUT"
            success:function(result){
                alert(result.msg);
                //关闭对话框

                //回到本页面
            },
            error:function(result){
                console.log("请求失败");
            }
        })
    })
</script>

</body>
</html>
