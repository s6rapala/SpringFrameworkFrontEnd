<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Customer List</title>
</head>
<body>
List of Customers:
<br/><br/>
<table>
  <tr>
    <td>ID</td>
    <td>Name</td>
    <td>Location</td>
  </tr>
  <c:forEach items="${customers}" var="customer">
    <tr>
      <td>${customer.id}</td>
      <td>${customer.name}</td>
      <td>${customer.location}</td>
    </tr>
  </c:forEach>
</table>
</body>
</html>