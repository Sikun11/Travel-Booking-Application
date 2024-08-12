<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <!-- bootstrap css link -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body style="background: url(./images/plan-header.jpg);color: white">
<div class="container-fluid plan-header text-center">
    <div class="heading">
        <h1 style="margin:10rem">${msg}</h1>
        <p style="font-size: 1.3rem;">Come back to<a href="index.html" class="btn btn-info rounded-5" style="margin-left: 1rem;background-image: radial-gradient( circle farthest-corner at 10% 20%,  rgba(228,118,0,1) 0%, rgba(247,189,2,1) 90% );">Home</a></p>
    </div>
</div>

    
    <!-- bootstrap js link -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
        crossorigin="anonymous"></script>

</body>
</html>