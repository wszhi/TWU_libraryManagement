<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>
<script type="application/javascript" src="<c:url value="/js/jquery.bxslider.min.js"/>"></script>
<script type="application/javascript" src="<c:url value="/js/angular.min.js"/>"></script>
<script type="application/javascript" src="<c:url value="/js/angular-messages.min.js"/>"></script>
<link rel="stylesheet/less" type="text/css" href='<c:url value="/css/headStyle.less"/>' />
<link rel="stylesheet/less" type="text/css" href='<c:url value="/css/home.less"/>' />
<script src="<c:url value="/js/less.js"/>" type="text/javascript"></script>

<div ng-controller="userController as userCtrl">
    <div class="headContent">
        <div class="imgLogo">
            <a href="<c:url value="/index"/>"><img src="<c:url value="/images/logo.jpg"/>"/></a>
        </div>
       <div class="search">
            <input type="text" placeholder="搜索书籍" class="formControl" id="searchByName" value="">
            <button class="btnPrimary" ng-click="">搜索</button>
        </div>

        <div>
            <h1><a href="<c:url value="/book/listOfBook"/>">Book List</a></h1>
        </div>
    </div>
</div>
