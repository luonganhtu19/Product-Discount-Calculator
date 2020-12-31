<%--
  Created by IntelliJ IDEA.
  User: luong
  Date: 12/31/2020
  Time: 3:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product Discount Calculator</title>
  </head>
  <body>
  <form action="/display-discount" method="post">
    <label for="pd" >Product Description </label>
    <input type="text" name="Product_Description" id="pd"  placeholder="Enter input value">
    <label for="lp">List Price</label>
    <input type="text" name="List_Price" id="lp" placeholder="Enter input value">
    <label for="dp">Discount Percent</label>
    <input type="text" name="Discount_Percent" id="dp" placeholder="Enter input value">
    <input type="submit" id="submit" name="submit">
  </form>
  </body>
</html>
