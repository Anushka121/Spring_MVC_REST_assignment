<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>

<body>
<div ="center">
<h2>
Customer Id is  <c:out value= "${customer.custId}"/>
customer Name is <c:out value="${customer.custName}"/>
</h2>
</div>
</body>
</html>