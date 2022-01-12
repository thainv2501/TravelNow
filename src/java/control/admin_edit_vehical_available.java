/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DAO;
import entity.Tours;
import entity.Vehical;
import entity.VehicalAdminControl;
import entity.Vehical_Brand;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Vector;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author taola
 */
@WebServlet(name = "admin_edit_vehical_available", urlPatterns = {"/admin_edit_vehical_available"})
public class admin_edit_vehical_available extends HttpServlet {

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
        DAO dao = new DAO();
        Vector<Tours> tours = dao.getAllTours();
        Vector<Vehical> vehicalT = dao.getAllVehicalType();
        Vector<Vehical_Brand> brands = dao.getAllVehicalsBrand();
        String pid = request.getParameter("pid");
        String vid = request.getParameter("vid");
        String bid = request.getParameter("bid");
        log(pid + vid + bid);
        VehicalAdminControl vehical = dao.adminGetVehicalInforById(pid, vid, bid);
        request.setAttribute("vehical", vehical);
        request.setAttribute("tours", tours);
        request.setAttribute("vehicalT", vehicalT);
        request.setAttribute("vehicalB", brands);
        request.getRequestDispatcher("admin_edit_vehical_available.jsp").forward(request, response);

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
        String pid = request.getParameter("pid");
        String vid = request.getParameter("vid");
        String bid = request.getParameter("bid");
        int vquantity = Integer.parseInt(request.getParameter("vquantity"));
        float vprice = Float.parseFloat(request.getParameter("vprice"));
        String vstatus = request.getParameter("vstatus");
        String vimg = request.getParameter("vimg");
        log(pid+"\n"+ vid+"\n" + bid +"\n        "+ vquantity+"\n"
                + vprice+"\n" + vstatus+"\n"
                + vimg);
        dao.updateVehicalAvailable(pid, vid, bid, vstatus, vquantity, vprice, vimg);
        request.getRequestDispatcher("admin_vehical_available").forward(request, response);
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
