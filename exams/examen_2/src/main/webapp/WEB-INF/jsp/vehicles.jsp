<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <link rel="stylesheet" href="style.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
  </head>
  <header>
    <jsp:include page="includes/navbar.jsp"/>
 </header>
  <body>
    <div class="container">
      <table class="table">
        <thead class="black white-text">
          <tr>
            <th scop ="col">ID</th>
            <th scope="col">Model</th>
            <th scope="col">Version</th>
            <th scope="col">Segment Category</th>
            <th scope="col">Year Model</th>
            <th scope="col">Number of doors</th>
            <th scope="col">Wheel Brand</th>
            <th scope="col">Engine Brand</th>
          </tr>
        </thead>
          <c:forEach items="${vehicleList}" var="vehicle">
          <tr>
            <th scope="row">"${vehicle.getId()}"</th>
            <td><c:out value="${vehicle.getModel()}" /></td>
            <td><c:out value="${vehicle.getVersion()}" /></td>
            <td><c:out value="${vehicle.getSegmentCategory()}" /></td>
            <td><c:out value="${vehicle.getYearModel()}" /></td>
            <td><c:out value="${vehicle.getNumberOfDoors()}" /></td>
            <td><c:out value="${vehicle.getWheel().getBrand()}" /></td>
            <td><c:out value="${vehicle.getEngine().getBrandName()}" /></td>
          </tr>
        </c:forEach>
      </table>
    <a href="/index" class="btn btn-secondary my-2">Back</a>
    </div>
  </body>
</html>