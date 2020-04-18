<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<<!DOCTYPE html>
<html>

<body>
<form method="get" action="processupdate">
<label>Trainee ID </label>
<div>
<input type="number" name="traineeid">
</div>

<label>Trainee Name</label>
<div>
<input type="text" name="traineename">
</div>

<label>Trainee Domain</label>
<div>
<input type="text" name="traineedomain">
</div>

<label>Trainee Location</label>
<div>
<input type="text" name="traineelocation">
</div>

<input type="submit" value="Update Trainee">

</form>
</body>
</html>