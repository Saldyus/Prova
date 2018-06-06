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
@WebServlet(name = "AddRaccoltoServlet", urlPatterns = {"/AddRaccoltoServlet"})
public class AddRaccoltoServlet extends HttpServlet {

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
        String data_s = request.getParameter("");
        String ordine = request.getParameter("");
        String coltura = request.getParameter("");
        String superficie_s = request.getParameter("");
        String gli_verde_s = request.getParameter("");
        String umidita_s = request.getParameter("");
        String stoccaggio = request.getParameter("");
        
        Date data = Date.valueOf(data_s);
        int superficie = Integer.valueOf(superficie_s);
        int gli_verde = Integer.valueOf(gli_verde_s);
        int umidita = Integer.valueOf(umidita_s);
        
        try {
            Connection c = dataSource.getConnection();
            PreparedStatement ps = c.prepareStatement("INSERT INTO raccolti VALUES (?, ?, ?, ?, ?, ?)");
            ps.setString(1, ordine);
            ps.setString(2, coltura);
            ps.setInt(3, superficie);
            ps.setInt(4, gli_verde);
            ps.setString(5, stoccaggio);
            ps.setInt(6, umidita);
            ps.executeUpdate();
            
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("SELECT ID_Raccolta FROM raccolti ORDER BY ID_Raccolta DESC");
            rs.next();
            int ID_R = rs.getInt("ID_Raccolti");
            
            ps = c.prepareStatement("INSERT INTO raccolta VALUES (?, ?, ?)");
            ps.setString(1, campo);
            ps.setInt(2, ID_R);
            ps.setDate(3, data);
            c.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(AddRaccoltoServlet.class.getName()).log(Level.SEVERE, null, ex);
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
