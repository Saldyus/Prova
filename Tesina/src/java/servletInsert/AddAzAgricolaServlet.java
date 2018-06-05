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
@WebServlet(name = "AddAzAgricola", urlPatterns = {"/AddAzAgricola"})
public class AddAzAgricolaServlet extends HttpServlet {

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
        
        String RSociale = request.getParameter("RSociale");
        String CTerra = request.getParameter("CTerra");
        String anno_s = request.getParameter("anno");
        String ID_s = request.getParameter("ID");
        String quota_s = request.getParameter("quota");
        
        double quota = Double.valueOf(quota_s);
        int anno = Integer.valueOf(anno_s);
        int ID = Integer.valueOf(ID_s);
        
        try {
            Connection c = dataSource.getConnection();
            PreparedStatement ps = c.prepareStatement("INSERT INTO gterreno VALUES (?, ?)");
            ps.setString(1, RSociale);
            ps.setString(2, CTerra);
            ps.executeUpdate();
            ps = c.prepareStatement("INSERT INTO gestisce VALUES (?, ?, ?, ?)");
            ps.setString(1, RSociale);
            ps.setInt(2, ID);
            ps.setInt(3, anno);
            ps.setDouble(4, quota);
            ps.executeUpdate();
            c.close();          
        } catch (SQLException ex) {
            Logger.getLogger(AddAzLiquamiServlet.class.getName()).log(Level.SEVERE, null, ex);
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
