<%-- 
    Document   : vehicalDetail
    Created on : Oct 24, 2021, 12:40:36 PM
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
        <jsp:include page="admin_menu.jsp"></jsp:include>

            <div class="detail">
                <h1>Vehical Infomation</h1>
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
                        <form method="POST" action="admin_edit_vehical_available">
                            <table>
                                <tr>
                                    <th>Place  :</th>
                                    <td>${vehical.place_id} - ${vehical.place_name}<input type="text" name="pid"  value="${vehical.place_id}" hidden></td>

                                </tr>
                                <tr>
                                    <th>Vehical Type :</th>
                                    <td>${vehical.vehical_id} - ${vehical.vehical_name}<input type="text" name="vid"  value="${vehical.vehical_id}" hidden></td>

                                </tr>
                                 <th>Brand :</th>
                                 <td>${vehical.brand_id} - ${vehical.brand_name}<input type="text" name="bid"  value="${vehical.brand_id}" hidden></td>

                                </tr>
                                <tr>
                                    <th>Quantity : </th>
                                    <td><input type="number" name="vquantity" min="0" value="${vehical.quantity}" required></td>
                                </tr>
                                <tr>
                                    <th>Price : </th>
                                    <td><input type="number" name="vprice" min="0" value="${vehical.price}" required> VND</td>
                                </tr>
                               
                                <tr>
                                    <th>Status</th>
                                    <td>
                                        <textarea type="text" name="vstatus" rows="5" cols="60" required >${vehical.status}
                                        </textarea>
                                    </td>
                                </tr>
                                <tr>
                                    <th>Image : </th>
                                    <td><input type="text" name="vimg" value="${vehical.img}" required></td>

                                </tr>


                            </table>
                            <button class="item login"  type="submit" >Done</button>
                        </form>

                    </div>


                </div>
            </div>
        </div>
    </div>
</body>
</html>



