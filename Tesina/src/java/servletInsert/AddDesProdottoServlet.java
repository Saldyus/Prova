/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servletInsert;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
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
@WebServlet(name = "AddDesProdottoServlet", urlPatterns = {"/AddDesProdottoServlet"})
public class AddDesProdottoServlet extends HttpServlet {

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
        String pdf_et = request.getParameter("pdf_et");
        String pdf_ss = request.getParameter("pdf_ss");
        String pa1 = request.getParameter("pa1");
        String pa1_p_s = request.getParameter("pa1_p");
        String pa2 = request.getParameter("pa2");
        String pa2_p_s = request.getParameter("pa2_s");
        
        int pa1_p = Integer.valueOf(pa1_p_s);
        int pa2_p = Integer.valueOf(pa2_p_s);
        
        try {
            Connection c = dataSource.getConnection();
            PreparedStatement ps = c.prepareStatement("INSERT INTO des_prodotti VALUES(?, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, nome);
            ps.setString(2, pdf_et);
            ps.setString(3, pdf_ss);
            ps.setString(4, pa1);
            ps.setInt(5, pa1_p);
            ps.setString(6, pa2);
            ps.setInt(7, pa2_p);
            ps.executeUpdate();
            
            c.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(AddDesProdottoServlet.class.getName()).log(Level.SEVERE, null, ex);
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
