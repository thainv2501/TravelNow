<%-- 
    Document   : customerView
    Created on : Oct 28, 2021, 10:36:57 AM
    Author     : taola
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>TravelNow</title>
    <link rel="stylesheet" href="css/customerView.css" />
    <link
      href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500&display=swap"
      rel="stylesheet"
    />
    <link
      rel="stylesheet"
      href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
    />
  </head>

  <body>
      <jsp:include page="menu.jsp"></jsp:include>

    <div class="container">
      <div class="hot-places">
        <h1>Customer Orders</h1>
      <c:forEach items="${orders}" var="order">
        <div class="card">
          <div>
            <img
              src="${order.place_img}"
              alt=""
            />
          </div>
          <div class="card-content">
            <div class="card-top">
              <h4>${order.place_name}</h4>
              <div class="card-description">
                 <table>
                     <tr>
                    <th>Loai hinh :</th>
                    <td>${order.vehical_name}</td>
                    <th>Brand :</th>
                    <td>${order.brand_name}</td>
                    <th>So ve :</th>
                    <td>${order.ticket_quantity}</td>
                  </tr>
                  <tr>
                    <th>Hotel :</th>
                    <td>${order.hotel_name}</td>
                    <th>So Phong :</th>
                    <td>${order.room_quantity}</td>
                  </tr>
                  <tr>
                    <th>Order Date :</th>
                    <td>${order.order_date}</td>
                    <th>Start Date :</th>
                    <td>${order.start_date}</td>
                  </tr>
                  <tr>
                    <th>Order Price :</th>
                    <td>${order.order_price} VND</td>
                    <td>${order.order_id} </td>
                  </tr>
                  
                </table>
              </div>
            </div>
            <div class="card-bottom"></div>
          </div>
        </div>
                    </c:forEach>
      </div>
    </div>
  </body>
</html>
