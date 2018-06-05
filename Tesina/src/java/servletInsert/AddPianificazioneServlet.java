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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
@WebServlet(name = "AddPianificazioneServlet", urlPatterns = {"/AddPianificazioneServlet"})
public class AddPianificazioneServlet extends HttpServlet {

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
        
        String ID_s = request.getParameter("ID");
        String rot1 = request.getParameter("rot1");
        String sup_rot1_s = request.getParameter("sup_rot1");
        String rot2 = request.getParameter("rot2");
        String sup_rot2_s = request.getParameter("sup_rot2");
        String rot3 = request.getParameter("rot3");
        String sup_rot3_s = request.getParameter("sup_rot3");
        String anno_s = request.getParameter("anno");
        
        int ID = Integer.valueOf(ID_s);
        double sup_rot1 = Double.valueOf(sup_rot1_s);
        double sup_rot2 = Double.valueOf(sup_rot2_s);
        double sup_rot3 = Double.valueOf(sup_rot3_s);
        int anno = Integer.valueOf(anno_s);
        
        try {
            Connection c = dataSource.getConnection();
            PreparedStatement ps = c.prepareStatement("INSERT INTO pianificazioni VALUES (?, ?, ?, ?, ?, ?)");
            ps.setString(1, rot1);
            ps.setDouble(2, sup_rot1);
            ps.setString(3, rot2);
            ps.setDouble(4, sup_rot2);
            ps.setString(5, rot3);
            ps.setDouble(6, sup_rot3);
            ps.executeUpdate();
            
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("SELECT ID_Pianificazione FROM pianificazioni ORDER BY ID_Pianificazione DESC");
            rs.next();
            int ID_P = rs.getInt("ID_Pianificazione");
            
            ps = c.prepareStatement("INSERT INTO subisce VALUES (?, ?, ?)");
            ps.setInt(1, ID);
            ps.setInt(2, ID_P);
            ps.setInt(3, anno);
            ps.executeUpdate();
            
            c.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(AddPianificazioneServlet.class.getName()).log(Level.SEVERE, null, ex);
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
