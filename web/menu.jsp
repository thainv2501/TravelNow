<%-- 
    Document   : menu
    Created on : Oct 6, 2021, 10:22:21 AM
    Author     : taola
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<header>
    <nav class="menu-top">
        <div class="logo">

            <a href="homepage.jsp"><img class="LogoTN" src="images/LogoTN.jpg" alt="" /></a>
        </div>
        <div class="menu">
            <a href="travelTutorial">Travel Tutorial</a>
            <a href="#">Travel Idea</a>
            <a href="#">Create Junior</a>
            <a href="#footer">About</a>
            <a href="#footer">Support</a>
        </div>
        <div class="signUp-login">
            <a class="login" href="customerLogin.jsp" ${customer==null?"":"hidden"}>View Order</a>
            <a class="signUp" href="customerSignUp" ${customer==null?"hidden":""}>Log out</a>

    </nav>
</header>

