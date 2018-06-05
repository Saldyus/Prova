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
@WebServlet(name = "AddMappaleServlet", urlPatterns = {"/AddMappaleServlet"})
public class AddMappaleServlet extends HttpServlet {

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
        String comune = request.getParameter("comune");
        String scatastale_s = request.getParameter("scatastale");
        String ragrario_s = request.getParameter("ragrario");
        String rdomenicale_s = request.getParameter("rdomenicale");
        String foglio_s = request.getParameter("foglio");
        String rsociale = request.getParameter("rsociale");
        String PCB_s = request.getParameter("PCB");
        String metalli_s = request.getParameter("metalli");
        String diossina_s = request.getParameter("diossina");
        
        System.out.println("rag: "+ragrario_s);
        System.out.println("id: "+ID_s);
        System.out.println("comune: "+comune);
        System.out.println("rdom: "+rdomenicale_s);
        System.out.println("scat: "+scatastale_s);
        System.out.println("foglio: "+foglio_s);
        System.out.println("rsoci: "+rsociale);

        int ID = Integer.valueOf(ID_s);
        double scatastale = Double.valueOf(scatastale_s);
        int ragrario = Integer.valueOf(ragrario_s);
        int rdomenicale = Integer.valueOf(rdomenicale_s);
        int foglio = Integer.valueOf(foglio_s);
        boolean PCB = Boolean.valueOf(PCB_s);
        boolean metalli = Boolean.valueOf(metalli_s);
        boolean diossina = Boolean.valueOf(diossina_s);
        
        try {
            Connection c = dataSource.getConnection();
            PreparedStatement ps = c.prepareStatement("INSERT INTO mappali VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            ps.setInt(1, ID);
            ps.setString(2, comune);
            ps.setDouble(3, scatastale);
            ps.setBoolean(4, diossina);
            ps.setInt(5, ragrario);
            ps.setInt(6, rdomenicale);
            ps.setInt(7, foglio);
            ps.setBoolean(8, PCB);
            ps.setBoolean(9, metalli);
            ps.setString(10, rsociale);
            ps.executeUpdate();
            
            c.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(AddMappaleServlet.class.getName()).log(Level.SEVERE, null, ex);
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
