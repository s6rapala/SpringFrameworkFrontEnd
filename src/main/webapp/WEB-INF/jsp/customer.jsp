<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Customer Details</title>
</head>
<body>
Customer Details:
<br/><br/>
<table>
  <tr>
    <td>ID</td>
    <td>Name</td>
    <td>Location</td>
  </tr>
    <tr>
      <td>${customer.id}</td>
      <td>${customer.name}</td>
      <td>${customer.location}</td>
    </tr>
</table>
</body>
</html>