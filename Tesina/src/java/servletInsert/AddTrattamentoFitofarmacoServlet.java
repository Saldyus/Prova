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
@WebServlet(name = "AddTrattamentoFitofarmacoServlet", urlPatterns = {"/AddTrattamentoFitofarmacoServlet"})
public class AddTrattamentoFitofarmacoServlet extends HttpServlet {

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
        
        String campo = request.getParameter("campo");
        String fitofarmaco = request.getParameter("fitofarmaco");
        String lkg_s = request.getParameter("lkg");
        String superficie_s = request.getParameter("superficie");
        String avversita = request.getParameter("avversita");
        String firma = request.getParameter("firma");
        String operatore = request.getParameter("operatore");
        String data_s = request.getParameter("data");
        String note = request.getParameter("note");
        
        double superficie = Double.valueOf(superficie_s);
        int lkg = Integer.valueOf(lkg_s);
        Date data = Date.valueOf(data_s);
        
        try {
            Connection c = dataSource.getConnection();
            PreparedStatement ps = c.prepareStatement("INSERT INTO trfitofarmaci VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, fitofarmaco);
            ps.setDouble(2, superficie);
            ps.setInt(3, lkg);
            ps.setString(4, avversita);
            ps.setString(5, firma);
            ps.setString(6, operatore);
            ps.setString(7, note);
            ps.setDate(8, data);
            ps.setString(9, campo);
            ps.executeUpdate();
            
            c.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(AddTrattamentoFitofarmacoServlet.class.getName()).log(Level.SEVERE, null, ex);
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
