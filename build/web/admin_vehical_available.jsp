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
                    <h1>Vehical Available</h1>
                    <div class="tool">
                        <form action="">
                            <input class="item" id="cus-place" type="text" placeholder="Search !">
                            <button class="item login" type="submit" >Search</button>
                        </form>
                        <a href="admin_add_vehical_available" class="book-now">Add More</a>

                    </div>
                <c:forEach items="${vehicalA}" var="vehical">
                    <div class="card">
                        <div>
                            <img
                                src="${vehical.img}"
                                alt=""
                                />
                        </div>
                        <div class="card-content">
                            <div class="card-top">
                                <h4>${vehical.vehical_name}</h4>
                                <div class="card-description">
                                    <table>
                                        <tr>
                                            <th>Type ID :</th>
                                            <td>${vehical.vehical_id}</td>
                                        </tr>
                                        <tr>
                                            <th>Brand :</th>
                                            <td>${vehical.brand_id} - ${vehical.brand_name} </tr>
                                        </tr>
                                        <tr>
                                            <th>Quantity :</th>
                                            <td>${vehical.quantity}</td>
                                        </tr>
                                        <tr>
                                            <th>Price :</th>
                                            <td>${vehical.price}</td>
                                        </tr>
                                        <tr>
                                            <th>Place ID :</th>
                                            <td>${vehical.place_id}</td>
                                        </tr>
                                        <tr>
                                            <th>Place Name :</th>
                                            <td>${vehical.place_name}</td>
                                        </tr>
                                        <tr >
                                            <th>Status :</th>
                                            <td>${vehical.status}</td>
                                        </tr>

                                    </table>
                                </div>
                            </div>
                            <div class="card-bottom">
                                <a  href="admin_edit_vehical_available?pid=${vehical.place_id}&vid=${vehical.vehical_id}&bid=${vehical.brand_id}">Edit</a>
                                 <a  href="admin_delete_vehical_available?pid=${vehical.place_id}&vid=${vehical.vehical_id}&bid=${vehical.brand_id}">Delete</a>
                            </div>
                        </div>
                    </div>
                </c:forEach>
                <div class="page-index">

                </div>
            </div>
        </div>
    </body>
</html>
