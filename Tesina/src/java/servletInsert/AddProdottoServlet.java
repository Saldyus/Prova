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
 * @author Salvatore Dinaro
 */
@WebServlet(name = "AddProdottiServlet", urlPatterns = {"/AddProdottiServlet"})
public class AddProdottoServlet extends HttpServlet {

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
        
        String nome = request.getParameter("nome");
        String tipo = request.getParameter("tipo");
        String titoloN_s = request.getParameter("titoloN");
        String titoloP_s = request.getParameter("titoloP");
        String titoloK_s = request.getParameter("titoloK");
        String note = request.getParameter("note");
        String ndes = request.getParameter("ndes");
        String ragione = request.getParameter("ragione");
        String ddt_s = request.getParameter("sst");
        String data_s = request.getParameter("data");
        String lkg_s = request.getParameter("lkg");
        
        int titoloN = Integer.valueOf(titoloN_s);
        int titoloP = Integer.valueOf(titoloP_s);
        int titoloK = Integer.valueOf(titoloK_s);
        int ddt = Integer.valueOf(ddt_s);
        int lkg = Integer.valueOf(lkg_s);
        Date data = Date.valueOf(data_s);
        
        try {
            Connection c = dataSource.getConnection();
            PreparedStatement ps = c.prepareStatement("INSERT INTO prodotti VALUES (?, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, nome);
            ps.setString(2, tipo);
            ps.setInt(3, titoloN);
            ps.setInt(4, titoloK);
            ps.setInt(5, titoloP);
            ps.setString(6, note);
            ps.setString(7, ndes);
            ps.executeUpdate();
            
            ps = c.prepareStatement("INSERT INTO immagazzina VALUES (?, ?, ?, ?, ?)");
            ps.setString(1, ragione);
            ps.setString(2, nome);
            ps.setInt(3, ddt);
            ps.setDate(4, data);
            ps.setInt(5, lkg);
            ps.executeUpdate();
            
            c.close();            
        } catch (SQLException ex) {
            Logger.getLogger(AddProdottoServlet.class.getName()).log(Level.SEVERE, null, ex);
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
