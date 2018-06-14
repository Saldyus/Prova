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
@WebServlet(name = "AddConcimazioneServlet", urlPatterns = {"/AddConcimazioneServlet"})
public class AddConcimazioneServlet extends HttpServlet {

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
        
        String tipo = request.getParameter("tipo");
        String qta_s = request.getParameter("qta");
        String superficie_s = request.getParameter("superficie");
        String concime = request.getParameter("concime");
        String data_s = request.getParameter("data");
        String note = request.getParameter("note");
        String campo = request.getParameter("campo");
        
        int qta = Integer.valueOf(qta_s);
        double superficie = Double.valueOf(superficie_s);
        Date data = Date.valueOf(data_s);
        int ID = getID(data);
        
        try {
            Connection c = dataSource.getConnection();
            PreparedStatement ps = c.prepareStatement("INSERT INTO concimazioni VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, tipo);
            ps.setInt(2, qta);
            ps.setDouble(3, superficie);
            ps.setString(4, concime);
            ps.setDate(5, data);
            ps.setString(6, note);
            ps.setString(7, campo);
            ps.setInt(8, ID);
            ps.executeUpdate();
            
            c.close();
        } catch (SQLException ex) {
            Logger.getLogger(AddConcimazioneServlet.class.getName()).log(Level.SEVERE, null, ex);
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

    private int getID(Date data_c) {
        int ID = 0;
        try {
            Connection c = dataSource.getConnection();
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("SELECT * from tesina.titorganica ORDER BY data desc");
            while(rs.next()){
                Date data = rs.getDate("data");
                if(data_c.getTime() >= data.getTime() && ID == 0){
                    ID = rs.getInt("ID_Titolazione");
                    break;
                }
            }
            c.close();
        } catch (SQLException ex) {
            Logger.getLogger(AddConcimazioneServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ID;
    }

}
