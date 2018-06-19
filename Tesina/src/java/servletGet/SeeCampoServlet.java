/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servletGet;

import com.google.gson.Gson;
import database.campo;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
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
@WebServlet(name = "SeeCampoServlet", urlPatterns = {"/SeeCampoServlet"})
public class SeeCampoServlet extends HttpServlet {

    @Resource(name = "java:app/jdbc/TesinaR")
    private DataSource dataSource;
    
    Gson g;

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
        
        List<campo> campi = getCampi();
        
        g = new Gson();
        
        String json = "{\"campi\":" + g.toJson(campi) +"}";
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(json);        
    }

    private List<campo> getCampi(){
        List<campo> campi = new ArrayList<>();
        
        try {
            Connection c = dataSource.getConnection();
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM campo");
            while(rs.next()){
                String nome = rs.getString("nome");
                String zona = rs.getString("zona");
                int UPA = rs.getInt("UPA");
                double superficie = rs.getDouble("superficie");
                campo cp = new campo(nome, zona, UPA, superficie);
                campi.add(cp);
            }
            c.close();
        } catch (SQLException ex) {
            Logger.getLogger(SeeCampoServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        return campi;
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
