<%--
  Created by IntelliJ IDEA.
  User: tam
  Date: 03/08/2021
  Time: 19:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <form method="post"></form>
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
        <tr>
            <td><input type="text" name="id" placeholder="nhậpid "value="${nhanvien.id}"></td>
            <td><input type="text" name="name" placeholder="nhập name "value="${nhanvien.name}"></td>
            <td><input type="text" name="address" placeholder="nhập address"value="${nhanvien.date}"></td>
            <td><input type="text" name="date" placeholder="nhập date"value="${nhanvien.address}"></td>
            <td><input type="text" name="phone" placeholder="nhập phone"value="${nhanvien.phone}"></td>
            <td><input type="text" name="email" placeholder="nhập email"value="${nhanvien.email}"></td>
            <td><input type="text" name="idphongban" placeholder="nhập idphongban"value="${nhanvien.idphongban}"></td>


        </tr>
        <button type="submit"  class="btn btn-primary">Edit</button>

        </tbody>
    </table>
</div>

</body>
</html>
