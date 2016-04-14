<%@ page pageEncoding="UTF-8"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8}">
<title>首页</title>
<link rel="stylesheet"
	href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">
<style type="text/css">
.container{
                width:1200px;
}
.nav-left {
                min-width:220px;
	max-width: 300px;
	position:relative;
	float:left;
}
.main{
                min-width:800px;
                min-height:1400px;
                position:relative;
                float:left;
                background-color:yellow;;
}
</style>
</head>
<body data-spy="scroll" data-target="#myScrollspy">
	<div class="container">
		<div class="nav-left">
			<ul class="list-group">
				<li class="list-group-item">
					<div class="select" data-toggle="collapse" data-target="#collapse1">人事管理</div>
					<div class="collapse" id="collapse1">
						<ul class="list-group">
						                <a href="/erp/user/add"><li class="list-group-item select" >员工列表</li></a>
							<li class="list-group-item select">录入新员工</li>
							<li class="list-group-item select">删除员工</li>
							<li class="list-group-item select">工资结算</li>
						</ul>
					</div>
				</li>
				<li class="list-group-item">
					<div class="select" data-toggle="collapse" data-target="#collapse2">仓库管理</div>
					<div class="collapse" id="collapse2">
						<ul class="list-group">
							<li class="list-group-item select">入库管理</li>
							<li class="list-group-item select">出库管理</li>
							<li class="list-group-item select">清点库存</li>
						</ul>
					</div>
				</li>
				<li class="list-group-item">图像的数量</li>
				<li class="list-group-item">24*7 支持</li>
				<li class="list-group-item">每年更新成本</li>
			</ul>
		</div>
		
		<div class="main">
		main
		</div>
	</div>
</body>
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</html>
</html>