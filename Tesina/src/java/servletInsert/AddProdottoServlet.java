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
        String tipo = request.getParameter("nome");
        String titoloN_s = request.getParameter("nome");
        String titoloP_s = request.getParameter("nome");
        String titoloK_s = request.getParameter("nome");
        String note = request.getParameter("nome");
        String ndes = request.getParameter("nome");
        String ragione = request.getParameter("nome");
        String ddt_s = request.getParameter("nome");
        String data_s = request.getParameter("nome");
        String lkg_s = request.getParameter("nome");
        
        int titoloN = Integer.valueOf(titoloN_s);
        int titoloP = Integer.valueOf(titoloP_s);
        int titoloK = Integer.valueOf(titoloK_s);
        int ddt = Integer.valueOf(ddt_s);
        int lkg = Integer.valueOf(lkg_s);
        Date data = Date.valueOf(data_s);
        
        try {
            Connection c = dataSource.getConnection();
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
