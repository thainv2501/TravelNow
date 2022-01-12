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
        <jsp:include page="admin_menu.jsp"></jsp:include>

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
                        <form method="POST" action="admin_edit_tour">
                            <table>
                                <tr>
                                    <th>Order ID :</th>
                                    <td>${tour.id}<input type="text" name="tourId" value="${tour.id}" hidden></td>
                                </tr>
                                <tr>
                                    <th>Name :</th>
                                    <td><input type="text" name="tourName" value="${tour.name}" ></td>
                                </tr>
                                <tr>
                                    <th>Price : </th>
                                    <td><input type="number" name="tourPrice" min="0" value="${tour.price}" required> VND</td>
                                </tr>
                                <tr>
                                    <th>Hot : </th>
                                    <td><input type="checkbox" name="hot" value="hot" ${tour.hot?"checked":""} ></td>
                                </tr>
                                <tr>
                                    <th>Status</th>
                                    <td>
                                        <textarea type="text" name="tourStatus" rows="5" cols="60" required >${tour.status}
                                        </textarea>
                                    </td>
                                </tr>
                                <tr>
                                    <th>Image : </th>
                                    <td><input type="text" name="tourImg" value="${tour.img}" required></td>

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



