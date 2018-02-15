<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="inspinia">
<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	<!--  meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" -->

    <!-- Page title set in pageTitle directive -->
    <title page-title>Management Tool</title>

    <!-- Bootstrap -->
    <link href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css" rel="stylesheet">

    <!-- Font awesome -->
    <link href="<%=request.getContextPath()%>/resources/font-awesome/css/font-awesome.css" rel="stylesheet">

    <!-- Main Inspinia CSS files -->
    <link href="<%=request.getContextPath()%>/resources/css/animate.css" rel="stylesheet">
    <link id="loadBefore" href="<%=request.getContextPath()%>/resources/css/style.css" rel="stylesheet">


</head>

<!-- ControllerAs syntax -->
<!-- Main controller with serveral data used in Inspinia theme on diferent view -->
<body ng-controller="MainCtrl as main" class="{{$state.current.data.specialClass}}" landing-scrollspy id="page-top">

<!-- Main view  -->
   <div class="middle-box text-center loginscreen animated fadeInDown">
        <div>
            <div>

                <h1 class="logo-name">RTT</h1>

            </div>
            <h3>Welcome to Management Tool</h3>
            <p>Perfectly designed and developed with lots of extra new features.
                <!--Continually expanded and constantly improved Inspinia Admin Them (IN+)-->
            </p>
            <p>Login in. To see it in action.</p>
            <form class="m-t" role="form" action="index.html">
                <div class="form-group">
                    <input type="email" class="form-control" placeholder="Username" required="">
                </div>
                <div class="form-group">
                    <input type="password" class="form-control" placeholder="Password" required="">
                </div>
                <button type="submit" class="btn btn-primary block full-width m-b">Login</button>

                <a href="#"><small>Forgot password?</small></a>
                <p class="text-muted text-center"><small>Do not have an account?</small></p>
                <a class="btn btn-sm btn-white btn-block" href="register.html">Create an account</a>
            </form>
            <p class="m-t"> <small>RTT Management Tool v3 &copy; 2017</small> </p>
        </div>
    </div>



<!-- jQuery and Bootstrap -->
<script src="<%=request.getContextPath()%>/resources/js/jquery/jquery-3.1.1.min.js"></script>
<script src="<%=request.getContextPath()%>/resources/js/plugins/jquery-ui/jquery-ui.min.js"></script>
<script src="<%=request.getContextPath()%>/resources/js/bootstrap/bootstrap.min.js"></script>

<!-- MetsiMenu -->
<script src="<%=request.getContextPath()%>/resources/js/plugins/metisMenu/jquery.metisMenu.js"></script>

<!-- SlimScroll -->
<script src="<%=request.getContextPath()%>/resources/js/plugins/slimscroll/jquery.slimscroll.min.js"></script>

<!-- Peace JS -->
<script src="<%=request.getContextPath()%>/resources/js/plugins/pace/pace.min.js"></script>

<!-- Custom and plugin javascript -->
<script src="<%=request.getContextPath()%>/resources/js/inspinia.js"></script>

<!-- Main Angular scripts-->
<script src="<%=request.getContextPath()%>/resources/js/angular/angular.min.js"></script>
<script src="<%=request.getContextPath()%>/resources/js/angular/angular-sanitize.js"></script>
<!-- script s r c ="<%=request.getContextPath()%>/resources/js/plugins/oclazyload/dist/ocLazyLoad.min.js"></script -->
<script src="<%=request.getContextPath()%>/resources/js/angular-translate/angular-translate.min.js"></script>
<!--script src="<%=request.getContextPath()%>/resources/js/ui-router/angular-ui-router.min.js"></script -->
<script src="<%=request.getContextPath()%>/resources/js/bootstrap/ui-bootstrap-tpls-1.1.2.min.js"></script>
<script src="<%=request.getContextPath()%>/resources/js/plugins/angular-idle/angular-idle.js"></script>


<!-- Anglar App Script -->
<script src="<%=request.getContextPath()%>/resources/js/app.js">		</script>
<script src="<%=request.getContextPath()%>/resources/js/config.js">		</script>
<!-- script src="<%=request.getContextPath()%>/resources/js/translations.js"></script-->
<script src="<%=request.getContextPath()%>/resources/js/directives.js">	</script>
<script src="<%=request.getContextPath()%>/resources/js/controllers.js"></script>

</body>
</html>