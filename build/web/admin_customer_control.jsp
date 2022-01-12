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
                        <a href="" class="book-now">Add More</a>

                    </div>
                    <div class="card">
                        <table border="1">
                            <tr>
                                <th>Customer ID </th>
                                <th>Customer Name</th>
                                <th>Address</th>
                                <th>Phone</th>
                                <th>Number orders</th>
                                <th></th>
                            </tr>
                        <c:forEach items="${cno}" var="c">
                            <tr>
                                <td>${c.id}</td>
                                <td>${c.name}</td>
                                <td>${c.address}</td>
                                <td>${c.phone}</td>
                                <td>${c.numOrders}</td>

                                <td><a href="CNOView?cid=${c.id}" class="book-now"> View Order</a></td>

                            </tr>
                        </c:forEach>

                    </table>
                </div>
            </div>
            <div class="card-bottom">

            </div>
        </div>
    </div>
    <div class="page-index">

    </div>
</div>
</div>
</body>
</html>
