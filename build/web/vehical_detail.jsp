<%-- 
    Document   : vehicalDetail
    Created on : Oct 24, 2021, 12:40:36 PM
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
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"
      integrity="sha512-SfTiTlX6kk+qitfevl/7LibUOeJWlt9rbyDn92a1DqWOw9vWG2MFoays0sgObmWazO5BQPiFucnnEAjpAB+/Sw=="
      crossorigin="anonymous"
      referrerpolicy="no-referrer"
    />
<script src="js/support_vehical.js"></script>

    </head>
    <body>
        <jsp:include page="menu.jsp"></jsp:include>

        <div class="detail">
            <h1>Vehical Details</h1>
                <div class="card-detail">
                <div class="detail-left">
                    <img
                        src="${vehical.img}"
                        alt=""
                        />   
                </div>
                <div class="detail-between">

                </div>
                <div class="detail-right">
                    <div class="detail-right-top">
                        <h2>${vehical.vehical_name}</h2>
                    </div>
                    <div class="detail-right-content">
                        <table>
                            <tr>
                                <th>Brand : </th>
                                <td>${vehical.brand_name}</td>
                            </tr>
                            
                            <tr>
                                <th>Price : </th>
                                <td>${vehical.price} VND
                                <input type="number" id="vehical_price" value=${vehical.price} hidden /></td></td>
                            </tr>
                            <tr>
                                <th>So Luong : </th>
                                <td>${vehical.quantity}</td>
                            </tr>
                            <tr>
                                <th>Danh gia : </th>
                                <td>${vehical.status}</td>
                            </tr>

                        </table>
                    </div>

                    <div class="detail-bottom">
                        <!-- <div class="detail-price">Price : </div>
                        <div class="detail-price2">$1000</div>
                        <a href="#" class="book-now">Book now</a> -->


                        <form class="buy-form" method="post" action="finish_vehical">
                            So Luong : <i class="fa fa-minus" onclick="plusMinus(-1)"></i>
                            <input type="number" id="soVeXe" name="soVeXe" placeholder="Nhap so luong" value="0" min="0" max="${vehical.quantity}" onchange="countPrice()" >
                            <i class="fa fa-plus" onclick="plusMinus(1)"></i>

                            <div id="all_vehical_price">0 VND</div>
                            <button class="item login" id="vehical_next" type="submit" disabled>Next</button>
                        </form>

                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
