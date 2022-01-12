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
        <h1>Where to go now !</h1>
        
      </div>
      <div class="search-travel-tutorial">
          <form action="search" method="post" class="customer selection">
              <input class="item" id="cus-place" name="search_key" type="text" value="${txtS}" placeholder="Search !">
          <button class="item login" name="search" type="submit" >Search</button>
        </form>
        <div class="filter-bar">
            <form action="customerFilter" method="post" class="filter-bar-link">
           <select name="filter-link" id="filter-link" >
             <option value="all" ${tag =="all"?"selected":""} >All</option>
             <option value="place_name" ${tag =="place_name"?"selected":""} >A --> Z</option>
             <option value="place_name desc" ${tag =="place_name desc"?"selected":""} >Z --> A</option>
             <option value="tour_price" ${tag =="tour_price"?"selected":""} >Price from low to high </option>
             <option value="tour_price desc" ${tag =="tour_price desc"?"selected":""} > Price from high to low</option>
           </select>
                <button class="item login" name="filter" type="submit" >Filter</button>
          </form>
        </div>
      </div>
      <div class="travel-tutorial">
          <h1>Travel Tutorial</h1>
      <c:if test="${useable_tours == null}">
          <div class="nothing">
              <h1 style="border-bottom: solid #181e23 2px">NO result</h1>
          </div>
      </c:if>
          <c:forEach items="${useable_tours}" var="tour">
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