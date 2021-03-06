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
        String coltura = request.getParameter("coltura");
        String m1_3_s = request.getParameter("m1_3");
        String m1_2_s = request.getParameter("m1_2");
        String m2_3_s = request.getParameter("m2_3");
        String p_m2_s = request.getParameter("pm2");
        String note_m = request.getParameter("nmat");
        String note_s = request.getParameter("nsem");
        String data_s = request.getParameter("data");
        String campo = request.getParameter("campo");
        
        Date m1_3 = Date.valueOf(m1_3_s);        
        Date m1_2 = Date.valueOf(m1_2_s);        
        Date m2_3 = Date.valueOf(m2_3_s);        
        Date data = Date.valueOf(data_s);
        
        double p_m2 = Double.valueOf(p_m2_s);
        
        try {
            Connection c = dataSource.getConnection();
            PreparedStatement ps = c.prepareStatement("INSERT INTO semina(varieta, coltura, maturazione1_3, maturazione1_2, maturazione2_3, p_m2, note_m, note_s) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, varieta);
            ps.setString(2, coltura);
            ps.setDate(3, m1_3);
            ps.setDate(4, m1_2);
            ps.setDate(5, m2_3);
            ps.setDouble(6, p_m2);
            ps.setString(7, note_m);
            ps.setString(8, note_s);
            ps.executeUpdate();
            ps = c.prepareStatement("INSERT INTO seminato VALUES (?, ?, ?, ?)");
            ps.setString(1, campo);
            ps.setString(2, varieta);
            ps.setString(3, coltura);
            ps.setDate(4, data);
            c.close();
        } catch (SQLException ex) {
            Logger.getLogger(AddSeminaServlet.class.getName()).log(Level.SEVERE, null, ex);
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
