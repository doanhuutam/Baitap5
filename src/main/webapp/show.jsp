<%--
  Created by IntelliJ IDEA.
  User: tam
  Date: 03/08/2021
  Time: 13:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h2>Basic Table</h2>
  <table class="table">
    <thead>
    <tr>
      <th>Id</th>
      <th>name</th>
      <th>date</th>
      <th>address</th>
      <th>phone</th>
      <th>Email</th>
      <th>idphongBan</th>
      <th>create</th>
      <th>edit</th>
      <th>delete</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="nhanvien" varStatus="loop"><
    <tr>
      <td>${nhanvien.getId()}</td>
      <td>${nhanvien.getName()}</td>
      <td>${nhanvien.getDate()}</td>
      <td>${nhanvien.getAddress()}</td>
      <td>${nhanvien.getPhone()}</td>
      <td>${nhanvien.getEmail()}</td>
      <td>${nhanvien.getIdphongBan()}</td>
      <td><a href="/?action=create"  class="btn btn-primary">Create</a></td>
      <td><a href="/?action=edit&index=${loop.index}" class="btn btn-warning">Edit</a></td>
      <td><a href="/?action=delete&index=${loop.index}" class="btn btn-danger">Delete</a></td>

    </tr>
    </c:forEach>

    </tbody>
  </table>
</div>

</body>
</html>
