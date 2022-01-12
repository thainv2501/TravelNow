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
            <h1>Order Infomation</h1>
                <div class="card-detail">
                <div class="detail-left">
                    <img
                        src="${tour.img}"
                        alt=""
                        />   
                </div>
                <div class="detail-between">

                </div>
                <div class="detail-right">
                    <div class="detail-right-top">
                        <h2>${tour.name}</h2>
                    </div>
                    <div class="detail-right-content">
                        <table>
                            <tr>
                                <th>Tour Price : </th>
                                <td>${tour.price} VND</td>
                            </tr>
                            <tr>
                                <th>Vehical Type : </th>
                                <td>${vehical.vehical_name}</td>
                            </tr>
                            <tr>
                                <th>Brand name : </th>
                                <td>${vehical.brand_name}</td>
                            </tr>
                            <tr>
                                <th>Vehical tickets : </th>
                                <td>${so_ve_xe} </td>
                                 <th>Vehical Price : </th>
                                <td>${vehical.price*so_ve_xe} VND
                            </tr>
                          
                            <tr>
                                <th>Hotel :  </th>
                                <td>${hotel.hotel_name}</td>
                            </tr>
                            <tr>
                                <th>So Luong Phong : </th>
                                <td>${so_luong_phong}</td>
                                <th>Hotel Price : </th>
                                <td>${so_luong_phong*hotel.price} VND
                            </tr>
                            
                            <tr>
                                <th>Total Tour Price : </th>
                                <td>${so_luong_phong*hotel.price + vehical.price*so_ve_xe + tour.price } VND
                            </tr>
                            <tr>
                                <th>CMND  :</th>
                                <td>${customer.id} 
                                <th>Full Name :  </th>
                                <td>${customer.name} 
                            </tr>
                            
                            

                        </table>
                    </div>

                    <div class="detail-bottom">
                        <!-- <div class="detail-price">Price : </div>
                        <div class="detail-price2">$1000</div>
                        <a href="#" class="book-now">Book now</a> -->


                        <form class="buy-form" method="post" action="order_infor">
                            Start Date : <input type="date" name="startDate" min="${currentDate}" value="${currentDate}" required>
                            <button class="item login"  type="submit" >Done</button>
                        </form>

                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
