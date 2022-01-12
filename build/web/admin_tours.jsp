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
      <jsp:include page="admin_menu.jsp"></jsp:include>

    <div class="container">
      <div class="hot-places">
        <h1>Tours</h1>
        <div class="tool">
          <form action="">
            <input class="item" id="cus-place" type="text" placeholder="Search !">
          <button class="item login" type="submit" >Search</button>
          </form>
            <a href="admin_add_tour.jsp" class="book-now">Add More</a>
           
        </div>
      <c:forEach items="${tours}" var="tour">
        <div class="card">
          <div>
            <img
              src="${tour.img}"
              alt=""
            />
          </div>
          <div class="card-content">
            <div class="card-top">
                <h4>${tour.name} <c:if test="${tour.hot}"><i class="fa fa-fire" > Hot</i> </c:if></h4>
              <div class="card-description">
                 <table>
                     <tr>
                    <th>Tour ID :</th>
                    <td>${tour.id}</td>
                  </tr>
                  <tr>
                      <th>Tour price :</th>
                     <td>${tour.price} VND</tr>
                  </tr>
                  <tr>
                    <th>Status :</th>
                    <td>${tour.status}</td>
                  </tr>
                
                </table>
              </div>
            </div>
                  <div class="card-bottom">
                      <a  href="admin_edit_tour?tid=${tour.id}">Edit</a>
                  </div>
          </div>
        </div>
                    </c:forEach>
         <div class="page-index">
         <c:forEach begin="1" end="${pageNumber}" var="i">
          <a href="admin_tours?pi=${i}"> ${i}</a>
         </c:forEach>
          
        </div>
      </div>
    </div>
  </body>
</html>
