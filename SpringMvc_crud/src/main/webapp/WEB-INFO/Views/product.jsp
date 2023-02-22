<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" 
integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" 
integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
</head>
<body>
<div class="container"><div class="card" style="width: 45rem;">
<form action="./register"  modelAttribute="productkey">
<center><h1>register</h1></center><hr>
<div class="mb-3">
<label for="exampleFormControlInput1" class="form-label">pId</label>
<input type="text" class="form-control" name="pid" placeholder="pid"></div>
<div class="mb-3">
<label for="exampleFormControlInput1" class="form-label">pname </label>
<input type="text" class="form-control" name="pname" placeholder="pname"></div>
<div class="mb-3">
<label for="exampleFormControlInput1" class="form-label">Qty</label>
<input type="text" class="form-control" name="Qty" placeholder="Qty"></div>
<div class="mb-3">
<label for="exampleFormControlInput1" class="form-label">Price </label>
<input type="text" class="form-control" name="price" placeholder="price"></div>

<input type="submit" value="register">
</form>

</div>
</div>
<a href="view">ViewAllProducts</a>
</body>
</html>