/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servletInsert;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 *
 * @author Salvatore Dinaro
 */
@WebServlet(name = "AddSeminaServlet", urlPatterns = {"/AddSeminaServlet"})
public class AddSeminaServlet extends HttpServlet {

    @Resource(name = "java:app/jdbc/TesinaR")
    private DataSource dataSource;

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
        
        String varieta = request.getParameter("varieta");
        String coltura = request.getParameter("varieta");
        String m1_3_s = request.getParameter("varieta");
        String m1_2_s = request.getParameter("varieta");
        String m2_3_s = request.getParameter("varieta");
        String p_m2_s = request.getParameter("varieta");
        String note_m = request.getParameter("varieta");
        String note_s = request.getParameter("varieta");
        String data_s = request.getParameter("varieta");
        
        Date m1_3 = Date.valueOf(m1_3_s);        
        Date m1_2 = Date.valueOf(m1_2_s);        
        Date m2_3 = Date.valueOf(m2_3_s);        
        Date data = Date.valueOf(data_s);        
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
