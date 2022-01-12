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
                    <h1>What hotel are you looking for !</h1>

                </div>
                <div class="search-travel-tutorial">
                    <form action="search_hotel" method="post" class="customer selection">
                        <input class="item" id="cus-place" name="search_key" type="text" value="${txtH}" placeholder="Search !">
                    <button class="item login" name="search" type="submit" >Search</button>
                </form>
                <div class="filter-bar">
                    <form action="customerFilter_hotel" method="post" class="filter-bar-link">
                        <select name="filter-link" id="filter-link" >
                            <option value="all" ${tag =="all"?"selected":""} >All</option>
                            <option value="hotel_name" ${tag =="hotel_name"?"selected":""} >A --> Z</option>
                            <option value="hotel_name desc" ${tag =="hotel_name desc"?"selected":""} >Z --> A</option>
                            <option value="price" ${tag =="price"?"selected":""} >Price from low to high </option>
                            <option value="price desc" ${tag =="price desc"?"selected":""} > Price from high to low</option>
                        </select>
                        <button class="item login" name="filter" type="submit" >Filter</button>
                    </form>
                </div>
            </div>
            <div class="travel-tutorial">
                <h1>Hotel Home</h1>
                <c:if test="${useable_hotels == null}">
                    <div class="nothing">
                        <h1 style="border-bottom: solid #181e23 2px">NO result</h1>
                    </div>
                </c:if>
                <c:forEach items="${useable_hotels}" var="hotel">
                    <div class="card">
                        <img
                            src="${hotel.img}"
                            alt=""
                            />
                        <div class="card-content">
                            <div class="card-top">

                                <h4>${hotel.hotel_name}</h4>
                                <div class="card-description">
                                    <p class="description">
                                        ${hotel.status}
                                    </p>
                                </div>
                            </div>
                            <div class="card-bottom">

                                <p class="price">${hotel.price} VND</p>
                                <a href="getHotelDetail?hid=${hotel.hotel_id}" class="book-now" ${hotel.quantity == 0?"hidden":""}  >Book now</a>
                                <c:if test="${hotel.quantity==0}">
                                    <div ><h1>Sold Out</h1> </div>                  
                                </c:if>
                            </div>
                        </div>
                    </div>
                </c:forEach>

            </div>
        </div>
        <jsp:include page="footer.jsp"></jsp:include>


    </body>
</html>