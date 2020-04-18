<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>

<body>
<a href="/">Go Home </a>

<h2>
Trainee Id is :  <c:out value="${trainee.traineeId}"/>
<br>
Trainee Name is : <c:out value="${trainee.traineeName}"/>
<br>
Trainee Domain is:  <c:out value="${trainee.domain}"/>
<br>
Trainee Location is: <c:out value="${trainee.location}"/>


</h2>
</body>
</html>