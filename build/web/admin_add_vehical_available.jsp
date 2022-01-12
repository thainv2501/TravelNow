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
        <link rel="stylesheet" href="css/customer.css" />
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
                <h1>Vehical Available Infomation</h1>
                <div class="card-detail">

                    <div class="detail-right">
                        <div class="detail-right-top">
                            <h2>Fill Vehical Information</h2>
                        </div>
                        <div class="detail-right-content">
                            <p>${mess}</p>
                        <form method="POST" action="admin_add_vehical_available">
                            <table>
                                <tr>
                                    <th>Place  :</th>
                                    <td><select name="pid">
                                            <c:forEach items="${tours}" var="tour" >
                                            <option value="${tour.id}"> ${tour.id} - ${tour.name}</option>    
                                            </c:forEach>
                                        </select></td>

                                </tr>
                                <tr>
                                    <th>Vehical Type :</th>
                                    <td><select name="vid">
                                            <c:forEach items="${vehicalT}" var="vt" >
                                            <option value="${vt.typeId}"> ${vt.typeId} - ${vt.typeName}</option>    
                                            </c:forEach>
                                        </select></td>

                                </tr>
                                <th>Brand :</th>
                                <td><select name="bid">
                                            <c:forEach items="${vehicalB}" var="vb" >
                                            <option value="${vb.id}"> ${vb.id} - ${vb.name}</option>    
                                            </c:forEach>
                                        </select></td>
                                    </tr>
                                <tr>
                                    <th>Quantity : </th>
                                    <td><input type="number" name="vquantity" min="0"  required></td>
                                </tr>
                                <tr>
                                    <th>Price : </th>
                                    <td><input type="number" name="vprice" min="0" required> VND</td>
                                </tr>

                                <tr>
                                    <th>Status</th>
                                    <td>
                                        <textarea type="text" name="vstatus" rows="5" cols="60" required >
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



