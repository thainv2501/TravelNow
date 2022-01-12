/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DAO;
import entity.Customer;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author taola
 */
@WebServlet(name = "customerLogin", urlPatterns = {"/customerLogin"})
public class customerLogin extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
         if (request.getParameter("login") == null) {
            request.getRequestDispatcher("customerLogin.jsp").forward(request, response);
        }
          DAO dao = new DAO();
        String cmnd = request.getParameter("cmnd");
        String phone = request.getParameter("phone");
        Customer cus = dao.loadCustomer(cmnd);

        if (cus == null) {
            String mess = "Customer Does not exist";
            request.setAttribute("mess", mess);
            request.getRequestDispatcher("customerLogin.jsp").forward(request, response);
        } else {
            if (cus.getPhone() == Integer.parseInt(phone) ) {
                HttpSession ses = request.getSession();
                ses.setAttribute("customer", cus);
                request.getRequestDispatcher("customerView").forward(request, response);
            } else {
                String mess = "Wrong Phone";
                request.setAttribute("mess", mess);
                request.getRequestDispatcher("customerLogin.jsp").forward(request, response);

            }
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        if (request.getParameter("login") == null) {
            request.getRequestDispatcher("customerLogin.jsp").forward(request, response);
        }
          DAO dao = new DAO();
        String cmnd = request.getParameter("cmnd");
        String phone = request.getParameter("phone");
        Customer cus = dao.loadCustomer(cmnd);

        if (cus == null) {
            String mess = "Customer Does not exist";
            request.setAttribute("mess", mess);
            request.getRequestDispatcher("customerLogin.jsp").forward(request, response);
        } else {
            if (cus.getPhone() == Integer.parseInt(phone) ) {
                HttpSession ses = request.getSession();
                ses.setAttribute("customer", cus);
                request.getRequestDispatcher("customerView").forward(request, response);
            } else {
                String mess = "Wrong Phone";
                request.setAttribute("mess", mess);
                request.getRequestDispatcher("customerLogin.jsp").forward(request, response);

            }
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
