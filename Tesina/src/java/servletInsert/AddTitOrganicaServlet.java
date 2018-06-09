/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servletInsert;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 *
 * @author salva
 */
@WebServlet(name = "AddTitOrganicaServlet", urlPatterns = {"/AddTitOrganicaServlet"})
public class AddTitOrganicaServlet extends HttpServlet {

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
        
        String concime = request.getParameter("concime");
        String titoloN_s = request.getParameter("titoloN");
        String titoloP_s = request.getParameter("titoloP");
        String titoloK_s = request.getParameter("titoloK");
        String data_s = request.getParameter("data");
        String pdf = request.getParameter("pdf");
        
        int titoloN = Integer.valueOf(titoloN_s);
        int titoloP = Integer.valueOf(titoloP_s);
        int titoloK = Integer.valueOf(titoloK_s);
        Date data = Date.valueOf(data_s);
        
        try {
            Connection c = dataSource.getConnection();
            PreparedStatement ps = c.prepareStatement("INSERT INTO titorganica VALUES (?, ?, ?, ?, ?, ?)");
            ps.setInt(1, titoloN);
            ps.setInt(2, titoloP);
            ps.setInt(3, titoloK);
            ps.setDate(4, data);
            ps.setString(5, pdf);
            ps.setString(6, concime);
            ps.executeUpdate();
            
            c.close();
        } catch (SQLException ex) {
            Logger.getLogger(AddTitOrganicaServlet.class.getName()).log(Level.SEVERE, null, ex);
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
