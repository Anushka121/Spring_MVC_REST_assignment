<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<body>
	<h2>Trainee details</h2>

	<c:if test="${not empty lists}">

		<ul>
			<c:forEach var="trainee" items="${lists}">
				<li>Trainee ID:${trainee.traineeId}</li>
				<li>Trainee Name:${trainee.traineeName}</li>
				<li>Trainee Domain:${trainee.domain}</li>
				<li>Trainee Location:${trainee.location}</li>
				
			</c:forEach>
		</ul>

	</c:if>
</body>
</html>
