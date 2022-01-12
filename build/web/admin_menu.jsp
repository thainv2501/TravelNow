<%-- 
    Document   : admin_menu
    Created on : Oct 28, 2021, 8:48:20 PM
    Author     : taola
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
   <header>
      <nav class="menu-top">
       <div class="logo">
            <a href="admin_home.jsp"><img class="LogoTN" src="images/LogoTN.jpg" alt="" /></a>
        </div>
        <div class="menu-top-right">Hello ${user.account}</div>
        <a href="signOut">Sign Out</a>
      </nav>
    </header>
