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
@WebServlet(name = "AddAnalisiServlet", urlPatterns = {"/AddAnalisiServlet"})
public class AddAnalisiServlet extends HttpServlet {

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
        String data_s = request.getParameter("data");
        String pdf = request.getParameter("pdf");
        String SO_s = request.getParameter("SO");
        String Ntot_s = request.getParameter("Ntot");
        String P2o5_s = request.getParameter("P2o5");
        String K2O_s = request.getParameter("K2O");
        String CN_s = request.getParameter("CN");
        String Sabbia_s = request.getParameter("sabbia");
        String Limo_s = request.getParameter("limo");
        String Argilla_s = request.getParameter("argilla");
        
        Date data = Date.valueOf(data_s);
        double SO = Double.valueOf(SO_s);
        int Ntot = Integer.valueOf(Ntot_s);
        int P2o5 = Integer.valueOf(P2o5_s);
        int K2O = Integer.valueOf(K2O_s);
        int CN = Integer.valueOf(CN_s);
        int Sabbia = Integer.valueOf(Sabbia_s);
        int Limo = Integer.valueOf(Limo_s);
        int Argilla = Integer.valueOf(Argilla_s);
        
        try {
            Connection c = dataSource.getConnection();
            PreparedStatement ps = c.prepareStatement("INSERT INTO analisi VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, pdf);
            ps.setInt(2, Argilla);
            ps.setDouble(3, SO);
            ps.setInt(4, Limo);
            ps.setInt(5, K2O);
            ps.setInt(6, CN);
            ps.setInt(7, Sabbia);
            ps.setInt(8, P2o5);
            ps.setInt(9, Ntot);
            ps.executeUpdate();
            
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("SELECT ID_Analisi FROM analisi ORDER BY ID_Analisi DESC");
            rs.next();
            int ID_A = rs.getInt("ID_Analisi");
            
            ps = c.prepareStatement("INSERT INTO analizzato VALUES (?, ?, ?)");
            ps.setString(1, campo);
            ps.setInt(2, ID_A);
            ps.setDate(3, data);
            ps.executeUpdate();
            
            c.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(AddAnalisiServlet.class.getName()).log(Level.SEVERE, null, ex);
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
