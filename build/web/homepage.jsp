<%-- 
    Document   : homepage
    Created on : Sep 29, 2021, 10:52:25 AM
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
    <link rel="stylesheet" href="css/style.css" />
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
  </head>

  <body>
          <jsp:include page="menu.jsp"></jsp:include>

    <div class="container">
      <div class="tiltle">
        <h1>Make a trip in a second!</h1>
        
      </div>
      <div class="search">
          <form action="search" method="post" class="customer selection">
              <input class="item" id="cus-place" type="text" name="search_key" placeholder="Where want to go ">
          <button class="item login" type="submit" name="search" >Let's go</button>
        </form>
      </div>
      <div class="hot-places">
          <h1>Hot Places</h1>
          <c:forEach items="${hot_tours}" var="tour">
        <div class="card">
            <img
            src="${tour.img}"
            alt=""
            />
          <div class="card-content">
          <div class="card-top">
          
          <h4>${tour.name}</h4>
          <div class="card-description">
            <p class="description">
            ${tour.status}
            </p>
          </div>
          </div>
            <div class="card-bottom">
              
              <p class="price">${tour.price} VND</p>
              <a href="getDetail?tid=${tour.id}" class="book-now">Book now</a>
            </div>
          </div>
          </div>
          </c:forEach>
       
      </div>
    </div>
          <jsp:include page="footer.jsp"></jsp:include>
  </body>
</html>