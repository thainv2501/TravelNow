/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DAO;
import entity.Tours;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author taola
 */
@WebServlet(name = "admin_add_tour", urlPatterns = {"/admin_add_tour"})
public class admin_add_tour extends HttpServlet {

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
        processRequest(request, response);
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
        DAO dao = new DAO();
         request.setCharacterEncoding("UTF-8");
        Tours tour = dao.getToursFromId(request.getParameter("tourId"));
        if (tour != null) {
            request.setAttribute("mess", "This ID Existed");
            request.getRequestDispatcher("admin_add_tour.jsp").forward(request, response);
        } else {
            String tourId = request.getParameter("tourId");
            String tourName = request.getParameter("tourName");
            String status = request.getParameter("tourStatus");
            String img = request.getParameter("tourImg");
            int price = Integer.parseInt(request.getParameter("tourPrice"));
            boolean hot;
            if (request.getParameter("hot") == null) {
                hot = false;
            } else {
                hot = request.getParameter("hot").equals("hot");
            }
            dao.insertTour(tourId, tourName, status, price, img, hot);
            request.getRequestDispatcher("admin_tours").forward(request, response);
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
