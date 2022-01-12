<%-- 
    Document   : detail
    Created on : Oct 18, 2021, 9:56:53 AM
    Author     : taola
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>TravelNow</title>
        <link rel="stylesheet" href="css/style.css" />
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

            <div class="detail">
                <h1>Tour Details </h1>
                <div class="card-detail">
                    <div class="detail-left">
                        <img
                            src="${tour.img}"
                        alt=""
                        />   
                </div>
                <div class="detail-between"></div>

                <div class="detail-right">
                    <div class="detail-right-top">
                        <h2>${tour.name}</h2>
                    </div>
                    <div class="detail-right-content">
                        ${tour.status}
                    </div>
                    <div class="detail-bottom">
                        <div class="detail-price">Price : </div>
                        <div class="detail-price2">${tour.price} VND</div>
                        <a href="hotel_home" class="book-now">Next</a>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
